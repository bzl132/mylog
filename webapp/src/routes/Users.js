import React from 'react';
import { connect } from 'dva';
import styles from './Users.css';
import UsersComponent from '../components/Users/Users';
import Header from '../components/MainLayout/MainLayout.js';

function Users({ location }) {
  return (
    <div className={styles.normal}>
      <Header location={location} />
      <UsersComponent />
    </div>
  );
}

export default connect()(Users);
