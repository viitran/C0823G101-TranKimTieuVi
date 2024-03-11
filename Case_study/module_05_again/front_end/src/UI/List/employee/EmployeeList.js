import { useEffect, useState } from "react";
import Header from "../../Common/Header/Header";
import NavHeader from "../../Common/NavHeader";
import { findAllEmp, remove } from "../../../Services/Employee/EmployeeService";
import Footer from "../../Common/Footer/Footer";
import { Link } from "react-router-dom";
import UpdateIcon from "@mui/icons-material/Update";
import CancelIcon from "@mui/icons-material/Cancel";
import PersonAddAlt1Icon from "@mui/icons-material/PersonAddAlt1";
import SearchIcon from "@mui/icons-material/Search";
import DeleteModal from "../../../Components/DeleteModal";
function EmployeeList() {
  const [employees, setEmployees] = useState();
  const [idDelete, setIdDelete] = useState();
  const [show, setShow] = useState(false);

  const handleShowModal = (id) => {
    setIdDelete(id);
    setShow(true);
  };

  const onDeleteHandler = () => {
    remove(idDelete).then((res) => {
      getAllEmployee();
    });
  };

  const getAllEmployee = async () => {
    try {
      const result = await findAllEmp();
      setEmployees(result);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getAllEmployee();
  }, []);

  if (!employees) return <div>Loading.....</div>;
  return (
    <>
      <NavHeader />
      <Header />
      <div className="container px-4 px-lg-5 body-emp">
        <div className="display">
          <div className="col-lg-5"></div>
          <div className="col-lg-5 title">
            <div>
              <h3>Danh sách nhân viên</h3>
            </div>
          </div>

          <div className="col-lg-2 empty"></div>
        </div>

        <div className="display">
          <div className="col-lg-5">
            <Link to={"/create"}>
              <button className="btn btn-primary">
                <PersonAddAlt1Icon />
              </button>
            </Link>
          </div>
          <div className="col-lg-4"></div>
          <div className="col-lg-3">
            <input
              placeholder="Tiếm kiếm nhân viên"
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
              <th scope="col">Số điện thoại</th>
              <th scope="col">Vị trí</th>
              <th scope="col">Hoạt động</th>
            </tr>
          </thead>
          <tbody>
            {employees.map((emp, index) => (
              <tr key={emp.id}>
                <th>{index + 1}</th>
                <td>{emp.name}</td>
                <td>{emp.phoneNumber}</td>
                <td>{emp.employeePosition.name}</td>
                <td>
                  <Link to={`/edit/${emp.id}`}>
                    <button className="btn btn-warning">
                      <UpdateIcon />
                    </button>
                  </Link>{" "}
                  <button
                    className="btn btn-danger"
                    onClick={() => handleShowModal(emp.id)}
                  >
                    <CancelIcon />
                  </button>
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
      </div>

      <Footer />
    </>
  );
}
export default EmployeeList;
