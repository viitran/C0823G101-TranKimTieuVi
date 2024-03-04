import React, { useState, useEffect } from "react";
import * as spo from "../../Services/SpotifyService";
import { ToastContainer, Bounce } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useNavigate } from "react-router-dom";
import Header from "../Home/Header";
import EditModal from "./EditModal";
function SpotifyApp() {
  const [tracks, setTracks] = useState([]);
  const navigate = useNavigate();
  const [idEdit, setIdEdit] = useState();
  const [show, setShow] = useState(false);

  const getAll = async () => {
    try {
      const result = await spo.findAll();
      setTracks(result);
    } catch (error) {
      console.log(error);
    }
  };

  const handleNavigateCreateSpotify = () => {
    navigate("/create");
  };

  const handleShowModalEdit = (id) => {
    setIdEdit(id);
    setShow(true);
  };

  const onEdit = () => {
    spo.update(idEdit).then((res) => {
      getAll();
    });
  };

  useEffect(() => {
    getAll();
  }, []);

  if (!tracks) return <div>loading</div>;

  return (
    <div>
    <Header/>
      <button onClick={handleNavigateCreateSpotify}>Đăng ký bài hát</button>
      {" "}
      <table class="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Tên bài hát</th>
            <th>Ca sĩ</th>
            <th>Thời gian</th>
            <th>Lượt thích</th>
            <th>Trạng thái</th>
          </tr>
        </thead>
        <tbody>
          {tracks.map((song, index) => (
            <tr key={song.id}>
              <td>{index + 1}</td>
              <td>{song.title}</td>
              <td>{song.artist}</td>
              <td>{song.duration}</td>
              <td>{song.favorites}</td>
              <td>
                <button 
                onClick={() => handleShowModalEdit(song.id)}
                >
                  {song.status === 0 ? "Công khai" : "Riêng tư"}
                </button>
              </td>
              {/* đổi thành button khi ấn vào sẽ là chỉnh sửa public thành private */}
            </tr>
          ))}
        </tbody>
      </table>
      <EditModal show={show} setShow={setShow} onEdit={onEdit} />

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
  );
}
export default SpotifyApp;
