import { useEffect, useState } from "react";
import { getAllBook } from "../Services/BookService";
import { Link } from "react-router-dom";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { findAllCate } from "../Services/Category";

const initValueSearch = {
  title: "",
  category: "",
};

function Home() {
  const [books, setBooks] = useState();
  const [search, setSearch] = useState(initValueSearch);
  const [categories, setCategories] = useState();

  const findAllBooks = async (param) => {
    getAllBook(search).then((res) => setBooks(res));
  };

  useEffect(() => {
    findAllBooks(search);
  }, []);

  useEffect(() => {
    findAllCate().then((res) => setCategories(res));
  }, []);

  const handleChangeSearch = (e) => {
    const { value, name } = e.target;
    setSearch({ ...search, [name]: value });
  };

  const handleSearch = () => {
    getAllBook(search).then((res) => setBooks(res));
  };

  if (!books) return <div>loading..</div>;
  if (!categories) return <div>loading...</div>;

  return (
    <>
      <div>
        <h3 style={{ textAlign: "center", marginTop: "20px" }}>
          Hệ thống quản lý sách
        </h3>
      </div>
      <div className="container">
        <div className="display">
          <div className="col-lg-6">
            <Link to={"/create"}>
              <button className="btn btn-success">Thêm mới sách</button>
            </Link>
          </div>
          <div className="col-lg-2"></div>
          <div className="col-lg-4">
            <input
              type="text"
              name="title"
              onChange={handleChangeSearch}
              placeHolder="Tìm sách tên ...."
            />{" "}
            {categories && (
              <select
                name="category"
                onChange={handleChangeSearch}
                className="select-input"
              >
                <option value={""} selected>
                  Chọn thể loại
                </option>
                {categories.map((cate) => (
                  <option key={cate.id} value={cate.name}>
                    {cate.name}
                  </option>
                ))}
              </select>
            )}{" "}
            <button className="btn btn-success" onClick={handleSearch}>
              Tìm
            </button>
          </div>
        </div>

        <div className="table-book">
          <table className="table">
            <thead>
              <tr>
                <th>STT</th>
                <th>Mã sách</th>
                <th>Tên sách</th>
                <th>Thể loại</th>
                <th>Ngày nhập</th>
                <th>Số lượng</th>
                <th>Hoạt động</th>
              </tr>
            </thead>
            <tbody>
              {books.map((b, index) => (
                <tr key={b.id}>
                  <th>{index + 1}</th>
                  <td>{b.code}</td>
                  <td>{b.name}</td>
                  <td>{b.bookCategory.name}</td>
                  <td>{b.date}</td>
                  <td>{b.quantity}</td>
                  <td>
                    <Link to={`/edit/${b.id}`}>
                      <button className="btn btn-warning"
                      >Cập nhật</button>
                    </Link>{" "}
                    <Link>
                      <button className="btn btn-danger">Xóa</button>
                    </Link>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
      <ToastContainer />
    </>
  );
}
export default Home;
