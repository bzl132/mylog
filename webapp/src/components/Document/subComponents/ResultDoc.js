import React from 'react';
import { connect } from 'dva';
import Markdown from 'react-markdown';
import CodeBlock from './CodeBlock.js';
import Style from '../Document.css';


const ResultDoc = ({
  markdownSource,
  htmlMode,
}) => {
  return (
    <div className={Style.result}>
      <Markdown
        source={markdownSource}
        skipHtml={htmlMode === 'skip'}
        escapeHtml={htmlMode === 'escape'}
        renderers={{ code: CodeBlock }}
      />
    </div>
  );
};

function mapStateToProps() {
  return {
  };
}

export default connect(mapStateToProps)(ResultDoc);
