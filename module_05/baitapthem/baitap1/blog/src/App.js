import { Route, Routes } from "react-router-dom";
import "./App.css";

import 'bootstrap/dist/css/bootstrap.min.css';
import BodyApp from "./UI/Body/Body";
import BlogListApp from './UI/Home/BlogListApp';
import UpdateBlogApp from "./UI/Edit/UpdateBlog";
import CreateBlogApp from "./UI/Create/CreateBlog";

function App() {
  return (
    <div>
      {/* <BrowserRouter>
      <BodyApp/>
      
      </BrowserRouter> */}
        <Routes>
          <Route path="/" element={<BodyApp />} />
          <Route path="/create" element={<CreateBlogApp />} />
          <Route path="/edit/:id" element={<UpdateBlogApp />} />
          <Route path="/charts" element={<BodyApp />} />
        </Routes>
    </div>
  );
}

export default App;
