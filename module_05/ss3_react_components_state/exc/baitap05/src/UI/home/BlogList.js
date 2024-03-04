import { useEffect, useState } from "react";
import { findAll, remove } from "../../Services/BlogServices";
import { Link, Navigate, useNavigate } from "react-router-dom";
import Button from "react-bootstrap/Button";
import { ToastContainer, Bounce } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import DeleteModal from "./DeleteModal";
import SearchIcon from "@mui/icons-material/Search";
import SwapVertIcon from "@mui/icons-material/SwapVert";
// -------------
const initSearchParams = {
  title: "",
  sortTitle: "asc",
};

function BlogList() {
  const [show, setShow] = useState(false);
  const [blogs, setBlogs] = useState([]);
  const [post, setPost] = useState();
  const [searchParams, setSearchParam] = useState(initSearchParams);
  const navigate = useNavigate();


  const handleSortTitle = () => {
    if (searchParams.sortTitle === "asc") {
      setSearchParam({ ...searchParams, sortTitle: "desc" });
    } else {
      setSearchParam({ ...searchParams, sortTitle: "asc" });
    }
    const sort = {
      ...searchParams,
      sortTitle: searchParams.sortTitle === "asc" ? "desc" : "asc",
    };
    getAll(sort);
  };

  const getAll = (param) => {
    findAll(param).then((result) => {
      console.log(result);
      setBlogs(result);
    });
  };

  useEffect(() => {
    getAll(searchParams);
  }, [searchParams]);

  const handleNavigateCreatePost = () => {
    navigate("/create");
  };

  const handleShowModalDelete = (blog) => {
    setPost(blog);
    setShow(true);
  };

  const handleDelete = () => {
    remove(post.id).then((res) => {
      getAll(searchParams);
    });
  };

  const handleSearchChange = (e) => {
    const { name, value } = e.target;
    setSearchParam({ ...blogs, [name]: value });
  };
  const handleSearch = () => {
    getAll(searchParams);
  };
  
  return (
    <>
      <div className="display">
        <div className="col-lg-1"></div>
        <div className="col-lg-10">
          <h3 style={{ textAlign: "center" }}> List Posts</h3>
          <div className="display">
            {" "}
            <div className="col-lg-9">
              <button
                onClick={handleNavigateCreatePost}
                style={{ backgroundColor: "#dfe3bc", border: "none" }}
              >
                + Add
              </button>
            </div>
            <div className="col-lg-3">
              <input type="text" name="title" onChange={handleSearchChange} />{" "}
              <button
                style={{ border: "none", backgroundColor: "#dfe3bc" }}
                onClick={handleSearch}
              >
                <SearchIcon />
              </button>
            </div>
          </div>
          <table className="table table-hover">
            <thead>
              <tr>
                <th style={{ background: "rgb(75 85 99)", color: "white" }}>
                  ID
                </th>
                <th
                  style={{ background: "rgb(75 85 99)", color: "white" }}
                  onClick={handleSortTitle}
                >
                  Title <SwapVertIcon />
                </th>
                <th style={{ background: "rgb(75 85 99)", color: "white" }}>
                  Category
                </th>
                <th style={{ background: "rgb(75 85 99)", color: "white" }}>
                  Time
                </th>
                <th style={{ background: "rgb(75 85 99)", color: "white" }}>
                  Actions
                </th>
              </tr>
            </thead>
            <tbody>
              {blogs.map((blog, index) => (
                <tr key={blog.id}>
                  <th>{index + 1}</th>
                  <td style={{ color: "#3880f6" }}>{blog.title}</td>
                  <td>{blog.category}</td>
                  <td>{blog.updatedAt}</td>
                  <td>
                    <Link to={`edit/${blog.id}`}>
                      <Button variant="dark">Edit</Button>
                    </Link>{" "}
                    <Link>
                      <Button
                        variant="danger"
                        onClick={() => handleShowModalDelete(blog)}
                      >
                        Delete
                      </Button>
                    </Link>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
         

          {post && (
            <DeleteModal
              show={show}
              setShow={setShow}
              onDeleteHandler={handleDelete}
              title={post.title}
            />
          )}
          <ToastContainer
            position="top-right"
            autoClose={5000}
            hideProgressBar={false}
            newestOnTop={false}
            closeOnClick
            rtl={false}
            pauseOnFocusLoss
            draggable
            pauseOnHover
            theme="dark"
            transition={Bounce}
          />
        </div>
        <div className="col-lg-1"></div>
      </div>
    </>
  );
}
export default BlogList;
