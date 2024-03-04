import { BrowserRouter, Route, Router } from "react-router-dom";
import "./App.css";
import BlogListApp from "./UI/Home/BlogListApp";
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div>
      <BrowserRouter>
      <BlogListApp/>
      
      </BrowserRouter>
      {/* <BrowserRouter>
        <Router>
          <Route path="/" element={<BlogListApp />} />
          <Route path="/create" element={<BlogListApp />} />
        </Router>
      </BrowserRouter> */}
    </div>
  );
}

export default App;
