import { Form, Field, Formik } from "formik";
import { useEffect, useState } from "react";
import * as bookService from "../Service/BookService";
import { useParams } from "react-router-dom";
function BookUpdate() {
  const params = useParams();
  const [book,setBook] = useState();

  useEffect(() =>{
    const {id} = params;
    if (params && id) {
     bookService.findById(id)
    }
  })

  return (
    <div>
      <Formik>
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
                />
              </div>
              <div className="col-auto">
                <button type="submit" class="btn btn-outline-success">
                  Edit
                </button>
              </div>
            </div>
          </Form>
        </div>
      </Formik>
    </div>
  );
}
export default BookUpdate;


