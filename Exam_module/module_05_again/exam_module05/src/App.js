import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './UI/Home';
import Create from './UI/Create';
import "react-toastify/dist/ReactToastify.css";
import Edit from './UI/Edit';



function App() {
  return (
    <div>
     <BrowserRouter>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/create' element={<Create/>}/>
        <Route path='/edit/:id' element={<Edit/>}/>
      </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
