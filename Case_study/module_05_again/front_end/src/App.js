import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import List from "./UI/List";
import Body from "./UI/Body/Body";
import EmployeeList from "./UI/List/employee/EmployeeList";
import CreateEmployee from "./UI/List/employee/Create/CreateEmployee";
import UpdateEmployee from './UI/List/employee/Update/UpdateEmployee';
import CustomerList from "./UI/List/customer/CustomerList";
import CreateCustomer from "./UI/List/customer/Create/CreateCustomer";

function App() {
  return (
    // <div >
    //   <Body/>
    // </div>
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Body />}/>
          <Route path="/services" element={<List />}/>
          <Route path="/employees" element={<EmployeeList />}/>
          <Route path="/create" element={<CreateEmployee />}/>
          <Route path="/edit/:id" element={<UpdateEmployee />}/>

        <Route path="/customers" element={<CustomerList />}/> 
        <Route path="/create-customer" element={<CreateCustomer />}/> 
        <Route path="/edit-customer/:id" element={<CustomerList />}/> 

        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
