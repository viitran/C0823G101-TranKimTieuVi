import React, { useState, useEffect } from "react";
import * as book from "../../Services/LibraryService";
import * as category from "../../Services/CategoryService";
function LibraryApp() {
  const [books, setBooks] = useState();
  const [category, setCategory] = useState();

  const getAllCategories = async () => {
      try {
        const result = await category.findAllCategory();
        return result.data;
      } catch (error) {
        console.log(error);
      }
  }

  const getAllBooks = async () => {
    try {
      const result = await book.findAll();
      return result.data;
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getAllBooks();
  },[]);

  if(!books) return <div>loading</div>;

  return (
    <>
      <table class="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Tên sách</th>
            <th>Tác giả</th>
            <th>Thể loại</th>
            <th>Trạng thái</th>
          </tr>
        </thead>
        <tbody>
          {books.map((book, index) => (
            <tr key={book.id}>
              <td>{index + 1}</td>
              <td>{book.name}</td>
              <td>{book.author}</td>
              <td>{book.category.name}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}
export default LibraryApp;
