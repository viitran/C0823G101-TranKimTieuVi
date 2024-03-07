import { useNavigate, useParams } from "react-router-dom";
import { Form, Field, Formik } from "formik";
import Header from "./../Header/Header";
import Footer from "../Footer/Footer";
import { useEffect, useState } from "react";
import { findAllTags, findById, update } from "../../Services/BlogServices";

function UpdateBlogApp() {
  const navigate = useNavigate();
  const [tags, setTags] = useState();
  const [blogs, setBlogs] = useState();
  const params = useParams();

  useEffect(() => {
    const { id } = params;
    if (params && id) {
      findById(id).then((res) => {
        const blog = { ...res, tags: JSON.stringify(res.tags) };
        setBlogs(blog);
      });
    }
  }, [params]);

  useEffect(() => {
    findAllTags().then((res) => setTags(res));
  }, []);

  const handleNavigateBack = () => {
    navigate("/");
  };

  if (!blogs) return <div className="loader"></div>;
  if (!tags) return <div className="loader"></div>;

  return (
    <>
      <Header />

      <div className="display div-shadow">
        <div className="col-lg-1"></div>
        <div className="col-lg-10 form-center">
          <Formik
            initialValues={blogs}
            onSubmit={(values, { setSubmitting }) => {
              const blog = {
                ...values,
                tags: JSON.parse(values.tags),
              };
              update(blog).then((res) => {
                setSubmitting(false);
                navigate("/");
              });
            }}
          >
            <Form>
              <div className="form">
                <label className="label">Title Blog </label>
                <div>
                  <Field className="input" name="title" />
                </div>
                <label className="label">Author </label>
                <div>
                  <Field className="input" name="author" />
                </div>
                <label className="label">Content</label>
                <div>
                  <Field className="input" name="content" />
                </div>
                <label className="label">Tags</label>
                <div>
                  <Field as="select" name="tags" className="input">
                    <option className="value-select" disabled value={""}>
                      chon tags
                    </option>
                    {tags.map((tag) => (
                      <option value={JSON.stringify(tag)} key={tag.id}>
                        {tag.name}
                      </option>
                    ))}
                  </Field>
                </div>
                <label className="label">Published</label>
                <div>
                  <Field className="input" name="published" />
                </div>
                <label className="label">Image</label>
                <div>
                  <Field className="input" name="image" />
                </div>{" "}
                <br />
                <div className="button">
                  <button className="btn" type="submit">
                    Update
                  </button>{" "}
                  <button className="btn" onClick={handleNavigateBack}>
                    Cancel
                  </button>
                </div>
              </div>
            </Form>
          </Formik>
        </div>
      </div>
      <div className="col-lg-2"></div>
      <Footer />
    </>
  );
}
export default UpdateBlogApp;
