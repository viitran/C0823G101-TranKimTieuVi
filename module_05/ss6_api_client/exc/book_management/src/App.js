import "./App.css";
import { NavLink, Routes, Route } from "react-router-dom";
import ListBook from "./UI/Library/LibraryApp";
import { BookCreate } from './UI/Library/create/CreateBookApp';
import BookUpdate from './UI/Library/Edit/EditBookApp';

function App() {
  return (
    <div>
      <NavLink to="/">Home</NavLink>
      <br />
      <NavLink to="/create">Add New Book</NavLink>
      <Routes>
        <Route path="/" element={<ListBook />}></Route>
        <Route path="/create" element={<BookCreate />}></Route>
        <Route path="/edit/:id" element={<BookUpdate />}></Route>
      </Routes>
    </div>
  );
}

export default App;
