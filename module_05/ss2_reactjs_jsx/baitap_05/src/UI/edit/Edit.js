import { Formik, Form, Field, ErrorMessage } from "formik";
import * as Yup from "yup";
import { useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import { update } from "../../Services/PostService";
import { findById } from "../../Services/PostService";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useParams } from "react-router-dom";
function Edit() {

  const [posts, setPosts] = useState();
  const navigate = useNavigate();
  const params = useParams();
  
  const handleNavigateBack = () => {
    navigate("/");
  };

  useEffect(() => {
    const { id } = params;
    console.log(id);
    if (params && id) {
      findById(id).then((res) => setPosts(res));
    }
  }, [params]);

  const edit = async (post) => {
    await update(post);
    toast("Update Success");
    navigate("/");
  };

  if (!posts) return <div>Loading</div>;

  return (
    <div className="parent">
      <div className="container-edit">
        <h2 className="title">Updated</h2>
        <Formik
          initialValues={posts}
          validationSchema={Yup.object({
            title: Yup.string().required(),
            slug: Yup.string().required(),
            category: Yup.string().required(),
            updatedAt: Yup.string().required(),
          })}
          onSubmit={(values, { isSubmitting }) => {
            edit(values);
            isSubmitting(false);
          }}
        >
          {({ isSubmitting }) => (
            <Form>
              <div className="form-group">
                <label htmlFor="title">Title</label>
                <Field type="text" className="form-control" name="title" />
                <ErrorMessage name="title" />
              </div>

              <div className="form-group">
                <label htmlFor="slug">Slug</label>
                <Field type="text" className="form-control" name="slug" />
                <ErrorMessage name="slug" />
              </div>

              <div className="form-group">
                <label htmlFor="category">Category</label>
                <Field type="text" className="form-control" name="category" />
                <ErrorMessage name="category" />
              </div>

              <div className="form-group">
                <label htmlFor="updatedAt">Updated At</label>
                <Field type="text" className="form-control" name="updatedAt" />
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
  );
}
export default Edit;
