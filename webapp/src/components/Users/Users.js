import React from 'react';
import { connect } from 'dva';
import { routerRedux } from 'dva/router';
import { Row, Col, Table, Pagination, Popconfirm, Button } from 'antd';
import styles from './Users.css';
import UserModal from './UserModal';
import { PAGE_SIZE } from '../../constants';

const Users = ({
  dispatch,
  list: dataSource,
  loading,
  total,
  page: current }) => {
  function deleteHandler(id) {
    dispatch({
      type: 'users/remove',
      payload: id,
    });
  }

  function pageChange(page) {
    dispatch(routerRedux.push({
      pathname: '/users',
      query: { page },
    }));
  }

  function editHandler(id, values) {
    dispatch({
      type: 'users/patch',
      payload: { id, values },
    });
  }

  function createHandler(values) {
    dispatch({
      type: 'users/create',
      payload: values,
    });
  }

  const columns = [
    {
      title: '用户名',
      dataIndex: 'userName',
      key: 'userName',
      render: text => <a href="">{text}</a>,
    },
    {
      title: '邮箱',
      dataIndex: 'email',
      key: 'email',
    },
    {
      title: '操作',
      key: 'operation',
      render: (text, record) => (
        <span className={styles.operation}>
          <UserModal record={record} onOk={editHandler.bind(null, record.id)}>
            <a>编辑</a>
          </UserModal>
          <Popconfirm title="Confirm to delete?" onConfirm={deleteHandler.bind(null, record.id)}>
            <a href="">删除</a>
          </Popconfirm>
        </span>
      ),
    },
  ];

  return (
    <div className={styles.normal}>
      <div>
        <div>
          <Row>
            <Col span={6}>搜索</Col>
            <Col span={6}>搜索</Col>
          </Row>
        </div>
        <div className={styles.create}>
          <Row type="flex" justify="end" algin="bottom">
            <Col span="3">
              <UserModal record={{}} onOk={createHandler}>
                <Button type="primary">新增</Button>
              </UserModal>
            </Col>
          </Row>
        </div>
        <Table
          columns={columns}
          loading={loading}
          dataSource={dataSource}
          rowKey={record => record.id}
          pagination={false}
        />
        <Pagination
          showQuickJumper
          defaultCurrent={1}
          className="ant-table-pagination"
          total={total}
          current={current}
          pageSize={PAGE_SIZE}
          onChange={pageChange}
        />
      </div>
    </div>
  );
};
function mapStateToProps(state) {
  const { list, total, page } = state.users;
  return {
    loading: state.loading.models.users,
    list,
    total,
    page,
  };
}

export default connect(mapStateToProps)(Users);
