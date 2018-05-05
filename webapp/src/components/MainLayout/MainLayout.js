import React from 'react';
import { Menu, Icon } from 'antd';
import { Link } from 'dva/router';
import Style from './Layout.css';

function Header({ location }) {
  return (
    <div className={Style.leftNav}>
      <Menu
        selectedKeys={[location.pathname]}
        mode="inline"
        theme="dark"
      >
        <Menu.Item key="/">
          <Link to="/"><Icon type="home" />首页</Link>
        </Menu.Item>
        <Menu.Item key="/users">
          <Link to="/users"><Icon type="bars" />Users</Link>
        </Menu.Item>
        <Menu.Item key="/doc">
          <Link to="/doc"><Icon type="bars" />文档</Link>
        </Menu.Item>
      </Menu>
    </div>
  );
}

export default Header;
