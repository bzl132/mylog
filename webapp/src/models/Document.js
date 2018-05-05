import * as docService from '../services/Document.js';

const initSource = '';
const initMode = 'raw';
const initState = {
  markdownSource: initSource,
  mode: initMode,
};
export default {
  namespace: 'document',
  state: initState,
  reducers: {
    doc(state, { payload: { markdownSource, mode } }) {
      return { ...state, markdownSource: markdownSource || initSource, mode: mode || initMode };
    },
  },
  effects: {
    *fetch({ payload: { page = 1 } }, { call, put }) {
      const { markdownSource, mode } = yield call(docService.fetch, { page });
      yield put({
        type: 'doc',
        payload: {
          markdownSource,
          mode,
        },
      });
    },
    *cache({ payload }, { put }) {
      yield put({
        type: 'doc',
        payload,
      });
    },
  },
  subscriptions: {
    setup({ dispatch, history }) {
      return history.listen(({ pathname, payload }) => {
        if (pathname === '/doc') {
          dispatch({ type: 'cache', payload: payload || initState });
        }
      });
    },
  },
};
