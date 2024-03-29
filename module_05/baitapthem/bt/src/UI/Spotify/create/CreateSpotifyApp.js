import { Formik, Form, Field } from "formik";
import React from "react";
import { useNavigate } from "react-router-dom";
import "react-toastify/dist/ReactToastify.css";
import { toast } from "react-toastify";
import * as spo from "../../../Services/SpotifyService";

function CreateSpotifyApp() {
  const navigate = useNavigate();
  const handleNavigateBack = () => {
    navigate("/");
  };
  return (
    <div>
      <Formik
        initialValues={{
          title: "",
          artist: "",
          composer: "",
          duration: "",
          favorites: 0,
          status: [{
            
          }],
        }}
        onSubmit={(value, { setSubmitting }) => {
          const create = async (song) => {
            setSubmitting(false);
            await spo.create(song);
            toast("Thêm bài hát mới thành công!");
            navigate("/");
          };
          create(value);
        }}
      >
        {({ isSubmitting }) => (
          <div className="container">
            <h2 className="title">Đăng ký bài hát</h2>
            <Form>
              <div className="form-group">
                <label htmlFor="song">Tên bài hát:</label>
                <Field type="text" id="song" name="title" />
              </div>
              <div className="form-group">
                <label htmlFor="singer">Ca sĩ:</label>
                <Field type="text" id="singer" name="artist" />
              </div>
              <div className="form-group">
                <label htmlFor="composer">Nhạc sĩ:</label>
                <Field type="text" id="composer" name="composer" />
              </div>
              <div className="form-group">
                <label htmlFor="time">Thời gian phát:</label>
                <Field
                  type="text"
                  id="time"
                  name="duration"
                  pattern="[0-2][0-9]:[0-5][0-9]"
                  placeholder="hh:mm"
                />
              </div>
              <div className="form-group">
                <label htmlFor="favorites">Lượt thích:</label>
                <Field type="number" id="favorites" name="favorites" />
              </div>

              <div className="form-group">
                <label htmlFor="favorites">Trạng thái</label>
                <Field />
              </div>
              
              <div>
                {isSubmitting ? (
                  <div>loader</div>
                ) : (
                  <button type="submit" class="submit-button">
                    Đăng ký
                  </button>
                )}
                <br />
                <br />
                <button onClick={handleNavigateBack}>Quay lại</button>
              </div>
            </Form>
          </div>
        )}
      </Formik>
    </div>
  );
}

export default CreateSpotifyApp;
