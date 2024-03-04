import React from "react";
import { ToastContainer} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import { useEffect } from "react";
import { useState } from "react";
import * as clo from "../Services/ClothingServices";
import * as cate from "../Services/CategoryServices";
// import { useNavigate } from "react-router-dom";
import { format } from 'date-fns';
import { Link } from "react-router-dom";
function Home() {
  const [products, setProducts] = useState();
  const [categories, setCategories] = useState();
  const initSearchParam = {
    name: "",
    category: "",
  };
  const [searchParam, setSearchParam] = useState(initSearchParam);
  // const navigate = useNavigate();

  // const handleUpdatingProduct = (id) => {
  //   console.log(id);
  //   navigate(`edit/${id}`);
  // };

  const getAllProducts = async (param) => {
    try {
      const result = await clo.findAll(param);
      setProducts(result);
    } catch (error) {
      console.log(error.message);
    }
  };

  useEffect(() => {
    const getAllCategories = async () => {
      try {
        const result = await cate.findAllCategories();
        setCategories(result.data);
      } catch (error) {
        console.log(error.message);
      }
    };
    getAllCategories();
  }, []);

  useEffect(() => {
    getAllProducts(searchParam);
  }, []);

  const handleSearchChange = (e) => {
    const { name, value } = e.target;
    setSearchParam({ ...searchParam, [name]: value });
  };

  const handleSearch = () => {
    getAllProducts(searchParam);
  };

  if (!products) return <div>Loading...</div>;
  return (
    <div>
      <h3 style={{ textAlign: "center" }}>Đại lý quần áo</h3>

      <div>
        <input type="text" name="name" onChange={handleSearchChange} />
        <button onClick={handleSearch}>Search</button>
      </div>
      <table className="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Mã sản phẩm</th>
            <th>Tên</th>
            <th>Ngày nhập</th>
            <th>Số lượng</th>
            <th>Loại sản phẩm</th>
            <th>Tuỳ Chỉnh</th>
          </tr>
        </thead>
        <tbody>
          {products.map((pr, index) => (
            <tr key={index}>
              <td>{index + 1}</td>
              <td>{pr.code}</td>
              <td>{pr.name}</td>
              <td>{format(new Date(pr.date), 'dd/MM/yyyy')}</td>
              <td>{pr.quantity}</td>
              <td>{pr.category.name}</td>
              <td>
                <Link to={`/edit/${pr.id}`} >
                  Sửa
                </Link>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <ToastContainer/>

    </div>
  );
}
export default Home;
