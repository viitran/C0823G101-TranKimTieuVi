import {
  getAllArea,
  getAllPitch,
  getAllType,
  remove,
} from "../service/pitch-service";
import Header from "./Header";
import { Table } from "react-bootstrap";
import { useEffect, useState } from "react";
import DeleteModal from "./DeleteModal";
import Swal from "sweetalert2";
import { useNavigate } from "react-router-dom";

const initParam = {
  page: 0,
  size: 5,
  name: "",
  type: -1,
  area: -1,
};
const initSearch = {
  name: "",
  type: -1,
  area: -1,
};

function PitchHome() {
  const [pitch, setPitch] = useState();
  const [type, setType] = useState();
  const [area, setArea] = useState();
  const [show, setShow] = useState(false);
  const [idDelete, setIdDelete] = useState();
  const [pageParam, setPageParam] = useState(initSearch);
  const navigate = useNavigate();
  const handleSearchChange = (e) => {
    const { name, value } = e.target;
    const data = { ...pageParam, [name]: value };
    setPageParam(data);
  };

  const handleSubmitSearch = () => {
    getAllPitch(pageParam);
  };
  const handleNavigate = () => {
    navigate("/create");
  };
  const handleShowModal = (id) => {
    setIdDelete(id);
    setShow(true);
  };
  const onDeleteHandler = () => {
    remove(idDelete).then((res) => {
      Swal.fire({
        position: "center",
        icon: "success",
        title: "Xóa sân bóng thành công!",
        showConfirmButton: false,
        timer: 1500,
      });
      getAll();
    });
  };

  useEffect(() => {
    const findAllType = () => {
      getAllType().then((res) => setType(res));
    };
    findAllType();
  }, []);

  useEffect(() => {
    const findAllArea = () => {
      getAllArea().then((res) => setArea(res));
    };
    findAllArea();
  }, []);
  const getAll = async () => {
    try {
      const res = await getAllPitch();
      setPitch(res);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getAll();
  }, []);

  if (!pitch) return <div>loading...</div>;
  if (!type) return <div>loading...</div>;
  if (!area) return <div>loading...</div>;
  return (
    <>
      <Header />
      <div className="p-5">
        <div className="row">
          <div className="col-4">
            <input
              type="text"
              className="form-control"
              placeholder="Nhập tên sân cần tìm"
              name="name"
              onChange={handleSearchChange}
            />
          </div>
          <div className="col-3">
            {type && (
              <select
                className="form-select"
                name="type"
                onChange={handleSearchChange}
                // value={pageParam.coursesId}
              >
                <option selected value={-1}>
                  Chọn loại sân
                </option>
                {type.map((type) => (
                  <option key={type.id} value={type.id}>
                    {type.name}
                  </option>
                ))}
              </select>
            )}
          </div>
          <div className="col-3">
            {area && (
              <select
                className="form-select"
                name="area"
                onChange={handleSearchChange}
                // value={pageParam.coursesId}
              >
                <option selected value={-1}>
                  Chọn khu vực
                </option>
                {area.map((a) => (
                  <option key={a.id} value={a.id}>
                    {a.name}
                  </option>
                ))}
              </select>
            )}
          </div>
          <div className="col-2">
            <button
              className="btn btn-outline-primary"
              onClick={handleSubmitSearch}
            >
              Tìm
            </button>{" "}
            <button
              className="btn btn-outline-success"
              onClick={handleNavigate}
            >
              Thêm mới
            </button>
          </div>
        </div>
        <div>
          <Table className="mt-5">
            <thead>
              <tr>
                <th scope="col">STT</th>
                <th scope="col">Tên sân bóng</th>
                <th scope="col">Loại sân bóng</th>
                <th scope="col">Khu vực</th>
                <th scope="col">Địa chỉ</th>
                <th scope="col">Khung giờ cho thuê</th>
                <th scope="col">Hành động</th>
              </tr>
            </thead>
            <tbody>
              {pitch.map((item, index) => (
                <tr key={item.id}>
                  <td>{index + 1}</td>
                  <td>{item.name}</td>
                  <td>{item.pitchTypes.name}</td>
                  <td>{item.pitchArea.name}</td>
                  <td>{item.address}</td>
                  <td>{item.rentalTimeFrames.time}</td>
                  <button
                    className="btn btn-outline-danger"
                    onClick={() => handleShowModal(item.id)}
                  >
                    Xóa sân bóng
                  </button>
                </tr>
              ))}
            </tbody>
            <DeleteModal
              show={show}
              setShow={setShow}
              onDeleteHandler={onDeleteHandler}
            />
          </Table>
        </div>
      </div>
    </>
  );
}
export default PitchHome;
