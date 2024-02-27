import { NavLink, Route, Routes } from "react-router-dom";
import "./App.css";
import LibraryApp from './UI/Book/LibraryApp';
import BookCreate from "./UI/Book/create/CreateBookApp";

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
        <Route path="/create" element={<BookCreate/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
