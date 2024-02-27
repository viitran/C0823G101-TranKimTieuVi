import {Component} from 'react';
class Expand extends Component{
    render() {
        return (
            <div>
                <h4>Giới thiệu</h4>
                <p>Trong ReactJs, đôi khi bạn có một số component vào từng điều
                    kiện ví dụ như trạng thái của state,props,... mà bạn muốn hiển
                    thị một hoặc một số component nào đó. Khi đó bạn có thể sử dụng Conditional
                    rendering để render ra component mà bạn mong muốn.
                </p>
            </div>
        );
    }
}
export default Expand;