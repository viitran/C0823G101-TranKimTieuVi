import { Form, Field, Formik } from "formik";
import { useEffect, useState } from "react";
import * as bookService from "../Service/BookService";
import { useNavigate, useParams } from "react-router-dom";
function BookUpdate() {
  const { id } = useParams();
  const [book, setBook] = useState({});
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      // const { id } = params;
      // if (params && id) {
      try {
        const res = await bookService.findById(id);
        setBook(res);
      } catch (error) {
        console.error(error);
      }
      // }
    };

    fetchData();
  }, [id]);

  return (
    <div>
      <Formik
      // tại sao phải có dòng 30 mới binding được? 
      // tại sao kh initialValues = {{book}} mà không binding được ?
        enableReinitialize={true} 
        initialValues={{
          id: book.id,
          title: book.title,
          quantity: book.quantity,
        }}
        onSubmit={(values) => {
          const bookUpdate = async (book) => {
            await bookService.update(book);
            navigate("/");
          };
          bookUpdate(values);
        }}
      >
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
