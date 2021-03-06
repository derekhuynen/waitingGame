import React, {Component} from "react";
import LeaderBoardList from "./LeaderBoardList";
import axios from 'axios';


class Timer extends Component {
  constructor(props) {
    super(props);
    this.state = { score: 0, user: '', persons: []};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  tick() {
    this.setState(state => ({
      score: state.score + 1
    }));
  }

  componentDidMount() {
    this.interval = setInterval(() => this.tick(), 1000);
  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }

  render() {
    return (
        <div className="Timer">
          <header className="Timer-header">
            <h1>
              Points: {this.state.score}
            </h1>
            <form onSubmit={this.handleSubmit}>

              <input
                  onChange={this.handleChange}
                  value={this.state.user}
              />
              <label>Enter Name</label>
              <button
                  type={"submit"}
              >
                Submit Score
              </button>
            </form>
          </header>
          &nbsp;&nbsp;&nbsp;
        </div>
    );
  }


  handleChange(e) {
    this.setState({ user: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    if (this.state.user.length === 0) {
      return;
    }

    axios.post(`http://localhost:8080/api/LeaderBoard`, {  user: this.state.user,
      score: this.state.score })
        .then(res => {
          console.log(res);
          console.log(res.data);
          window.location.reload(false);
        })

  }
}

export default Timer;

