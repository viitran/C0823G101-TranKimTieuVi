import bookReducer from "./book-management";
import {combineReducers} from 'redux';

export const rootReducer = combineReducers({
    book: bookReducer
    // có bao nhiêu reducer thì cứ khai báo ở đây rồi nó sẽ gộp thành 1 cây lớn là rootReducer
})