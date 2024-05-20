import Header from "../../../Header/Header";
import NavHeader from "../../../NavHeader";
import Footer from "../../../Footer/Footer";
import { useNavigate } from "react-router-dom";
import { ErrorMessage, Field, Form, Formik } from "formik";
import { useEffect, useState } from "react";
import {
  create,
  findAllPositionEmp,
  findAllQualificationsEmp,
  findAllWorkingPartsEmp,
} from "./../../../../Services/Employee/EmployeeService";

function CreateEmployee() {
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
  }, []);

  useEffect(() => {
    findAllQualificationsEmp().then((res) => setQualifications(res));
  }, []);

  useEffect(() => {
    findAllWorkingPartsEmp().then((res) => setWorkingParts(res));
  }, []);

  if(!position) return <div>loading</div>
  if(!wokingParts) return <div>loading</div>
  if(!qualifications) return <div>loading</div>

  return (
    <>
      <NavHeader />
      <Header />

      <div className="container px-4 px-lg-5">
        <h3 style={{ marginTop: "20px", textAlign: "center" }}>
          Phiếu điền thông tin nhân viên mới
        </h3>
        <div className="display-form-create">
          <div className="form-create">
            <Formik
              initialValues={{
                name: "",
                date: "",
                phoneNumber: "",
                email: "",
                identity: "",
                employeeQualifications: "",
                employeePosition: "",
                employeeWorkingParts: "",
              }}

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
                  employeeQualifications: JSON.parse(values.employeeQualifications),
                  employeeWorkingParts: JSON.parse(values.employeeWorkingParts),
                };
                create(employee).then((res) => {
                  setSubmitting(false);
                  navigate("/employees");
                });
              }}
            >
              {({ isSubmitting }) => (
               <Form className="row g-3">
               <div className="col-md-6">
                 <label className="form-label">Họ và Tên</label>
                 <Field 
                 type="text"
                 className="form-control"
                 name="name" 
                  />
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
                 <Field type="text" class="form-control" name="phoneNumber" />
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
                  disabled={isSubmitting}>
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
export default CreateEmployee;
