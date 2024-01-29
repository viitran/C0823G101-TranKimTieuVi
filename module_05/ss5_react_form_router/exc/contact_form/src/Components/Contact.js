// import { useState } from "react";
import { Formik,Form, Field, ErrorMessage } from "formik";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import * as Yup from 'yup';

function FormContact() {
  return (
    <div>
      <h3 className="title">Contact Form</h3>
      <Formik
        initialValues={{
            name: '',
            email: '',
            phone: '',
            message: '',
        }}
        validationSchema={Yup.object({
            name: Yup.string()
            .required("Không được bỏ trống")
            .matches(/^[a-zA-Z]+$/,"Vui lòng nhập đúng tên của bạn"),
            email: Yup.string()
            .required("Không được bỏ trống")
            .matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,"Vui lòng nhập đúng định dạng: abc@gmail.com"),
            phone: Yup.number()
            .required("Không được bỏ trống"),
            message: Yup.string()
            .required("Không được bỏ trống")
            .min(10,"tin nhắn phải ít nhất có 10 ký tự")
        })}


         onSubmit={(value,{setSubmitting})=>{
            setTimeout(()=>{
                setSubmitting(false);
            toast("Liên hệ thành công");
            },2000)
        }}
      >
        {
            ({isSubmitting}) => ( 
            <div className="container">
            <Form>
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputName">
                  Name
                </label>
                <div className="col-sm-10">
                  <Field className="form-control" id="inputName" type="text" 
                      name='name' 
                  />
                  <ErrorMessage name="name" component='span'className="error-mess"/>
                </div>
              </div>
  
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputEmail">
                  Email
                </label>
                <div className="col-sm-10">
                  <Field className="form-control" id="inputEmail" type="email" 
                      name='email'
                  />
                  <ErrorMessage name="email" component='span'className="error-mess"/>
                </div>
              </div>
  
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputPhone">
                  Phone
                </label>
                <div className="col-sm-10">
                  <Field className="form-control" id="inputPhone" type="text"
                      name='phone'
                  />
                  <ErrorMessage name="phone" component='span'className="error-mess"/>
                </div>
              </div>
  
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputMessage">
                  Message
                </label>
                <div className="col-sm-10">
                  <Field
                  as="textarea"
                    className="form-control"
                    id="inputMessage"
                    type="text"
                    name='message'
                  />
                  <ErrorMessage name="message" component='span'className="error-mess"/>
                </div>
              </div>
  
              <div>
                {isSubmitting ? <span>Loading</span> : <button className="btn btn-primary" type="submit" >Submit</button>}
              </div>

            </Form>
            </div>
            )
        }
       
      </Formik>

      <ToastContainer position="top-right"
autoClose={5000}
hideProgressBar={false}
newestOnTop={false}
closeOnClick
rtl={false}
pauseOnFocusLoss
draggable
pauseOnHover
theme="dark"  />
    </div>
    
  );
}

export default FormContact;
