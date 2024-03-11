import * as React from "react";
function Header() {
  return (
    <>
      <header className="masthead">
        <div className="container px-4 px-lg-5 h-100">
          <div className="row gx-4 gx-lg-5 h-100 align-items-center justify-content-center text-center">
            <div className="col-lg-8 align-self-end">
              <h1 className="text-white font-weight-bold">
                Khu Nghỉ Dưỡng Furama Đà Nẵng
              </h1>
              <hr className="divider" />
            </div>
            <div className="col-lg-8 align-self-baseline">
              <p className="text-white-75 mb-5">
                Khu nghỉ dưỡng đẳng cấp thế giới Furama Đà Nẵng, Tự hào là khu
                nghỉ dưỡng ẩm thực tại Việt Nam
              </p>
              <a className="btn btn-primary btn-xl" href="#about">
                Tìm hiểu thêm
              </a>
            </div>
          </div>
        </div>
      </header>
    </>
  );
}
export default Header;
