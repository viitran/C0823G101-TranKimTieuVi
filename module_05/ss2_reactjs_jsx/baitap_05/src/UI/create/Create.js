import { Formik, Form, Field } from "formik";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useNavigate } from "react-router-dom";
import * as p from "../../Services/PostService";
import * as unorm from "unorm";

const NONLATIN = /[^\w-]/g;
const WHITESPACE = /\s/g;
const EDGESDHASHES = /^-|-$/g;
function Create() {
  const navigate = useNavigate();
  const handleNavigateBack = () => {
    navigate("/");
  };
  const create = async (post) => {
    await p.create(post);
    toast("Register Post Success");
    navigate("/");
  };


  function toSlug(input) {
    const noWhitespace = input.replace(WHITESPACE, "-");
    const normalized = unorm.nfd(noWhitespace); // Sử dụng thư viện unorm để chuẩn hóa
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
    <div>
      <Formik
        initialValues={{
          title: "",
          slug: "",
          category: "",
          updatedAt: "",
        }}
        onSubmit={(values, { setSubmitting }) => {
          create(values);
          setSubmitting(false);
        }}
      >
        {({ isSubmitting, setFieldValue }) => (
          <div className="container">
            <h2 className="title">Register Post</h2>
            <Form>
              <div className="form-group">
                <label htmlFor="title">Title</label>
                <Field
                  className="input"
                  type="text"
                  id="title"
                  name="title"
                  onKeyUp={(e) => handleInputChange(e, setFieldValue)}
                />
              </div>

              <div className="form-group">
                <label htmlFor="slug">Slug</label>
                <Field className="input" type="text" id="slug" name="slug" />
              </div>

              <div className="form-group">
                <label htmlFor="category">Category</label>
                <Field
                  className="input"
                  type="text"
                  id="category"
                  name="category"
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
  );
}
export default Create;
