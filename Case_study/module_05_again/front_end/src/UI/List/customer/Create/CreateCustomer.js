import NavHeader from "../../../NavHeader";
import Header from "../../../Header/Header";
import Footer from "../../../Footer/Footer";
import { Form, Formik, Field } from "formik";
import { useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import {
  createCustomer,
  findAllTypeCus,
} from "../../../../Services/Customer/CustomerService";
function CreateCustomer() {
  const navigate = useNavigate();
  const [type, setType] = useState();

  useEffect(() => {
    findAllTypeCus().then((result) => {
      setType(result);
    });
  }, []);

  const handleBack = () => {
    navigate("/customers");
  };

  if (!type) return <div>loading...</div>;

  return (
    <>
      <NavHeader />
      <Header />
      <div className="container px-4 px-lg-5">
        <h3 style={{ marginTop: "20px", textAlign: "center" }}>
          Phiếu điền thông tin khách hàng
        </h3>
        <div className="display-form-create">
          <div className="form-create">
            <Formik
              initialValues={{
                name: "",
                date: "",
                phoneNumber: "",
                email: "",
                gender: "",
                address: "",
                customerType: "",
              }}
              onSubmit={(values, { setSubmitting }) => {
                const cus = {
                  ...values,
                  customerType: JSON.parse(values.customerType),
                };
                createCustomer(cus).then((res) => {
                  setSubmitting(false);
                  navigate("/customers");
                });
              }}
            >
              {({ isSubmitting }) => (
                <Form className="row g-3">
                  <div className="col-md-6">
                    <label className="form-label">Họ và Tên</label>
                    <Field type="text" className="form-control" name="name" />
                  </div>

                  <div className="col-md-6">
                    <label className="form-label">Ngày sinh</label>
                    <Field
                      type="text"
                      className="form-control"
                      placeHolder="dd-mm-yyyy"
                      name="date"
                    />
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
                    <label className="form-label">Địa chỉ</label>
                    <Field type="text" class="form-control" name="address" />
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">Giới tính</label>
                    <Field name="gender" as="select" className="form-select">
                      <option value="" disabled>
                        Chọn giới tính
                      </option>
                      <option value="false">Nam</option>
                      <option value="true">Nữ</option>
                    </Field>
                  </div>

                  <div className="col-md-3">
                    <label className="form-label">Loại khách</label>
                    <Field
                      name="customerType"
                      as="select"
                      className="form-select"
                    >
                      <option value="" disabled>
                        Chọn loại khách
                      </option>
                      {type.map((t) => (
                        <option value={JSON.stringify(t)} key={t.id}>
                          {t.name}
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
export default CreateCustomer;
