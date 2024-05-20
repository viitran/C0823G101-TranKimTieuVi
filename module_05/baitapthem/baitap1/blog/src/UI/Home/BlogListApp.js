import { useEffect, useState } from "react";
import Footer from "../Common/Footer/Footer.js";
import { findAll, findAllTags, remove } from "./../../Services/BlogServices";
import { Link } from "react-router-dom";
import DeleteModal from "../../Components/DeleteModal.js";
import Button from "react-bootstrap/Button";
import { DeleteOutlined } from "@ant-design/icons";
import { EditOutlined } from "@ant-design/icons";
import { SearchOutlined } from "@ant-design/icons";

const initValueSearch = {
  title: "",
  tags: "",
};

function BlogListApp() {
  const [blogs, setBlogs] = useState();
  const [tags, setTags] = useState();
  const [blog, setBlog] = useState();
  const [show, setShow] = useState(false);
  const [searchParam, setSearchParam] = useState(initValueSearch);

  const getAll = async (p) => {
    findAll(p).then((res) => setBlogs(res));
  };

  useEffect(() => {
    getAll(searchParam);
  }, []);

  useEffect(() => {
    const getAllTags = async () => {
      try {
        const result = await findAllTags();
        setTags(result);
      } catch (error) {
        console.log(error);
      }
    };
    getAllTags();
  }, []);

  const handleShowModalDelete = (b) => {
    setBlog(b);
    setShow(true);
  };

  const onDeleteHandler = () => {
    remove(blog.id).then((res) => {
      getAll();
    });
  };

  const handleSearchChange = (e) => {
    const { name, value } = e.target;
    setSearchParam({ ...searchParam, [name]: value });
  };

  const handleSearch = () => {
    console.log(searchParam);
    getAll(searchParam);
  };

  if (!blogs) return <div className="loader"></div>;
  if (!tags) return <div className="loader"></div>;

  return (
    <>
      <div>
        <h1 className="title">Recent posts</h1>
        <div className="display">
          <div className="col-lg-5"></div>
          <div className="col-lg-4"></div>
          <div className="col-lg-3">
            <input
              className="search-input"
              type="text"
              name="title"
              placeholder="Search"
              onChange={handleSearchChange}
            />
            {tags && (
              <select
              name="tags" 
              onChange={handleSearchChange}
              className="select-input">
                <option value={""} selected>
                  All Tags
                </option>
                {tags.map((tag) => (
                  <option key={tag.id} value={tag.name}>
                    {tag.name}
                  </option>
                ))}
              </select>
            )}

            <button onClick={handleSearch} className="search-button">
              <SearchOutlined />
            </button>
          </div>
        </div>

        <table className="table table-hover">
          <thead>
            <tr>
              <th style={{ background: "#EBF2ED" }}>STT</th>
              <th style={{ background: "#EBF2ED" }}>Title</th>
              <th style={{ background: "#EBF2ED" }}>Tags</th>
              <th style={{ background: "#EBF2ED" }}>Time</th>
              <th style={{ background: "#EBF2ED" }}>Action</th>
            </tr>
          </thead>
          <tbody>
            {blogs.map((b, index) => (
              <tr key={b.id}>
                <th>{index + 1}</th>
                <td>{b.title}</td>
                <td>{b.tags.name}</td>
                <td>{b.published}</td>
                <td className="button-container">
                  <Link to={`edit/${b.id}`}>
                    <Button
                      style={{
                        backgroundColor: "#ffa500a3",
                        border: "none",
                        color: "black",
                      }}
                    >
                      <EditOutlined />
                    </Button>
                  </Link>
                  {"  "}
                  <Link>
                    <Button
                      style={{
                        backgroundColor: "#ff0000b0",
                        border: "none",
                        color: "black",
                      }}
                      variant="primary"
                      onClick={() => handleShowModalDelete(b)}
                    >
                      <DeleteOutlined />
                    </Button>
                  </Link>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        {blog && (
          <DeleteModal
            show={show}
            setShow={setShow}
            onDeleteHandler={onDeleteHandler}
            title={blog.title}
          />
        )}
      </div>
      <Footer />
    </>
  );
}
export default BlogListApp;
