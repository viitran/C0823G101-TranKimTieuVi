// import {Formik} from 'formik';
// import { Form } from 'react-bootstrap/lib/navbar';
function BookList(){
    return(
        <div>
            <h1>Library</h1>
            <br/>
            <lable>tiêu đề</lable>
            <br/>
            <input type="text"/>
            <br/>
            <label>Số lượng</label>
            <br/>
            <input type="text"/>
            <br/>
            <button type="submit">submit</button>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Number</th>
                    <th>Action</th>
                </tr>
            </table>
        </div>
        );

}
export default BookList;