import { Formik, Form, Field, ErrorMessage, setFieldValue } from "formik";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { findById, update } from "../../Services/BlogServices";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import * as Yup from "yup";
import * as unorm from "unorm";
// ------------------------------

const NONLATIN = /[^\w-]/g;
const WHITESPACE = /\s/g;
const EDGESDHASHES = /^-|-$/g;

function toSlug(input) {
  const noWhitespace = input.replace(WHITESPACE, "-");
  const normalized = unorm.nfd(noWhitespace);
  const slug = normalized.replace(NONLATIN, "");
  const trimmedSlug = slug.replace(EDGESDHASHES, "");
  return trimmedSlug.toLowerCase();
}

const handleInputChange = (e, setFieldValue) => {
  const { name, value } = e.target;
  if (name === "title") {
    setFieldValue("slug", toSlug(value));
  }
};

function EditBlog() {
  const [blogs, setBlogs] = useState();
  const params = useParams();
  const navigate = useNavigate();

  const handleNavigateBack = () => {
    navigate("/");
  };

  useEffect(() => {
    const { id } = params;
    if (id && params) {
      findById(id).then((res) => setBlogs(res));
    }
  }, [params]);

  const save = (post) => {
    // bất đồng bộ -> phải sử dụng then
    // update(post);
    // toast("Update Success");
    // navigate("/");

    update(post).then((res) => {
      toast("Update Success");
      navigate("/");
    })
  };

  if (!blogs) return <div>Loading.....</div>;

  return (
    <>
      <div className="parent">
        <div className="container-edit">
          <h2 className="title">Updated</h2>
          <Formik
            initialValues={blogs}
            onSubmit={(values, { isSubmitting }) => {
              save(values);
              isSubmitting(false);
            }}
            validationSchema={Yup.object({
              title: Yup.string().required("Vui lòng nhập đẩy đủ thông tin"),
              slug: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
              category: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
              content: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
            })}
          >
            {({ isSubmitting, setFieldValue }) => (
              <Form>
                <div className="form-group">
                  <label htmlFor="title">
                    Title (<span style={{ color: "red" }}>*</span>)
                  </label>
                  <Field
                    type="text"
                    className="form-control"
                    name="title"
                    onKeyUp={(e) => handleInputChange(e, setFieldValue)}
                  />
                  <ErrorMessage
                    name="title"
                    component="div"
                    className="error-message"
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="slug">
                    Slug (<span style={{ color: "red" }}>*</span>)
                  </label>
                  <Field type="text" className="form-control" name="slug" />
                  <ErrorMessage
                    name="title"
                    component="div"
                    className="error-message"
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="content">
                    Content (<span style={{ color: "red" }}>*</span>)
                  </label>
                  <Field
                    className="input"
                    type="text"
                    id="content"
                    name="content"
                  />
                  <ErrorMessage
                    name="content"
                    component="div"
                    className="error-message"
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="category">
                    Category (<span style={{ color: "red" }}>*</span>)
                  </label>
                  <Field type="text" className="form-control" name="category" />
                  <ErrorMessage
                    name="title"
                    component="div"
                    className="error-message"
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="updatedAt">Updated At</label>
                  <Field
                    type="text"
                    className="form-control"
                    name="updatedAt"
                  />
                  <ErrorMessage name="updatedAt" />
                </div>

                <div>
                  <button
                    type="submit"
                    className="update-button"
                    disabled={isSubmitting}
                  >
                    Updated
                  </button>
                  <button onClick={handleNavigateBack} className="back-button">
                    Back
                  </button>
                </div>
              </Form>
            )}
          </Formik>
        </div>
      </div>
    </>
  );
}
export default EditBlog;
