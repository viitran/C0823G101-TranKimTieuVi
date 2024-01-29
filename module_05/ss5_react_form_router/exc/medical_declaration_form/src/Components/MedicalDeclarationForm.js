import { Formik, Form, Field, ErrorMessage } from "formik";
import { Bounce, ToastContainer, toast } from "react-toastify";
import * as Yup from "yup";

function MedicalDeclarationForm() {
  return (
    <div>
      <Formik
        initialValues={{
          name: "",
          identity: "",
          birthday: "",
          gender: "",
          nationality: "",
          workCompany: "",
          workParts: "",
          healthInsuranceCard: ["Có thẻ BHYT"],
          city: "",
          district: "",
          wards: "",
          street: "",
          phoneNumber: "",
          email: "",
          informationCity: "",
          symptoms: ["", "", "", "", "", ""],
          contact: ["", "", ""],
        }}

        validationSchema={Yup.object({
          name: Yup.string().required("Không được bỏ trống"),
          identity: Yup.string().required("Không được bỏ trống"),
          birthday: Yup.date()
            .required("không được bỏ trống")
            .min(
              "1900-01-01",
              "Ngày sinh phải lớn hơn hoặc bằng ngày 01/01/1900"
            ),
          nationality: Yup.string().required("Không được bỏ trống"),
          city: Yup.string().required("Không được bỏ trống"),
          district: Yup.string().required("Không được bỏ trống"),
          wards: Yup.string().required("Không được bỏ trống"),
          street: Yup.string().required("Không được bỏ trống"),
          phoneNumber: Yup.string().required("Không được bỏ trống"),
          email: Yup.string()
            .required("Không được bỏ trống")
            .email("Không đúng định dạng! Vui lòng nhập lại"),
        })}

        onSubmit={(value, {setSubmitting}) => {
          setTimeout(() => {
            setSubmitting(false);
            toast("Khai báo thành công");
          }, 2000);
        }}
      >
        {({ isSubmitting }) => (
          <div>
            <Form>
              <h3>Tờ khai báo y tế</h3>
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputName">
                  Họ tên
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputName"
                    type="text"
                    name="name"
                  />
                  <ErrorMessage name="name" component="span" />
                </div>
              </div>
              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputIdentity"
                >
                  Số hộ chiếu /CMND
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputIdentity"
                    type="text"
                    name="identity"
                  />
                  <ErrorMessage name="identity" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputBirthday"
                >
                  Năm sinh
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputBirthday"
                    type="date"
                    name="birthday"
                  />
                  <ErrorMessage name="birthday" component="span" />
                </div>
              </div>

              <fieldset className="row mb-3">
                <legend className="col-form-label col-sm-2 pt-0">
                  Giới tính
                </legend>
                <div className="col-sm-10">
                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="gridRadios1"
                      type="radio"
                      value="0"
                      name="gender"
                    />
                    <label className="form-check-label" htmlFor="gridRadios1">
                      Nam
                    </label>
                  </div>
                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="gridRadios2"
                      name="gender"
                      type="radio"
                      value="1"
                    />
                    <label className="form-check-label" htmlFor="gridRadios2">
                      Nữ
                    </label>
                  </div>
                </div>
              </fieldset>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputNationality"
                >
                  Quốc tịch
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputNationality"
                    type="text"
                    name="nationality"
                  />
                  <ErrorMessage name="nationality" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputWorkCompany"
                >
                  Công ty làm việc
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputWorkCompany"
                    type="text"
                    name="workCompany"
                  />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputWorkParts"
                >
                  Bộ phận làm việc
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputWorkParts"
                    type="text"
                    name="workParts"
                  />
                </div>
              </div>

              <div className="row mb-3">
                <div className="col-sm-10 offset-sm-2">
                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="healthInsuranceCard"
                      type="checkbox"
                      value="Có thẻ BHYT"
                      name="healthInsuranceCard"
                    />
                    <label
                      className="form-check-label"
                      htmlFor="healthInsuranceCard"
                    >
                      Có thẻ BHYT
                    </label>
                  </div>
                </div>
              </div>

              <h3>Địa chỉ liên lạc tại Việt Nam</h3>
              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputCity">
                  Tỉnh thành
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputCity"
                    type="text"
                    name="city"
                  />
                  <ErrorMessage name="city" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputDistrict"
                >
                  Quận/Huyện
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputDistrict"
                    type="text"
                    name="district"
                  />
                  <ErrorMessage name="district" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputWards">
                  Phường xã
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputWards"
                    type="text"
                    name="wards"
                  />
                  <ErrorMessage name="wards" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputStreet"
                >
                  Số nhà, phố, tổ dân phố /thôn /đội
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputStreet"
                    type="text"
                    name="street"
                  />
                  <ErrorMessage name="street" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputPhoneNumber"
                >
                  Điện thoại
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputPhoneNumber"
                    type="text"
                    name="phoneNumber"
                  />
                  <ErrorMessage name="phoneNumber" component="span" />
                </div>
              </div>

              <div className="row mb-3">
                <label className="col-sm-2 col-form-label" htmlFor="inputEmail">
                  Email
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputEmail"
                    type="email"
                    name="email"
                  />
                  <ErrorMessage name="email" component="span" />
                </div>
              </div>

              <br />

              <div className="row mb-3">
                <label
                  className="col-sm-2 col-form-label"
                  htmlFor="inputInformationCity"
                >
                  Trong vòng 14 ngày qua, Anh/Chị có đến quốc gia /vùng lãnh thổ
                  nào(Có thể đi qua nhiều quốc gia)
                </label>
                <div className="col-sm-10">
                  <Field
                    className="form-control"
                    id="inputInformationCity"
                    type="text"
                    name="informationCity"
                  />
                </div>
              </div>

              <label className="col-sm-2 col-form-label">
                Trong vòng14 ngày qua, Anh/Chị có thấy xuất hiện bất cứ dấu hiệu
                nào sau đây không?
              </label>
              <div className="row mb-3">
                <div className="col-sm-10 offset-sm-2">
                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="fever"
                      type="checkbox"
                      value="Sốt"
                      name="symptoms"
                    />
                    <label className="form-check-label" htmlFor="fever">
                      Sốt
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="cough"
                      type="checkbox"
                      value="Ho"
                      name="symptoms"
                    />
                    <label className="form-check-label" htmlFor="cough">
                      Ho
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="difficultyBreathing"
                      type="checkbox"
                      value="Khó thở"
                      name="symptoms"
                    />
                    <label
                      className="form-check-label"
                      htmlFor="difficultyBreathing"
                    >
                      Khó thở
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="pneumonia"
                      type="checkbox"
                      value="Viêm phổi"
                      name="symptoms"
                    />
                    <label className="form-check-label" htmlFor="pneumonia">
                      Viêm phổi
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="soreThroat"
                      type="checkbox"
                      value="Đau họng"
                      name="symptoms"
                    />
                    <label className="form-check-label" htmlFor="soreThroat">
                      Đau họng
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="fatigue"
                      type="checkbox"
                      value="Mệt mỏi"
                      name="symptoms"
                    />
                    <label className="form-check-label" htmlFor="fatigue">
                      Mệt mỏi
                    </label>
                  </div>
                </div>
              </div>

              <label className="col-sm-2 col-form-label">
                Trong vòng 14 ngày qua, Anh/Chị có tiếp xúc với?
              </label>
              <div className="row mb-3">
                <div className="col-sm-10 offset-sm-2">
                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="patient"
                      type="checkbox"
                      value="Người bệnh hoặc nghi ngờ, mắc bệnh COVID-19"
                      name="contact"
                    />
                    <label className="form-check-label" htmlFor="patient">
                      Người bệnh hoặc nghi ngờ, mắc bệnh COVID-19
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="traveler"
                      type="checkbox"
                      value="Người từ nước có bệnh COVID-19"
                      name="contact"
                    />
                    <label className="form-check-label" htmlFor="traveler">
                      Người từ nước có bệnh COVID-19
                    </label>
                  </div>

                  <div className="form-check">
                    <Field
                      className="form-check-input"
                      id="symptomatic"
                      type="checkbox"
                      value="Người có biểu hiện (Sốt, ho, khó thở, viêm phổi)"
                      name="contact"
                    />
                    <label className="form-check-label" htmlFor="symptomatic">
                      Người có biểu hiện (Sốt, ho, khó thở, viêm phổi)
                    </label>
                  </div>
                </div>
              </div>

              <div>
                {isSubmitting ? (
                  <div class="loader"></div>
                ) : (
                  <button className="btn btn-primary" type="submit">
                    Gửi
                  </button>
                )}
              </div>
            </Form>
          </div>
        )}
      </Formik>

      <ToastContainer
        position="top-right"
        autoClose={5000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="dark"
        transition={Bounce}
      />
    </div>
  );
}
export default MedicalDeclarationForm;
