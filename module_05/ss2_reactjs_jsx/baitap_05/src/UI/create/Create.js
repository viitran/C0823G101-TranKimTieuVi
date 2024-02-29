import { Formik, Form, Field } from "formik";
import { toast } from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import { useNavigate } from "react-router-dom";
import * as p from "../../Services/PostService";
function Create() {
  const navigate = useNavigate();
  const handleNavigateBack = () => {
    navigate("/");
  };
  const create = async (post) => {
  await p.create(post);
  toast("Register Post Success");
  navigate("/");
  }
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
        {({ isSubmitting }) => (
          <div className="container">
            <h2 className="title">Register Post</h2>
            <Form>
              <div className="form-group">
                <label htmlFor="title">Title</label>
                <Field className="input" type="text" id="title" name="title" />
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

                <button type="submit" className="submit-button" disabled={isSubmitting}>
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
