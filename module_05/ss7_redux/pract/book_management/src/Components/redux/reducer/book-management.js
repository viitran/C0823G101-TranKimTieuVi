import { GET_ALL_BOOK, CREATE_BOOK } from "../action/types";
const initialValue = [];
const bookReducer = (books = initialValue,action) => {
    const {type , payload} = action;

    switch (type) {
        case GET_ALL_BOOK:
            console.log(payload);
            return payload;
        case CREATE_BOOK:
            return [...books,payload];
        default:
            return books;
    }
}

export default bookReducer;