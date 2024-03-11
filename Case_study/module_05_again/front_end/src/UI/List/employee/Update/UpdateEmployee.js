import NavHeader from "../../../Common/NavHeader";
import Header from "../../../Common/Header/Header";
import Footer from "../../../Common/Footer/Footer";
import { Field } from "formik";
import { Formik } from "formik";
import { Form } from "formik";
import { useNavigate, useParams } from "react-router-dom";
import { useEffect } from "react";
import { useState } from "react";
import {
  findAllQualificationsEmp,
  findAllWorkingPartsEmp,
  findById,
  update,
} from "../../../../Services/Employee/EmployeeService";
import { findAllPositionEmp } from "./../../../../Services/Employee/EmployeeService";
function UpdateEmployee() {
  const [employees, setEmployees] = useState();
  const params = useParams();
  const navigate = useNavigate();
  const [position, setPosition] = useState();
  const [wokingParts, setWorkingParts] = useState();
  const [qualifications, setQualifications] = useState();

  const handleBack = () => {
    navigate("/employees");
  };

  useEffect(() => {
    findAllPositionEmp().then((result) => {
      setPosition(result);
    });
    findAllQualificationsEmp().then((res) => setQualifications(res));
    findAllWorkingPartsEmp().then((res) => setWorkingParts(res));
  }, []);

  useEffect(() => {
    const { id } = params;
    if (id && params) {
      findById(id).then((res) => {
        const emp = {
          ...res,
          employeePosition: JSON.stringify(res.employeePosition),
          employeeQualifications: JSON.stringify(res.employeeQualifications),
          employeeWorkingParts: JSON.stringify(res.employeeWorkingParts),
        };
        setEmployees(emp);
      });
    }
  },[]);
  if (!employees) return <div>loading....</div>;
  if (!position) return <div>loading....</div>;
  if (!wokingParts) return <div>loading....</div>;
  if (!qualifications) return <div>loading....</div>;
  return (
    <>
      <NavHeader />
      <Header />
      <div className="container px-4 px-lg-5">
        <h3 style={{ marginTop: "20px", textAlign: "center" }}>
          Phiếu cập nhật nhân viên
        </h3>
        <div className="display-form-create">
          <div className="form-create">
            <Formik
              initialValues={employees}
              // validationSchema={Yup.object({
              //   name: Yup.string("Không được chứa số"),
              //   phoneNumber: Yup.number()
              //   .matches("^(090|091|8490|8491)\\d{7}$","số điện thoại phải có 090xxxx,091xxxx"),
              //   email: Yup.email()
              // })}

              onSubmit={(values, { setSubmitting }) => {
                const employee = {
                  ...values,
                  employeePosition: JSON.parse(values.employeePosition),
                  employeeQualifications: JSON.parse(
                    values.employeeQualifications
                  ),
                  employeeWorkingParts: JSON.parse(values.employeeWorkingParts),
                };
                update(employee).then((res) => {
                  setSubmitting(false);
                  navigate("/employees");
                });
              }}
            >
              {({ isSubmitting }) => (
                <Form className="row g-3">
                  <div className="col-md-6">
                    <label className="form-label">Họ và Tên</label>
                    <Field type="text" className="form-control" name="name" />
                    {/* <ErrorMessage name="name" component={"span"} style={{color:"red"}}/> */}
                  </div>

                  <div className="col-md-6">
                    <label className="form-label">Ngày sinh</label>
                    <Field
                      type="text"
                      className="form-control"
                      placeHolder="dd-mm-yyyy"
                      name="date"
                    />
                    {/* <ErrorMessage name="date" component={"span"} style={{color: "red"}}/> */}
                  </div>

                  <div className="col-md-6">
                    <label className="form-label">Email</label>
                    <Field
                      type="text"
                      className="form-control"
                      placeHolder="abx@gmail.com"
                      name="email"
                    />
                  </div>

                  <div className="col-md-6">
                    <label className="form-label">Số điện thoại</label>
                    <Field
                      type="text"
                      class="form-control"
                      name="phoneNumber"
                    />
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">Vị trí</label>
                    <Field
                      name="employeePosition"
                      as="select"
                      className="form-select"
                    >
                      <option value="" disabled>
                        Chọn vị trí
                      </option>
                      {position.map((p) => (
                        <option value={JSON.stringify(p)} key={p.id}>
                          {p.name}
                        </option>
                      ))}
                    </Field>
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">Trình độ</label>
                    <Field
                      as="select"
                      name="employeeQualifications"
                      className="form-select"
                    >
                      <option value="" disabled>
                        Chọn trình độ
                      </option>
                      {qualifications.map((q) => (
                        <option value={JSON.stringify(q)} key={q.id}>
                          {q.name}
                        </option>
                      ))}
                    </Field>
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">Bộ phận</label>
                    <Field
                      as="select"
                      name="employeeWorkingParts"
                      className="form-select"
                    >
                      <option value="" disabled>
                        Chọn bộ phận
                      </option>
                      {wokingParts.map((w) => (
                        <option value={JSON.stringify(w)} key={w.id}>
                          {w.name}
                        </option>
                      ))}
                    </Field>
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">CMND/CCCD</label>
                    <Field type="text" class="form-control" name="identity" />
                  </div>

                  <div className="col-md-2">
                    <button
                      type="submit"
                      className="btn btn-primary"
                      disabled={isSubmitting}
                    >
                      Xác nhận
                    </button>
                  </div>

                  <div className="col-md-3">
                    <button
                      onClick={handleBack}
                      type="cancel"
                      className="btn btn-primary"
                    >
                      Hủy
                    </button>
                  </div>
                </Form>
              )}
            </Formik>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}
export default UpdateEmployee;
