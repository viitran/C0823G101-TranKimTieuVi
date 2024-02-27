import {Component} from 'react';
import './App.css';
import Expand from './Components/ExpandCollapse';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isExpand: false,
    };
  }

  open = () => {
    this.setState({
      isExpand: true,
    });
  };

  close = () => {
    this.setState({
      isExpand: false,
    });
  };

  render() {
    let content;
    let button;
    if (!this.state.isExpand) {
      button = <button onClick={this.open}>Mở giới thiệu</button>;
      return (
        <div>
          <h1>Conditional Rendenring</h1>
          {button}
        </div>
      );
    } else {
      content = <Expand />;
      button = <button onClick={this.close}>Đóng giới thiệu</button>;
      return (
        <div>
          <h1>Conditional Rendenring</h1>
          {button}
          {content}
        </div>
      );
    }
  }
}

export default App;
