import { Formik, Field, Form, setFieldValue, ErrorMessage } from "formik";
import { useNavigate } from "react-router-dom";
import { save } from "../../Services/BlogServices";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import * as Yup from "yup";
import * as unorm from "unorm";
// -------------------------------------------------
const NONLATIN = /[^\w-]/g;
const WHITESPACE = /\s/g;
const EDGESDHASHES = /^-|-$/g;

function CreateBlog() {
  const navigate = useNavigate();

  const handleNavigateBack = () => {
    navigate("/");
  };

  const create = (blog) => {
    save(blog);
    toast("Add new Blog successfully!");
    navigate("/");
  };

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

  return (
    <>
      <div>
        <Formik
          initialValues={{
            title: "",
            slug: "",
            content: "",
            category: "",
            updatedAt: "",
          }}
          validationSchema={Yup.object({
            title: Yup.string().required("Vui lòng nhập đẩy đủ thông tin"),
            slug: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
            category: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
            content: Yup.string().required("Vui lòng nhập đầy đủ thông tin"),
          })}
          onSubmit={(values, { setSubmitting }) => {
            create(values);
            setSubmitting(false);
          }}
        >
          {({ isSubmitting, setFieldValue }) => (
            <div className="container">
              <h2 className="title">Register Blog</h2>
              <Form>
                <div className="form-group">
                  <label htmlFor="title">
                    Title (<span style={{ color: "red" }}>*</span>)
                  </label>
                  <Field
                    className="input"
                    type="text"
                    id="title"
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
                  <Field className="input" type="text" id="slug" name="slug" />
                  <ErrorMessage
                    name="slug"
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
                  <Field
                    className="input"
                    type="text"
                    id="category"
                    name="category"
                  />
                  <ErrorMessage
                    name="category"
                    component="div"
                    className="error-message"
                  />
                </div>

                <div className="form-group">
                  <label htmlFor="updatedAt">Updated At </label>
                  <Field
                    className="input"
                    type="text"
                    id="updatedAt"
                    name="updatedAt"
                  />
                </div>

                <div>
                  <button
                    type="submit"
                    className="submit-button"
                    disabled={isSubmitting}
                  >
                    Register
                  </button>

                  <br />
                  <br />
                  <button className="back-button" onClick={handleNavigateBack}>
                    Back
                  </button>
                </div>
              </Form>
            </div>
          )}
        </Formik>
      </div>
    </>
  );
}
export default CreateBlog;
