import { NavLink, Route, Routes } from "react-router-dom";
import "./App.css";
import LibraryApp from './UI/Book/LibraryApp';

function App() {
  return (
    <div>
      <div>
        <NavLink to="/">Home</NavLink>
      </div>
      <div>
        <NavLink to="/create">Create</NavLink>
      </div>
      <Routes>
        <Route path="/" element={<LibraryApp/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
