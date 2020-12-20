import React from 'react';

import axios from 'axios';


class LeaderBoardList extends React.Component {
    state = {
        persons: []
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/api/LeaderBoard`)
            .then(res => {
                console.log(res)
                this.setState({ persons: res.data });
            })
    }

    render() {
        return (
            <ol>
                { this.state.persons.sort(function(a,b){return b.score - a.score}).slice(0,10).map(person => <li>{person.user}: {person.score}</li>)}
            </ol>
        )
    }
}

export default LeaderBoardList;
