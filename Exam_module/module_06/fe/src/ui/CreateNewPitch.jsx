import { Form, Formik, Field } from "formik";
import Header from "./Header";
import { useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import {
  getAllType,
  getAllArea,
  create,
  getAllTime,
} from "./../service/pitch-service";
import * as Yup from "yup";
import Swal from "sweetalert2";

function CreateNewPitch() {
  const [area, setArea] = useState();
  const [type, setType] = useState();
  const [time, setTime] = useState();
  const navigate = useNavigate();
  const handleNavigateHome = () => {
    navigate("/");
  };
  useEffect(() => {
    const getAll = () => {
      getAllTime().then((res) => setTime(res));
    };
    getAll();
  }, []);

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

  return (
    <>
      <Header />
      <div className="mt-5">
        <div className="container mt-5">
          <Formik
            initialValues={{
              name: "",
              address: "",
              pitchArea: -1,
              pitchTypes: -1,
              rentalTimeFrames: -1,
            }}
            // validationSchema={Yup.object({
            //   name: Yup.required("Vui lòng nhập đầy đủ thông tin"),
            //   address:  Yup.required("Vui lòng nhập đầy đủ thông tin"),
            //   pitchArea: Yup.required("Vui lòng nhập đầy đủ thông tin"),
            //   pitchTypes: Yup.required("Vui lòng nhập đầy đủ thông tin"),
            //   rentalTimeFrames: Yup.required("Vui lòng nhập đầy đủ thông tin"),
            // })}
            onSubmit={(values, { setSubmitting }) => {
              const p = {
                ...values,
                pitchTypes: JSON.parse(values.pitchTypes),
                pitchArea: JSON.parse(values.pitchArea),
                rentalTimeFrames: JSON.parse(values.rentalTimeFrames),
              };
              create(p).then(() => {
                console.log(values);
                Swal.fire({
                  position: "center",
                  icon: "success",
                  title: "Thêm mới sân bóng thành công!",
                  showConfirmButton: false,
                  timer: 1500,
                });
                navigate("/");
                setSubmitting(false);
              });
            }}
          >
            <Form>
              <div className="row">
                <div className="col-6 p-3 me-auto">
                  <div className="input-group">
                    <span
                      className="input-group-text me-auto"
                      style={{
                        border: "none",
                        background: "white",
                        fontWeight: "bold",
                      }}
                    >
                      Tên sân bóng:
                    </span>
                    <>
                      <Field
                        className="form-control"
                        type="text"
                        name="name"
                        required
                      ></Field>
                    </>
                  </div>
                  <div className="input-group mt-5">
                    <span
                      className="input-group-text me-4"
                      style={{
                        border: "none",
                        background: "white",
                        fontWeight: "bold",
                      }}
                    >
                      Khu vực:
                    </span>
                    <>
                      {area && (
                        <Field
                          as="select"
                          className="form-select"
                          name="pitchArea"
                          required
                        >
                          <option selected value={-1}>
                            Chọn khu vực
                          </option>
                          {area.map((area) => (
                            <option key={area.id} value={JSON.stringify(area)}>
                              {area.name}
                            </option>
                          ))}
                        </Field>
                      )}
                    </>
                  </div>
                  <div className="input-group mt-5">
                    <span
                      className="input-group-text me-4"
                      style={{
                        border: "none",
                        background: "white",
                        fontWeight: "bold",
                      }}
                    >
                      Địa chỉ:
                    </span>
                    <>
                      <Field
                        className="form-control ms-1"
                        type="text"
                        name="address"
                        required
                      ></Field>
                    </>
                  </div>
                  <div className="input-group mt-5">
                    <span
                      className="input-group-text me-4"
                      style={{
                        border: "none",
                        background: "white",
                        fontWeight: "bold",
                      }}
                    >
                      Loại sân:
                    </span>
                    <>
                      {type && (
                        <Field
                          as="select"
                          className="form-select"
                          name="pitchTypes"
                          required
                        >
                          <option selected value={-1}>
                            Chọn loại sân
                          </option>
                          {type.map((type) => (
                            <option key={type.id} value={JSON.stringify(type)}>
                              {type.name}
                            </option>
                          ))}
                        </Field>
                      )}
                    </>
                  </div>
                  <div className="input-group mt-5">
                    <span
                      className="input-group-text me-4"
                      style={{
                        border: "none",
                        background: "white",
                        fontWeight: "bold",
                      }}
                    >
                      Các khung giờ cho thuê:
                    </span>
                    <>
                      {time && (
                        <Field
                          as="select"
                          className="form-select"
                          name="rentalTimeFrames"
                          required
                        >
                          <option selected value={-1}>
                            Chọn thời gian cho thuê
                          </option>
                          {time.map((time) => (
                            <option key={time.id} value={JSON.stringify(time)}>
                              {time.time} giá {time.price}
                            </option>
                          ))}
                        </Field>
                      )}
                    </>
                  </div>
                </div>

                <div className="button-group mt-5 container ">
                  <button
                    className="btn btn-outline-warning"
                    onClick={handleNavigateHome}
                  >
                    Quay lại
                  </button>{" "}
                  <button className="btn btn-outline-success" type="submit">
                    Thêm mới
                  </button>
                </div>
              </div>
            </Form>
          </Formik>
        </div>
      </div>
    </>
  );
}
export default CreateNewPitch;
