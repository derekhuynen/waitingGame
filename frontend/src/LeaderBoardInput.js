import React from 'react';
import axios from 'axios';

export default class LeaderBoardInput extends React.Component {
    state = {
        user: '',
    }

    handleChange = event => {
        this.setState({ user: event.target.value });
    }

    handleSubmit = event => {
        event.preventDefault();

        const LeaderBoard = {
            user: this.state.user,
            score: 0
        };

        axios.post(`http://localhost:8080/api/LeaderBoard`, {
            user: this.state.user,
            score: 0
        }, {
            headers: {
                "Content-Type": "application/json"
            }})
            .then(res => {
                console.log(res);
                console.log(res.data);
            })
    }

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <label>
                        Person Name:
                        <input type="text" name="user" onChange={this.handleChange} />
                    </label>
                    <button type="submit">Add</button>
                </form>
            </div>
        )
    }
}