import { Link } from "react-router-dom";
import Footer from "../Footer/Footer";
import Header from "../Header/Header";
import LocalPhoneIcon from "@mui/icons-material/LocalPhone";
import MailIcon from "@mui/icons-material/Mail";
import LocationOnIcon from "@mui/icons-material/LocationOn";
import NavHeader from "../NavHeader";
function Body() {
  return (
    <>
    <NavHeader/>
      <Header />
      <section className="page-section bg-primary" id="about">
        <div className="container px-4 px-lg-5">
          <div className="row gx-4 gx-lg-5 justify-content-center">
            <div className="col-lg-8 text-center">
              <h2 className="text-white mt-0 font-weight-bold">
                Khu Nghỉ Dưỡng Biển Sang Trọng Bật Nhất Khu Vực Đông Nam Á
              </h2>
              <hr className="divider divider-light" />
              <p className="text-black-75 mb-4">
                <p>
                  Hòa mình vào không gian giải trí tuyệt vời với bãi biển cát
                  trắng nắng vàng, các tiện nghi hàng đầu thế giới, và đủ loại
                  hoạt động giải trí đa dạng. Từ các môn thể thao dưới nước như
                  chèo thuyền thúng, kyak, bóng chuyền bãi biển cho đến những
                  hoạt động giải trí và thư giãn trong nhà như lớp học nấu ăn,
                  làm bánh, tô nón lá… Những trải nghiệm tuyệt vời này đang chờ
                  đón bạn tại Furama Resort Đà Nẵng.
                </p>
                Đối với các vị khách nhỏ tuổi, chúng tôi có sẵn một phòng trò
                chơi với bida và trò chơi video, một Khu vui chơi trong nhà dành
                riêng cho trẻ em với sự giám sát chuyên nghiệp và một sân chơi
                ngoài trời tuyệt vời trên bờ biển.
              </p>
              <div className="row">
                <Link to={"/"} className="btn btn-light btn-xl col">
                  Dành cho người lớn
                </Link>
                <Link to={"/"} className="btn btn-light btn-xl col">
                  Dành cho trẻ em
                </Link>{" "}
                <Link to={"/"} className="btn btn-light btn-xl col">
                  Khách không lưu trú
                </Link>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section className="page-section" id="services">
        <div className="container px-4 px-lg-5">
          <h2 className="text-center mt-0">Dịch vụ</h2>
          <hr className="divider" />
          <div className="row gx-4 gx-lg-5">
            <div className="col-lg-3 col-md-6 text-center">
              <div className="mt-5">
                <div className="mb-2">
                  <i className="bi-gem fs-1 text-primary"></i>
                </div>
                <h3 className="h4 mb-2">Spa</h3>
                <p className="text-muted mb-0">
                  Cùng đắm chìm vào khung cảnh bình yên, lắng nghe tiếng sóng vỗ
                  về tâm hồn, cảm nhận sự thanh mát của thiên nhiên hòa vào từng
                  nhịp thở, và hành trình tìm về sự tĩnh tại và khôi phục năng
                  lượng sống chỉ mới bắt đầu…
                </p>
              </div>
            </div>
            <div className="col-lg-3 col-md-6 text-center">
              <div className="mt-5">
                <div className="mb-2">
                  <i className="bi-laptop fs-1 text-primary"></i>
                </div>
                <h3 className="h4 mb-2">Hội nghị và sự kiện</h3>
                <p className="text-muted mb-0">
                  Không gian ngoài trời trên bãi biển hay bên hồ Lagoon giữa khu
                  rừng nhiệt đới rậm rạp, ngập khí trời, nước và ánh sáng có thể
                  bay cùng mọi ý tưởng sáng tạo những bữa tiệc theo chủ đề độc
                  đáo hay hoạt động team-building truyền cảm hứng hay gắn kết
                  cộng đồng. Với các dịch vụ ẩm thực, spa, giải trí kết hợp nghỉ
                  dưỡng đẳng cấp cung cấp thêm nhiều sự lựa chọn cho các nhà tổ
                  chức, khách hàng doanh nghiệp khẳng định vị thế, để lại ấn
                  tượng tốt đẹp trong lòng đối tác và khách hàng.
                </p>
              </div>
            </div>
            <div className="col-lg-3 col-md-6 text-center">
              <div className="mt-5">
                <div className="mb-2">
                  <i className="bi-globe fs-1 text-primary"></i>
                </div>
                <h3 className="h4 mb-2">Ẩm thực</h3>
                <p className="text-muted mb-0">
                  Ẩm thực tại Furama Resort Đà Nẵng kết hợp một cách độc đáo
                  giữa các món ăn truyền thống của Việt Nam và đa dạng hương vị
                  ẩm thực từ Châu Á, Ý, và châu Âu.{" "}
                </p>
              </div>
            </div>
            <div className="col-lg-3 col-md-6 text-center">
              <div className="mt-5">
                <div className="mb-2">
                  <i className="bi-heart fs-1 text-primary"></i>
                </div>
                <h3 className="h4 mb-2">Tiệc cưới</h3>
                <p className="text-muted mb-0">
                  Với không gian bãi cỏ rộng rãi, hướng nhìn ra biển hay không
                  gian bãi biển tuyệt đẹp thẳng tầm mắt hướng chân trời,… tạo
                  nên khung cảnh tuyệt đẹp cho một lễ cưới đáng nhớ tại Quần thể
                  du lịch Furama – Ariyana Đà Nẵng. Cô dâu chú rể có thể tùy
                  thích lên ý tưởng với tông màu chủ đạo, hoa trang trí, sân
                  khấu chính,… để ghi lại những dấu ấn cá nhân của từng cặp đôi.
                </p>
              </div>
            </div>
          </div>
        </div>
      </section>
      <div id="portfolio">
        <div className="container-fluid p-0">
          <div className="row g-0">
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/1.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/1.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/2.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/2.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/3.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/3.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/4.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/4.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/5.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/5.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
            <div className="col-lg-4 col-sm-6">
              <a
                className="portfolio-box"
                href="assets/img/portfolio/fullsize/6.jpg"
                title="Project Name"
              >
                <img
                  className="img-fluid"
                  src="assets/img/portfolio/thumbnails/6.jpg"
                  alt="..."
                />
                <div className="portfolio-box-caption p-3">
                  <div className="project-category text-white-50">Category</div>
                  <div className="project-name">Project Name</div>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>
      <section className="page-section bg-dark text-white">
        <div className="container px-4 px-lg-5 text-center">
          <h2 className="mb-4">
            <img src="assets/img/furama-hd.jpeg" className="img" alt="" />
          </h2>
          <div className="line-height"/>
          <p>
            <LocationOnIcon />
            103 – 105 Đường Võ Nguyên Giáp, Phường Khuê Mỹ, Quận Ngũ hành Sơn,
            Tp. Đà Nẵng, Việt Nam
          </p>
          <div className="line-height"/>
          <p>
            <LocalPhoneIcon />   84-236-3847 333/888
          </p>
          <div className="line-height"/>
          <p>
            <MailIcon />  reservation@furamavietnam.com
          </p>
        </div>
      </section>
      <section className="page-section" id="contact">
        <div className="container px-4 px-lg-5">
          <div className="row gx-4 gx-lg-5 justify-content-center">
            <div className="col-lg-8 col-xl-6 text-center">
              <h2 className="mt-0">Let's Get In Touch!</h2>
              <hr className="divider" />
              <p className="text-muted mb-5">
                Ready to start your next project with us? Send us a messages and
                we will get back to you as soon as possible!
              </p>
            </div>
          </div>
          <div className="row gx-4 gx-lg-5 justify-content-center mb-5">
            <div className="col-lg-6">
              <form id="contactForm" data-sb-form-api-token="API_TOKEN">
                <div className="form-floating mb-3">
                  <input
                    className="form-control"
                    id="name"
                    type="text"
                    placeHolder="Enter your name..."
                    data-sb-validations="required"
                  />
                  <label htmlFor="name">Full name</label>
                  <div
                    className="invalid-feedback"
                    data-sb-feedback="name:required"
                  >
                    A name is required.
                  </div>
                </div>
                <div className="form-floating mb-3">
                  <input
                    className="form-control"
                    id="email"
                    type="email"
                    placeHolder="name@example.com"
                    data-sb-validations="required,email"
                  />
                  <label htmlFor="email">Email address</label>
                  <div
                    className="invalid-feedback"
                    data-sb-feedback="email:required"
                  >
                    An email is required.
                  </div>
                  <div
                    className="invalid-feedback"
                    data-sb-feedback="email:email"
                  >
                    Email is not valid.
                  </div>
                </div>
                <div className="form-floating mb-3">
                  <input
                    className="form-control"
                    id="phone"
                    type="tel"
                    placeHolder="(123) 456-7890"
                    data-sb-validations="required"
                  />
                  <label htmlFor="phone">Phone number</label>
                  <div
                    className="invalid-feedback"
                    data-sb-feedback="phone:required"
                  >
                    A phone number is required.
                  </div>
                </div>
                <div className="form-floating mb-3">
                  <textarea
                    className="form-control"
                    id="message"
                    type="text"
                    placeHolder="Enter your message here..."
                    style={{ height: "10rem" }}
                    data-sb-validations="required"
                  ></textarea>
                  <label htmlFor="message">Message</label>
                  <div
                    className="invalid-feedback"
                    data-sb-feedback="message:required"
                  >
                    A message is required.
                  </div>
                </div>
                <div className="d-none" id="submitSuccessMessage">
                  <div className="text-center mb-3">
                    <div className="fw-bolder">Form submission successful!</div>
                    To activate this form, sign up at
                    <br />
                    <a href="https://startbootstrap.com/solution/contact-forms">
                      https://startbootstrap.com/solution/contact-forms
                    </a>
                  </div>
                </div>
                <div className="d-none" id="submitErrorMessage">
                  <div className="text-center text-danger mb-3">
                    Error sending message!
                  </div>
                </div>
                <div className="d-grid">
                  <button
                    className="btn btn-primary btn-xl disabled"
                    id="submitButton"
                    type="submit"
                  >
                    Submit
                  </button>
                </div>
              </form>
            </div>
          </div>
          <div className="row gx-4 gx-lg-5 justify-content-center">
            <div className="col-lg-4 text-center mb-5 mb-lg-0">
              <i className="bi-phone fs-2 mb-3 text-muted"></i>
              <div>+1 (555) 123-4567</div>
            </div>
          </div>
        </div>
      </section>

      <Footer />
    </>
  );
}
export default Body;
