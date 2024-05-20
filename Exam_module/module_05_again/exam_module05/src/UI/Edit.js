import { useNavigate, useParams } from "react-router-dom";
import { Formik } from "formik";
import * as Yup from "yup";
import { Form } from "formik";
import { Field } from "formik";
import { ErrorMessage } from "formik";
import { useState } from "react";
import { useEffect } from "react";
import { findAllCate } from "../Services/Category";
import { findById, update } from "../Services/BookService";
function Edit() {
  const navigate = useNavigate();
  const [book, setBooks] = useState();
  const [categories, setCategories] = useState();
  const params = useParams();

  useEffect(() => {
    findAllCate().then((res) => 
    setCategories(res));
  }, []);

  useEffect(() => {
    const { id } = params;
    if (params && id) {
      findById(id).then((res) => {
        const b = {
          ...res,
          category: JSON.stringify(res.category),
        };
        console.log(b);
        setBooks(b);
      });
    }
  }, [params]);

  const handleNavigateBack = () => {
    navigate("/");
  };

  if (!categories) return <div>loading</div>;
  if (!book) return <div>loading</div>;

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
            initialValues={book}
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
            onSubmit={(values, { setSubmitting }) => {
              const b = {
                ...values,
                category: JSON.parse(values.category),
              };
              update(b).then((res) => {
                setSubmitting(false);
                navigate("/");
              });
            }}
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
                      Cập nhật
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
export default Edit;
