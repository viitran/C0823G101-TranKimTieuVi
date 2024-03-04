import React from "react";
import { useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import * as clo from "../../Services/ClothingServices";
import * as cate from "../../Services/CategoryServices";
import { useParams } from "react-router-dom";
import { ErrorMessage, Formik, Field, Form } from "formik";
import {toast} from "react-toastify";
import * as Yup from "yup";
function EditApp() {
  const [categories, setCategories] = useState();
  const [product, setProduct] = useState();
  const navigate = useNavigate();
  const params = useParams();

  const handleNavigateBackHome = () => {
    navigate("/");
  };  

  useEffect(() => {
    const { id } = params;
    console.log(id);
    if (params && id) {
      clo.findById(id).then((res) => {
        const p = { ...res, category: JSON.stringify(res.category) };
        console.log(p);
        setProduct(p);      
      });
    }
  }, [params]);

  useEffect(() => {
    cate.findAllCategories().then((res) => setCategories(res));
  }, []);

  if (!product) return <div>Loading...</div>;
  if (!categories) return <div>Loading...</div>;

  return (
    <div class="parent">
      <div class="container">
        <h2 class="title">Cập nhật</h2>

        <Formik
          initialValues={product}
          validationSchema={Yup.object({
            name: Yup.string().max(100, "Không được nhập dài quá 100 kí tự"),
            date: Yup.date(),
            quantity: Yup.number().min(0,"Vui lòng nhập số nguyên lớn hơn 0"),
          })}
          onSubmit={(values, { setSubmitting }) => {
            const productObj = {
              ...values,
              category: JSON.parse(values.category),
            };
            clo.update(productObj).then((res) => {
              toast("ok");
              navigate("/");
              setSubmitting(false);
            });
          }}
        >
          {({ isSubmitting }) => (
            <Form>
              <div class="form-group">
                <label htmlFor="name">Tên:</label>
                <Field type="text" className="form-control" name="name" />
                <ErrorMessage name="name" />
              </div>

              <div class="form-group">
                <label htmlFor="code">Mã sản phẩm:</label>
                <Field type="text" className="form-control" name="code" />
              </div>

              <div class="form-group">
                <label htmlFor="date">Ngày nhập:</label>
                <Field type="date" className="form-control" name="date" />
                <ErrorMessage name="date" />
              </div>

              <div class="form-group">
                <label htmlFor="quantity">Số lượng:</label>
                <Field type="text" className="form-control" name="quantity" />
                <ErrorMessage name="quantity" />
              </div>

              <div class="form-group">
                <label>Loại sản phẩm: </label>
                <Field
                  name="category"
                  as="select"
                  class="my-select form-control"
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

              <div>
                <button
                  type="submit"
                  class="update-button"
                  disabled={isSubmitting}
                >
                  Cập nhật
                </button>
                <button onClick={handleNavigateBackHome} class="back-button">
                  Quay lai
                </button>
              </div>
            </Form>
          )}
        </Formik>
      </div>
    </div>
  );
}
export default EditApp;
