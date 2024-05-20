import BlogListApp from "../../Home/BlogListApp";
import Header from '../Header/Header';

function BodyApp(){
    return(<>
      <Header />

    <div className="display-body">
        {/* <div className="col-lg-3"><SideBar/></div> */}
        <div className="col-lg-12"><BlogListApp/></div>
    </div>
    </>)
}
export default BodyApp;