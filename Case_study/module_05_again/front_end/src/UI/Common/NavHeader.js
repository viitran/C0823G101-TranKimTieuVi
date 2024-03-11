import { Link } from "react-router-dom";

function NavHeader() {
  return (
    <>
      <nav
        className="navbar navbar-expand-lg navbar-light fixed-top py-3"
        id="mainNav"
      >
        <div className="container px-4 px-lg-5">
          <a className="navbar-brand" href="#page-top">
            Furama Resort DaNang
          </a>
          <button
            className="navbar-toggler navbar-toggler-right"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarResponsive"
            aria-controls="navbarResponsive"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarResponsive">
            <ul className="navbar-nav ms-auto my-2 my-lg-0">
              <li className="nav-item">
                <a className="nav-link" href="#about">
                  Giới thiệu
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#services">
                  Dịch vụ
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#portfolio">
                  Tham khảo
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#contact">
                  Liên hệ
                </a>
              </li>
              <li className="nav-item">
                <div class="dropdown-center">
                  <Link
                    className="nav-link dropdown-toggle "
                    data-bs-toggle="dropdown"
                  >
                    Quản lí
                  </Link>

                  <ul class="dropdown-menu">
                    <li>
                      <Link class="dropdown-item" to={"/services"}>
                        Danh sách dịch vụ
                      </Link>
                    </li>
                    <li>
                      <Link class="dropdown-item" to={"/customers"}>
                        Danh sách khách hàng
                      </Link>
                    </li>
                    <li>
                      <Link class="dropdown-item" to={"/contacts"}>
                        Danh sách hợp đồng
                      </Link>
                    </li>
                    <li>
                      <Link class="dropdown-item" to={"/employees"}>
                        Danh sách nhân viên
                      </Link>
                    </li>
                  </ul>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </>
  );
}
export default NavHeader;
