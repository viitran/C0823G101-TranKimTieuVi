import './App.css';
import { BookCreate } from './Components/AddBook';
import BookUpdate from './Components/Edit';
import ListBook from './Components/List';
import {NavLink,Routes,Route} from 'react-router-dom';


function App() {
  return (
    <div>
      <NavLink to="/" >Home</NavLink>
      <br/>
      <NavLink to="/create" >Add New Book</NavLink>
        <Routes>
          <Route path = '/' element={< ListBook/>}></Route>
          <Route path = '/create' element={< BookCreate/>}></Route> 
          <Route path = '/edit/:id' element={< BookUpdate/>}></Route> 
        </Routes>
      
    </div>
  );
}

export default App;
