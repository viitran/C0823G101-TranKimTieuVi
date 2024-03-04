import "./App.css";
import Home from "./UI/Home";
import { Routes, Route } from "react-router-dom";
import Create from "./UI/create/Create";
import EditApp from "./UI/edit/Edit";
function App() {
  return (
    <div>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/create" element={<Create/>} />
          <Route path="/edit/:id" element={<EditApp/>} />
        </Routes>
        </div>
  );
}

export default App;
