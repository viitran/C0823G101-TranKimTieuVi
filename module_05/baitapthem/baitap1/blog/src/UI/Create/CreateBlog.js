import { Formik, Form, Field, ErrorMessage } from "formik";
import Footer from "../Footer/Footer";
import Header from "../Header/Header";
import * as Yup from "yup";
import { useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import { findAllTags } from "../../Services/BlogServices";
import { save } from "./../../Services/BlogServices";

function CreateBlogApp() {
  const navigate = useNavigate();
  const [tags, setTags] = useState();

  const handleNavigateBack = () => {
    navigate("/");
  };

  useEffect(() => {
    findAllTags().then((res) => setTags(res));
  }, []);

  if (!tags) return <div className="loader"></div>;

  return (
    <>
      <Header />

      <div className="display div-shadow">
        <div className="col-lg-1"></div>
        <div className="col-lg-10 form-center">
          <Formik
            initialValues={{
              title: "",
              author: "",
              content: "",
              tags: "",
              published: "",
              image: "",
            }}
            validationSchema={Yup.object({
              title: Yup.string()
                .required("Not be empty!")
                .max(
                  100,
                  "The title must be at least greater than 1 and less than 100 words in length"
                ),
              author: Yup.string().default("Anonymous"),
              content: Yup.string().default("Not content yet"),
              published: Yup.string().required(
                "Please clearly state the date of posting"
              ),
              image: Yup.string().default("not img yet"),
            })}
            onSubmit={(values, { setSubmitting }) => {
              const blog = {
                ...values,
                tags: JSON.parse(values.tags),
              };
              save(blog).then((res) => {
                console.log(res.data);
                setSubmitting(false);
                navigate("/");
              });
            }}
          >
            {({ isSubmitting }) => (
              <Form>
                <div className="form">
                  <label className="label">Title Blog </label>
                  <div>
                    <Field className="input" name="title" />
                    <ErrorMessage
                      name="title"
                      component="span"
                      className="error-message"
                    />
                  </div>
                  <label className="label">Author </label>
                  <div>
                    <Field className="input" name="author" />
                    <ErrorMessage name="author" component="span" />
                  </div>
                  <label className="label">Content</label>
                  <div>
                    <Field className="input" name="content" />
                    <ErrorMessage
                      name="content"
                      component="span"
                      className="error-message"
                    />
                  </div>
                  <label className="label">Tags</label>
                  <div>
                    <Field name="tags" as="select" className="input">
                      <option className="value-select" disabled value={""}>
                        Choose Tags Blog
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
                    <ErrorMessage
                      name="published"
                      component="span"
                      className="error-message"
                    />
                  </div>
                  <label className="label">Image</label>
                  <div>
                    <Field className="input" name="image" />
                    <ErrorMessage
                      name="image"
                      component="span"
                      className="error-message"
                    />
                  </div>{" "}
                  <br />
                  <div className="button">
                    <button
                      className="btn"
                      type="submit"
                      disabled={isSubmitting}
                    >
                      Create
                    </button>{" "}
                    <button className="btn" onClick={handleNavigateBack}>
                      Cancel
                    </button>
                  </div>
                </div>
              </Form>
            )}
          </Formik>
        </div>
      </div>
      <div className="col-lg-2"></div>
      <Footer />
    </>
  );
}
export default CreateBlogApp;
