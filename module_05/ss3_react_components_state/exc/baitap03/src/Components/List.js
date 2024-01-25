import  {Component} from 'react';
import "bootstrap/dist/css/bootstrap.css";

class Student extends Component {
    constructor(props) {
        super(props);
        this.state={
            students : [
                {id:1,Name : "Vi Trần",Age:19,Address: "Côn Đảo"},
                {id:2,Name : "Vi",Age:19,Address: "280 Trần Hưng Đạo"}
            ]
        }
    }
    render() {
        return (
            <div>
            <h1>Danh sách sinh viên</h1>
                <table>
                    <tr>
                        <td>ID</td>
                        <td>Tên</td>
                        <td>Tuổi</td>
                        <td>Địa chỉ</td>
                    </tr>
                    {this.state.students.map(student =>(
                        <tr key={student.id}>
                            <td>{student.id}</td>
                            <td>{student.Name}</td>
                            <td>{student.Age}</td>
                            <td>{student.Address}</td>
                        </tr>
                    ))}
                </table>
            </div>
        );
    }
}

export default Student; 