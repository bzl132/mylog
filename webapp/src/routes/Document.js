import React from 'react';
import { connect } from 'dva';
import Header from '../components/MainLayout/MainLayout.js';
import Documents from '../components/Document/Document.js';

const Document = ({
  location,
}) => {
  return (
    <div>
      <Header location={location} />
      <Documents />
    </div>
  );
};

export default connect()(Document);
