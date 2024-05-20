import { ErrorMessage, Field, Form, Formik } from "formik";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { findAllCate } from "../Services/Category";
import { create, getAllBook } from "../Services/BookService";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import * as Yup from "yup";

function Create() {
  const [categories, setCategories] = useState();
  const navigate = useNavigate();
  const handleNavigateBack = () => {
    navigate("/");
  };

  useEffect(() => {
    findAllCate().then((res) => setCategories(res));
  }, []);

  if (!categories) return <div>loading...</div>;

  return (
    <>
      <div>
        <h3 style={{ textAlign: "center", marginTop: "50px" }}>
          Hệ thống thêm mới sách
        </h3>
      </div>
      <div className="container">
        <div>
          <Formik
            initialValues={{
              code: "",
              title: "",
              quantity: "",
              date: "",
              category: "",
            }}
            onSubmit={(values, { setSubmitting }) => {
              const b = {
                ...values,
                category: JSON.parse(values.category),
              };
              create(b).then((res) => {
                toast("Them moi thanh cong");
                alert("Them moi thanh cong");
                navigate("/");
                setSubmitting(false);
              });
            }}
            validationSchema={Yup.object({
              code: Yup.string()
                .matches(
                  "^BO-[0-9]{4}$",
                  "Mã sách có định dạng như sau: BO-XXXX (X là số)"
                )
                .required("Vui lòng nhập đầy đủ thông tin"),
                title: Yup.string()
                .max(100, "Tên sách không dài quá 100 ký tự")
                .required("Vui lòng nhập đầy đủ thông tin"),
              quantity: Yup.number()
                .required("Vui lòng nhập đầy đủ thông tin")
                .min(0, "Số lượng sách phải là số nguyên lớn hơn 0"),
              date: Yup.date().required("Vui lòng nhập đầy đủ thông tin"),
            })}
          >
            <div className="form-create">
              <Form>
                <div>
                  <label>Mã sách</label>{" "}
                  <Field
                    type="text"
                    className="form-control"
                    name="code"
                    placeHolder="BO-000x"
                  />
                  <ErrorMessage
                    name="code"
                    component={"div"}
                    style={{ color: "red" }}
                  />
                </div>
                <br />
                <div>
                  <label>Tên sách</label>{" "}
                  <Field name="title" type="text" className="form-control" />
                  <ErrorMessage
                    name="title"
                    component={"div"}
                    style={{ color: "red" }}
                  />
                </div>
                <br />
                <div>
                  <label>Thể loại</label>{" "}
                  <Field name="category" as="select" className="form-control">
                    <option value="" disabled>
                      Chọn thể loại
                    </option>
                    {categories.map((cate) => (
                      <option value={JSON.stringify(cate)} key={cate.id}>
                        {cate.name}
                      </option>
                    ))}
                  </Field>
                </div>

                <br />
                <div>
                  <label>Ngày nhập sách</label>{" "}
                  <Field
                    type="text"
                    className="form-control"
                    placeHolder="dd/MM/yyyy"
                    name="date"
                  />
                  <ErrorMessage
                    name="date"
                    component={"div"}
                    style={{ color: "red" }}
                  />
                </div>

                <br />
                <div>
                  <label>Số lượng</label>{" "}
                  <Field type="text" name="quantity" className="form-control" />
                  <ErrorMessage
                    name="quantity"
                    component={"div"}
                    style={{ color: "red" }}
                  />
                </div>
                <br />
                <div className="display">
                  <div className="col-md-4">
                    <button type="submit" className="btn btn-success">
                      Thêm mới
                    </button>
                  </div>{" "}
                  <div className="col-md-8">
                    <button
                      className="btn btn-danger"
                      onClick={handleNavigateBack}
                    >
                      Quay lại
                    </button>
                  </div>
                </div>
              </Form>
            </div>
          </Formik>
        </div>
      </div>
    </>
  );
}
export default Create;
