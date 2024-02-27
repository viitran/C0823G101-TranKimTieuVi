import { useSelector, useDispatch } from "react-redux";
// import * as bookService from '../../Service/Library-service';
import { useEffect } from "react";
import { getAllBook } from "../../Components/redux/action/book";
import { useNavigate } from "react-router-dom";
function LibraryApp() {
  const books = useSelector((state) => state.book);
  const dispatch = useDispatch();

  useEffect(() => {
    dispatch(getAllBook());
  }, []);

  return (
    <div>
      <table class="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Title</th>
            <th>Quantity</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {books.map((book, index) => (
            <tr key={book.id}>
              <td>{index + 1}</td>
              <td>{book.title}</td>
              <td>{book.quantity}</td>
              <td>
                <button type="submit" class="btn btn-primary btn-sm">
                  Edit
                </button>
                <button type="submit" class="btn btn-secondary btn-sm">
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default LibraryApp;
