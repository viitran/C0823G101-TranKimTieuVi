import { Formik, Form, Field } from "formik";
import * as bookService from "../../../Service/BookService";
import { useNavigate } from "react-router-dom";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

export function BookCreate() {
  const navigate = useNavigate();
  return (
    <>
      <Formik
        initialValues={{
          title: "",
          quantity: "",
        }}
        onSubmit={(value, { setSubmitting }) => {
          const create = async (books) => {
            setSubmitting(false);
            await bookService.create(books);
            toast("Add book successfully!");
            navigate("/");
          };
          create(value);
        }}
      >
        {({ isSubmitting }) => (
          <div>
            <Form>
              <div className="row g-3 align-items-center">
                <div className="col-auto">
                  <label className="col-form-label" htmlFor="inputTitleBook">
                    Title book:
                  </label>
                </div>
                <div className="col-auto">
                  <Field
                    className="form-control"
                    id="inputTitleBook"
                    type="text"
                    name="title"
                  />
                </div>
                <div className="col-auto">
                  <label className="col-form-label" htmlFor="inputQuantity">
                    Quantity:
                  </label>
                </div>
                <div className="col-auto">
                  <Field
                    className="form-control"
                    id="inputQuantity"
                    type="text"
                    name="quantity"
                  />
                </div>
                <div className="col-auto">
                  {isSubmitting ? (
                    <div class="loader"></div>
                  ) : (
                    <button type="submit" class="btn btn-outline-success">
                      Add
                    </button>
                  )}
                </div>
              </div>
            </Form>
          </div>
        )}
      </Formik>
    </>
  );
}
