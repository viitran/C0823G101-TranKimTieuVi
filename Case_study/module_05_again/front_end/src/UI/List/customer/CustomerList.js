import Header from "../../Common/Header/Header";
import NavHeader from "../../Common/NavHeader";
import Footer from "../../Common/Footer/Footer";
import { Link } from "react-router-dom";
import { useEffect, useState } from "react";
import { findAllCustomer } from "../../../Services/Customer/CustomerService";
import UpdateIcon from "@mui/icons-material/Update";
import CancelIcon from "@mui/icons-material/Cancel";
import PersonAddAlt1Icon from "@mui/icons-material/PersonAddAlt1";
import SearchIcon from "@mui/icons-material/Search";


function CustomerList() {
  const [customers, setCustomers] = useState();

  const getAllCus = async () => {
    findAllCustomer().then((res) => setCustomers(res));
  };

  useEffect(() => {
    getAllCus();
  }, []);

  if (!customers) return <div>loading...</div>;
  return (
    <>
      <NavHeader />
      <Header />

      <div className="container px-4 px-lg-5 body-cus">
        <div className="display">
          <div className="col-lg-5"></div>
          <div className="col-lg-5 title">
            <div>
              <h3>Danh sách khách hàng</h3>
            </div>
          </div>

          <div className="col-lg-2 empty"></div>
        </div>

        <div className="display">
          <div className="col-lg-5">
            <Link to={"/create-customer"}>
              <button className="btn btn-primary">
                <PersonAddAlt1Icon />
              </button>
            </Link>
          </div>
          <div className="col-lg-4"></div>
          <div className="col-lg-3">
            <input
              placeholder="Tiếm kiếm khách hàng"
              style={{ border: "none", borderBottom: "solid 1px black" }}
            />

            <button className="btn btn-success">
              <SearchIcon />
            </button>
          </div>
        </div>
        <table class="table">
          <thead>
            <tr>
              <th scope="col">STT</th>
              <th scope="col">Họ và tên</th>
              <th scope="col">Email</th>
              <th scope="col">Số điện thoại</th>
              <th scope="col">Loại khách</th>
              <th scope="col">Hoạt động</th>
            </tr>
          </thead>
          <tbody>
            {customers.map((cus, index) => (
              <tr key={cus.id}>
                <th>{index + 1}</th>
                <td>{cus.name}</td>
                <td>{cus.email}</td>
                <td>{cus.phoneNumber}</td>
                <td>{cus.customerType.name}</td>
                <Link to={`/edit/${cus.id}`}>
                  <button className="btn btn-warning">
                    <UpdateIcon />
                  </button>
                </Link>{" "}
                <button
                  className="btn btn-danger"
                  style={{ backgroundColor: "#dc3545" }}
                  // onClick={() => handleShowModal(emp.id)}
                >
                  <CancelIcon />
                </button>
              </tr>
            ))}
          </tbody>
        </table>

        {/* <DeleteModal
          show={show}
          setShow={setShow}
          onDeleteHandler={onDeleteHandler}
        /> */}
      </div>

      <Footer />
    </>
  );
}
export default CustomerList;
