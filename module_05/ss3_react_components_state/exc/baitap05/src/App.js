import './App.css';
import CreateBlog from './UI/create/CreateBlog';
import EditBlog from './UI/edit/EditBlog';
import BlogList from './UI/home/BlogList';
import { Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div >
      <Routes>
        <Route path="/" element={<BlogList />}></Route>
        <Route path="/create" element={<CreateBlog />}></Route>        
        <Route path="/edit/:id" element={<EditBlog />}></Route>        
      </Routes>
    </div>
  );
}

export default App;
