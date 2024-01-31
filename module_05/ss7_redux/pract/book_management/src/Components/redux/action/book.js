import bookService from "../../../Service/Library-service";
import { GET_ALL_BOOK , CREATE_BOOK} from "./types";

export const getAllBook = () => async (dispatch) => {
  try {
    const resp = await bookService.findAll();
    dispatch({
      type: GET_ALL_BOOK,
      payload: resp.data,
    });
  } catch (error) {
    console.log(error);
  }
};

export const createBook = (book) => async (dispatch) => {
  try {
    const resp = await bookService.save(book);
    dispatch({
      type: CREATE_BOOK,
      payload: resp.data,
    });
  } catch (error) {
    console.log(error);
  }
};
