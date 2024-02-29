import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Bounce, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import Button from "react-bootstrap/Button";
import { remove } from "../Services/PostService.js";
import { findAll } from "../Services/PostService.js";
import DeleteIcon from "@mui/icons-material/Delete";
import EditIcon from "@mui/icons-material/Edit";
import AddIcon from "@mui/icons-material/Add";
import DeleteModal from "./DeleteModal.js";

const initSearchParams = {
  title: "",
};

function Home() {
  const [show, setShow] = useState(false);
  const [posts, setPosts] = useState([]);
  const [idDelete, setIdDelete] = useState();
  const navigate = useNavigate();
  
  const [searchParam, setSearchParam] = useState(initSearchParams);

  const getAll = async (param) => {
   findAll(param).then((res) => setPosts(res));
  };
  
  useEffect(() => {
    getAll(searchParam);
  }, []);

  const handleShowModalDelete = (id) => {
    setIdDelete(id);
    setShow(true);
  };

  const onDeleteHandler = () => {
    remove(idDelete).then((res) => {
      findAll();
    });
  };
  const handleNavigateCreatePost = () => {
    navigate("/create");
  };

  const handleSearchChange = (e) => {
    const { name, value } = e.target;
    console.log({ ...searchParam, [name]: value });
    setSearchParam({ ...searchParam, [name]: value });
  }
  const handleSearch = () => {
    console.log(searchParam);
    getAll(searchParam);
  };

  if (!posts) return <div>loading...</div>;


  return (
    <>
      <div className="display">
        <div className="col-lg-2"></div>
        <div className="col-lg-8">
          <h3 style={{ textAlign: "center" }}> List Posts</h3>
          <div className="display">
            {" "}
            <div className="col-lg-9">
              <button
                onClick={handleNavigateCreatePost}
                style={{ backgroundColor: "#dfe3bc", border: "none" }}
              >
                <AddIcon /> Add{" "}
              </button>
            </div>
            <div className="col-lg-3">
              <input
                type="text"
                name="title"
                onChange={handleSearchChange}
              />
              <button onClick={handleSearch}>Search</button>
            </div>
          </div>
          <table className="table table-hover">
            <thead>
              <tr>
                <th style={{ background: "#b4b3b3" }}>ID</th>
                <th style={{ background: "#b4b3b3" }}>Title</th>
                <th style={{ background: "#b4b3b3" }}>Category</th>
                <th style={{ background: "#b4b3b3" }}>Time</th>
                <th style={{ background: "#b4b3b3" }}>Action</th>
              </tr>
            </thead>
            <tbody>
              {posts.map((post, index) => (
                <tr key={post.id}>
                  <th>{index+1}</th>
                  <td>{post.title}</td>
                  <td>{post.category}</td>
                  <td>{post.updatedAt}</td>
                  <td className="button-container">
                    <Link to={`edit/${post.id}`}>
                      <Button
                        style={{ backgroundColor: "orange", border: "none" }}
                      >
                        <EditIcon />
                      </Button>
                    </Link>
                    {"  "}
                    <Link>
                      <Button
                        style={{ backgroundColor: "red", border: "none" }}
                        variant="primary"
                        onClick={() => handleShowModalDelete(post.id)}
                      >
                        <DeleteIcon />
                      </Button>
                    </Link>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
          <DeleteModal
            show={show}
            setShow={setShow}
            onDeleteHandler={onDeleteHandler}
          />
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
        <div className="col-lg-2"></div>
      </div>
    </>
  );
}
export default Home;
