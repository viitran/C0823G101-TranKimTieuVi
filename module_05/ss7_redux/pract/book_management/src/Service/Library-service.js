
import req from "../Components/Http-common";

 const findAll = async () => {
  return req.get(`/books`);
};

 const remove = async (id) => {
  return req.delete(`/${id}`);
};

 const save = async (book) => {
  return req.post(`${book}`);
};

 const update = async (book) => {
  return req.put(`/${book.id}`, book);
};

const bookService = {
    findAll,
    remove,
    save,
    update
}

export default bookService;