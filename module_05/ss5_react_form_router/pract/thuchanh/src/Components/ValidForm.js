import React, { useState } from "react";

// function Form() {
//   const [state, setState] = useState({
//     username: "",
//     age: null
//   });
//   const handleChange = event => {
//     let nam = event.target.name;
//     let val = event.target.value;
//     if (nam === "age") {
//       if (!Number(val)) {
//         alert("Your age must be a number");
//       }
//     }
//     setState({ ...state, [nam]: val });
//   };

//   return (
//     <form>
//       <h1>
//         Hello {state.username} {state.age}
//       </h1>
//       <p>Enter your name:</p>
//       <input type="text" name="username" onChange={handleChange} />
//       <p>Enter your age:</p>
//       <input type="text" name="age" onChange={handleChange} />
//     </form>
//   );
// }

// export default Form;

// function Form() {
//   const [state, setState] = useState({
//     username: "",
//     age: null
//   });

//   const handleChange = event =>
//     setState({ ...state, [event.target.name]: event.target.value });

//   const handleSubmit = event => {
//     event.preventDefault();
//     if (!Number(state.age)) {
//       alert("Your age must be a number");
//     }
//   };
//   return (
//     <form onSubmit={handleSubmit}>
//       <h1>
//         Hello {state.username} {state.age}
//       </h1>
//       <p>Enter your name:</p>
//       <input type="text" name="username" onChange={handleChange} />
//       <p>Enter your age:</p>
//       <input type="text" name="age" onChange={handleChange} />
//       <br />
//       <br />
//       <input type="submit" />
//     </form>
//   );
// }

function Form() {
    const [state, setState] = useState({
      username: "",
      age: null,
      errormessage: ""
    });
    const handleChange = event => {
      let nam = event.target.name;
      let val = event.target.value;
      let err = "";
      if (nam === "age") {
        if (val !== "" && !Number(val)) {
          err = "Your age must be a number";
        }
      }
      setState({ ...state, [nam]: val, errormessage: err });
    };
  
    return (
      <form>
        <h1>
          Hello {state.username} {state.age}
        </h1>
        <p>Enter your name:</p>
        <input type="text" name="username" onChange={handleChange} />
        <p>Enter your age:</p>
        <input type="text" name="age" onChange={handleChange} />
        {state.errormessage}
      </form>
    );
  }
  
export default Form;