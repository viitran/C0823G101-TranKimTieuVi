import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import PitchHome from "./ui/PitchHome";
import CreateNewPitch from "./ui/CreateNewPitch";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<PitchHome />} />
        <Route path="/create" element={<CreateNewPitch />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
