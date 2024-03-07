import { NavLink } from "react-router-dom";

function Header() {
  return (
    <>
      <div className="display">

        <div className="col-lg-2 color-picture">
          <img src="/img/logo.png" alt="" className="img" />
        </div>

        <div className="col-lg-3 color-picture"></div>

        <div className="col-lg-7 color-picture">

          <div className="display">

          <div className="center col-lg-4">
          <NavLink
            to="/"
            className='active--link'
          >
            Home
          </NavLink>
          </div>
          {" "}
          <div className="center col-lg-4">
          <NavLink
            to="/create"
            className='active--link'
          >
            create
          </NavLink>
          </div>

          {" "}
          <div className="center col-lg-4">
          <NavLink
            to="/charts"
            className='active--link'
          >
            Charts
          </NavLink>
          </div>
          
          </div>
        </div>
      </div>
    </>
  );
}
export default Header;
