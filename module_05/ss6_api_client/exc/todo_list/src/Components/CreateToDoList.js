import { Formik, Form, Field } from "formik";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import * as listService from "../Service/ToDoListService";
import { useNavigate } from "react-router-dom";

function CreateList() {
     const navigate = useNavigate();
  return (
    <div>
      <Formik
        initialValues={{
          title: "",
        }}
        onSubmit={(value, { setSubmitting }) => {
          const create = async (list) => {
            setSubmitting(false);
            await listService.save(list);
            toast("Add success");
           navigate("/");
          };
          create(value);
          //   setTimeout(() => {
          //     setSubmitting(false);
          //     toast("Add success");
          //   }, 2000);
        }}
      >
        {({ isSubmitting }) => (
          <Form>
            <label>Title: </label>
            <Field type="text" name="title" />
            {isSubmitting ? (
              <div class="loader"></div>
            ) : (
              <button type="submit">Submit</button>
            )}
          </Form>
        )}
      </Formik>
    </div>
  );
}
export default CreateList;
