import "./App.css";
import Home from "./UI/Home";
import { Route,Routes } from "react-router-dom";
import Create from "./UI/create/Create";
import Edit from "./UI/edit/Edit";
function App() {
  return (
    <div>
      <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/create" element={<Create />} />
      <Route path="/edit/:id" element={<Edit />} />
      </Routes>
    </div>
  );
}

export default App;
