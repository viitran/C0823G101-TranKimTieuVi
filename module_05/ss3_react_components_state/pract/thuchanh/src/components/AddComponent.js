// import { Component } from "react";

// class AppComponent extends Component{
//     render(){
//         return <div><h1>{this.props.firstNumber + this.props.secondNumber}</h1></div>
//     }
// }

function AppFunctionComponent(props){
    return(
         <h1>{props.firstNumber + props.secondNumber}</h1>
    );
}
export default AppFunctionComponent;
