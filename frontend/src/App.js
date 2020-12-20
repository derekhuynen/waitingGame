import logo from './logo.svg';
import './App.css';
import Timer from "./Timer";


function App() {
  return (

    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Timer/>
      </header>
    </div>
  );
}

export default App;
