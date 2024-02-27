import { useEffect, useState } from "react";
import * as bookService from "../../Service/BookService";
import { ToastContainer, Bounce } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useNavigate, useParams } from "react-router-dom";
function ListBook() {
  const [book, setBook] = useState([]);
  const navigate = useNavigate();
  const {id} = useParams();

  function handleRemove(id){
    const remove = async(id)=>{
      try {
        await bookService.remove(id);
        getAll();
      } catch (error) {
        console.log(error);
      }
    }
    remove(id);
  }

  const handleUpdateBook = (bookId) => {
    navigate(`/edit/${bookId}`);
  }

  const getAll = async () => {
    try {
      const result = await bookService.findAll();
      setBook(result);
    } catch (error) {
      console.log(error);
    }
  };
  

  useEffect(() => {
    getAll();
  }, []);



  if (!book) return <div class="loader"></div>;

  return (
    <div>
      <h1>List Book</h1>
      <table class="table">
        <thead class="table">
          <tr>
            <th>#</th>
            <th>Title</th>
            <th>Quantity</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody class="table">
          {book.map((books, index) => (
            <tr key={books.index}>
              <td>{index + 1}</td>
              <td>{books.title}</td>
              <td>{books.quantity}</td>
              <td>
                <button
                  class="btn btn-primary me-md-2"
                  onClick={ (e)=> handleUpdateBook(books.id)}
                >
                  Update
                </button>
                <button
                  class="btn btn-primary"
                  onClick={e => handleRemove(books.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <ToastContainer
        position="top-right"
        autoClose={5000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="dark"
        transition={Bounce}
      />
    </div>
  );
}
export default ListBook;
