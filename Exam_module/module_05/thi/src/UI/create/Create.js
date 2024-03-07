import React from "react";
import { useNavigate } from "react-router-dom";
import { ErrorMessage, Formik, Field, Form } from "formik";
import { useState, useEffect } from "react";
import * as Yup from "yup";
import * as cate from "../../Services/CategoryServices";
import * as clo from "../../Services/ClothingServices";
function CreateApp() {
  const [categories, setCategories] = useState();
  const navigate = useNavigate();
  const handleNavigateBackHome = () => {
    navigate("/");
  };

  useEffect(() => {
    cate.findAllCategories().then((res) => setCategories(res));
  }, []);
  
  if (!categories) return <div>Loading...</div>;

  return (
    <div className="parent">
      <div className="container">
        <h2 className="title">Đăng ký</h2>

        <Formik
          initialValues={{
            code: "",
            name: "",
            date: "",
            quantity: "",
            category: "",
          }}
          validationSchema={Yup.object({
            name: Yup.string("Vui lòng nhập tên sản phẩm hợp lệ").max(
              100,
              "Tên sản phẩm không được vượt quá 100 ký tự!"
            ),
            code: Yup.string("Vui lòng nhập mã sản phẩm hợp lệ"),
            quantity: Yup.number("Vui lòng nhập hợp lệ"),
          })}
          onSubmit={(values, { setSubmitting }) => {
            const product = {
              ...values,
              category: JSON.parse(values.category),
              // date: format(new Date(values.date), "dd-MM-yyyy"),
            };
            clo.create(product).then((res) => {
              console.log(res.data);
              setSubmitting(false);
              navigate("/");
            });
          }}
        >
          {({ isSubmitting }) => (
            <div>
              <Form>
                <div className="form-group">
                  <label>Mã sản phẩm:</label>
                  <Field
                    type="text"
                    id="code"
                    className="form-control"
                    name="code"
                  />
                  <ErrorMessage name="code" />
                </div>

                <div className="form-group">
                  <label>Tên:</label>
                  <Field
                    type="text"
                    id="name"
                    className="form-control"
                    name="name"
                  />
                  <ErrorMessage name="name" />
                </div>

                <div className="form-group">
                  <label>Ngày sản xuất:</label>
                  <Field
                    id="importDate"
                    type="text"
                    className="form-control"
                    placeHolder="yyyy-MM-dd"
                    name="date"
                  />
                  <ErrorMessage name="date" />
                </div>

                <div className="form-group">
                  <label>Số lượng:</label>
                  <Field
                    type="text"
                    id="quantity"
                    className="form-control"
                    name="quantity"
                  />
                  <ErrorMessage name="quantity" />
                </div>

                <div className="form-group">
                  <label>Loại sản phẩm:</label>
                  <Field
                    name="category"
                    as="select"
                    className="my-select form-control"
                  >
                    <option value="" disabled>
                      Chọn loại sản phẩm
                    </option>
                    {categories.map((cate) => (
                      <option value={JSON.stringify(cate)} key={cate.id}>
                        {cate.name}
                      </option>
                    ))}
                  </Field>
                </div>

                <div className="form-group">
                  <button
                    type="submit"
                    className="submit-button"
                    disabled={isSubmitting}
                  >
                    Đăng ký
                  </button>

                  <button
                    onClick={handleNavigateBackHome}
                    className="back-button"
                  >
                    Quay lại
                  </button>
                </div>
              </Form>
            </div>
          )}
        </Formik>
      </div>
    </div>
  );
}

export default CreateApp;
