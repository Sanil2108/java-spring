import * as React from 'react';
import ReactDOM from 'react-dom';

class App extends React.Component {

    render() {
        return <h1>You are in react!</h1>;
    }

}

ReactDOM.render(<App></App>, document.getElementById("react-root"))