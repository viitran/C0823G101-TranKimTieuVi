import Header from "./Common/Header/Header";
import NavHeader from "./Common/NavHeader";

function Manager() {
  return (
    <>
      <NavHeader />
      <Header />
      <div>
        <div className="container px-4 px-lg-5">
          <div style={{ marginTop: "100px" }}>
            <div class="container text-center">
              <div className="row">
                {/* vofng lajp cho nay */}
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>
                <div className="col-4">
                  <div class="card" style={{ width: "18rem" }}>
                    <img
                      src="assets/img/room.jpeg"
                      class="card-img-top"
                      alt="..."
                    />
                    <div class="card-body">
                      <p class="card-text">
                        Some quick example text to build on the card title and
                        make up the bulk of the card's content.
                      </p>
                    </div>
                  </div>
                </div>


                {/* {cards.map((card) => ( */}
                {/* <div key={card.id} className="col">
                        <div className="card h-100">
                            <img src={card.imageSrc} className="card-img-top"/>
                            <div className="card-body">
                                <h5 className="card-title">{card.title}</h5>
                                <p className="card-text">Room size: {card.roomSize}</p>
                            </div>
                            <div className="card-icons"> */}
                {/* <Link to={`/editProduct/${card.id}`}><i className="fa">&#xf044;</i></Link>
                                <i className="fa">&#xf06e;</i>
                                <Link to={`/deleteProduct/${card.id}`}><i className="material-icons">&#xe872;</i></Link> */}
                {/* </div>
                        </div> */}
                {/* </div> */}
                {/* ))} */}
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}
export default Manager;
