import request from '../utils/request';
import { PAGE_SIZE } from '../constants';

export function fetch({ page }) {
  return request(`/user/list.json?pageNo=${page}&pageSize=${PAGE_SIZE}`);
}

export function remove(id) {
  return request(`/user/del.json?id=${id}`, {
    method: 'POST',
  });
}

export function patch(values) {
  return request('/user/save.json', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      Accept: 'application/json',
    },
    body: JSON.stringify(values),
  });
}
export function create(values) {
  return request('/user/save.json', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      Accept: 'application/json',
    },
    body: JSON.stringify(values),
  });
}
