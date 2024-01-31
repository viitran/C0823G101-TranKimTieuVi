import { useEffect, useState } from "react";
import * as listService from "../Service/ToDoListService";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
function ToDoList() {
  const [list, setList] = useState([]);

  useEffect(() => {
    const fetchApi = async () => {
      try {
        const result = await listService.findAll();
        setList(result);
      } catch (error) {
        console.log(error);
      }
    };
    fetchApi();
  }, []);

  return (
    <div>
      <h3>Todo List</h3>
      <div>
        <b>Title:</b>
        <ul>
          {list.map((item) => (
            <li key={item.id}>
              <ul>{item.title}</ul>
            </li>
          ))}
        </ul>
      </div>
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
      />
    </div>
  );
}

export default ToDoList;
