import React from 'react';



class LeaderBoard extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            persons: props.persons
        }
    }

    render() {
        return (
            <ol>
                { this.state.persons.sort(function(a,b){return b.score - a.score}).slice(0,10).map(person => <li>{person.user}: {person.score}</li>)}
            </ol>
        )
    }
}

export default LeaderBoard;
