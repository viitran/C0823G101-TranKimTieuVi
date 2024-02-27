import { GET_ALL_BOOK, CREATE_BOOK, UPDATE_BOOK, DELETE_BOOK } from "../action/types";
const initialValue = [];
const bookReducer = (books = initialValue, action) => {
  const { type, payload } = action;

  switch (type) {
    case GET_ALL_BOOK:
      console.log(payload);
      return payload;
    case CREATE_BOOK:
      return [...books, payload];
    case UPDATE_BOOK:
      return [...books, payload];
    case DELETE_BOOK:
      return payload;
    default:
      return books;
  }
};

export default bookReducer;
