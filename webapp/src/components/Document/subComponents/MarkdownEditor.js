import React from 'react';
import CodeMirror from 'react-codemirror';
import 'codemirror/lib/codemirror.css';
import Style from '../Document.css';

const MarkDownEditor = ({
  value,
  onChange,
}) => {
  return (
    <div className={Style.editor}>
      <CodeMirror
        mode="markdown"
        theme="monokai"
        value={value}
        onChange={code => onChange(code)}
      />
    </div>
  );
};

export default MarkDownEditor;
