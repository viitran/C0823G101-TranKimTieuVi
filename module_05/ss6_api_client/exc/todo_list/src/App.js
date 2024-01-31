import "./App.css";
import CreateList from "./Components/CreateToDoList";
import ToDoList from "./Components/List";
import { NavLink, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div>
      <NavLink to="/">Home</NavLink>
      <br />
      <NavLink to="/create" className="ms-2">
        Create
      </NavLink>
      <Routes>
        <Route path="/" element={<ToDoList />}></Route>
        <Route path="/create" element={<CreateList />}></Route>
      </Routes>
    </div>
  );
}

export default App;
