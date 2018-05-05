import React from 'react';
import { connect } from 'dva';
import ResultDoc from './subComponents/ResultDoc.js';
import MarkDownEditor from './subComponents/MarkdownEditor.js';

const Document = ({
  dispatch,
  markdownSource,
  mode,
}) => {
  function textChange(text) {
    dispatch({
      type: 'document/cache',
      payload: {
        markdownSource: text,
      },
    });
  }

  return (
    <div>
      <MarkDownEditor value={markdownSource} onChange={textChange} />
      <ResultDoc markdownSource={markdownSource} htmlMode={mode} />
    </div>
  );
};

function mapStateToProps(state) {
  const { document: { markdownSource, mode } } = state;
  return {
    markdownSource,
    mode,
  };
}

export default connect(mapStateToProps)(Document);
