import React from 'react';
import './App.css';

import Timer from "./Timer";
import LeaderBoardList from "./LeaderBoardList";


function App() {
  return (

    <div className="App">
      <header className="App-header">
          <h1>Leader Board</h1>
          <LeaderBoardList/>
          <Timer/>
      </header>
    </div>
  );
}

export default App;
