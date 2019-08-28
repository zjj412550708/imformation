import React, { Component } from "react";
import Info from "./info";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      test: "人员信息"
    };
  }
  render() {
    return (
      <div>
        <h1>{this.state.test}</h1>
        <hr />
        <Info />
      </div>
    );
  }
}
export default App;
