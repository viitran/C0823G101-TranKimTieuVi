import React from 'react'; 
function Header(){
return( <>
 <div class="hide-menubar" id="hide-navbar">
      <div className="container">
        <nav
          className="navbar navbar-expand-lg navbar-dark px-0 navbar-onscroll-by-user"
        >
          <a class="navbar-brand" href="#"
            ><img src="public\logo.svg" alt=""
          /></a>
          <button
            className="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#hideNavbar"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="hideNavbar">
            <ul className="navbar-nav text-center ml-auto">
              <li className="nav-item active">
                <a class="nav-link" href="#">HOME</a>
              </li>
              <li className="nav-item">
                <a class="nav-link" href="#">WHAT'S ON</a>
              </li>
              <li className="nav-item">
                <a class="nav-link" href="#">SHORTCODE</a>
              </li>
              <li className="nav-item">
                <a class="nav-link" href="#">NEW</a>
              </li>
              <li className="nav-item">
                <a class="nav-link" href="#">CONTACT</a>
              </li>
            </ul>
          </div>
        </nav>
      </div>
    </div>
    <header className="container">
      <p className="text-white text-right mb-0">
        <i className="fas fa-phone-alt"></i>
        <span className="mx-3 border-right pr-3">0393519274</span>
        <i className="fa fa-search"></i>
      </p>
   
      <nav className="navbar navbar-expand-lg navbar-dark px-0">
        <a class="navbar-brand" href="#"><img src="public\logo.svg" alt="" /></a>
  
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#movieNavbar"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="movieNavbar">
          <ul className="navbar-nav text-center ml-auto">
            <li className="nav-item active">
              <a class="nav-link" href="#">HOME</a>
            </li>
            <li className="nav-item">
              <a class="nav-link" href="#">WHAT'S ON</a>
            </li>
            <li className="nav-item">
              <a class="nav-link" href="#">SHORTCODE</a>
            </li>
            <li className="nav-item">
              <a class="nav-link" href="#">NEW</a>
            </li>
            <li className="nav-item">
              <a class="nav-link" href="#">CONTACT</a>
            </li>
          </ul>
        </div>
      </nav>
    </header>
    <section className="movieCarousel">
      <div id="movieCarousel" className="carousel slide" data-ride="carousel">
        <ol className="carousel-indicators container">
          <li
            data-target="#movieCarousel"
            data-slide-to="0"
            className="active"
          ></li>
          <li data-target="#movieCarousel" data-slide-to="1"></li>
          <li data-target="#movieCarousel" data-slide-to="2"></li>
        </ol>
        <div className="carousel-inner">
          <div className="carousel-item active hero1">
            <div className="carousel-item__overlay"></div>
            <div className="container carousel-caption d-md-block">
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h2 className="display-4">End of the World: Part I</h2>
              <p>
                Claritas est etiam processus dynamicus, qui sequitur mutationem
                consuetudium lectorum. Mirum est notare quam littera gothica,
                quam nunc putamus parum.
              </p>
              <div className="carousel-item__trailer mt-4">
                <span
                  className="d-inline-block mr-2 text-white rounded-circle text-center"
                  >PG</span
                >
                <button className="btn-playTrailer">
                  <i className="fa fa-play mr-2 playtrailer"></i
                  ><span>PLAY TRAILER</span>
                  <div className="btn__overlay"></div>
                </button>
              </div>
            </div>
          </div>
          <div className="carousel-item hero2">
            <div className="carousel-item__overlay"></div>
            <div className="container carousel-caption d-md-block">
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h2 className="display-4">End of the World: Part II</h2>
              <p>
                Claritas est etiam processus dynamicus, qui sequitur mutationem
                consuetudium lectorum. Mirum est notare quam littera gothica,
                quam nunc putamus parum.
              </p>
              <div className="carousel-item__trailer mt-4">
                <span
                  className="d-inline-block mr-2 text-white rounded-circle text-center"
                  >PG</span
                >
                <button className="btn-playTrailer">
                  <i className="fa fa-play mr-2 playtrailer"></i
                  ><span>PLAY TRAILER</span>
                  <div className="btn__overlay"></div>
                </button>
              </div>
            </div>
          </div>
          <div className="carousel-item hero3">
            <div className="carousel-item__overlay"></div>
            <div className="container carousel-caption d-md-block">
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h2 className="display-4">End of the World: Part III</h2>
              <p>
                Claritas est etiam processus dynamicus, qui sequitur mutationem
                consuetudium lectorum. Mirum est notare quam littera gothica,
                quam nunc putamus parum.
              </p>
              <div className="carousel-item__trailer mt-4">
                <span
                  className="d-inline-block mr-2 text-white rounded-circle text-center"
                  >PG</span
                >
                <button className="btn-playTrailer">
                  <i className="fa fa-play mr-2 playtrailer"></i
                  ><span>PLAY TRAILER</span>
                  <div className="btn__overlay"></div>
                </button>
              </div>
            </div>
          </div>
        </div>
         <a class="carousel-control-prev" href="#movieCarousel" role="button" data-slide="prev">
                <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                <span className="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#movieCarousel" role="button" data-slide="next">
                <span className="carousel-control-next-icon" aria-hidden="true"></span>
                <span className="sr-only">Next</span>
            </a>
      </div>
    </section>
    <section className="newIn container py-5">
      <h2 className="content__after">NEW IN</h2>
      <div className="newIn__content">
        <div className="row text-center">
          <div className="col-6 col-md-3">
            <div className="newIn__img">
              <img class="img-fluid" src="public\movie-1.jpg" alt="" />
              <div className="newIn__overlay"></div>
              <div className="newIn__play text-white">
                <i className="fa fa-play d-block"></i>
                <a className="d-block text-white">READ MORE</a>
                <span>Released: 22, October, 2020</span>
              </div>
            </div>
            <div className="newIn__name">
              <p>The last post</p>
              <div className="movie__stars">
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star text-secondary"></i>
              </div>
            </div>
          </div>
          <div className="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
            <div className="newIn__img">
              <img class="img-fluid" src="public\movie-2.jpg" alt="" />
              <div className="newIn__overlay"></div>
              <div className="newIn__play text-white">
                <i className="fa fa-play d-block"></i>
                <a className="d-block text-white">READ MORE</a>
                <span>Released: 22, October, 2020</span>
              </div>
            </div>
            <div className="newIn__name">
              <p>The last post</p>
              <div className="movie__stars">
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
              </div>
            </div>
          </div>
          <div className="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
            <div className="newIn__img">
              <img class="img-fluid" src="public\movie-3.jpg" alt="" />
              <div className="newIn__overlay"></div>
              <div className="newIn__play text-white">
                <i className="fa fa-play d-block"></i>
                <a className="d-block text-white">READ MORE</a>
                <span>Released: 22, October, 2020</span>
              </div>
            </div>
            <div className="newIn__name">
              <p>The last post</p>
              <div className="movie__stars">
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star text-secondary"></i>
                <i className="fa fa-star text-secondary"></i>
              </div>
            </div>
          </div>
          <div className="col-6 col-sm-6 col-md-3 col-lg-3 col-xl-3">
            <div className="newIn__img">
              <img class="img-fluid" src="public\movie-4.jpg" alt="" />
              <div className="newIn__overlay"></div>
              <div className="newIn__play text-white">
                <i className="fa fa-play d-block"></i>
                <a className="d-block text-white">READ MORE</a>
                <span>Released: 22, October, 2020</span>
              </div>
            </div>
            <div className="newIn__name">
              <p>The last post</p>
              <div className="movie__stars">
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
                <i className="fa fa-star"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section className="showTimes container py-5">
      <ul class="nav nav-tabs" id="myTab" role="tablist">
        <li className="nav-item" role="presentation">
          <a
            className="nav-link active"
            id="home-tab"
            data-toggle="tab"
            href="#mon"
            role="tab"
            aria-controls="home"
            aria-selected="true"
            >MON</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="profile-tab"
            data-toggle="tab"
            href="#tue"
            role="tab"
            aria-controls="profile"
            aria-selected="false"
            >TUE</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="contact-tab"
            data-toggle="tab"
            href="#wed"
            role="tab"
            aria-controls="contact"
            aria-selected="false"
            >WED</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="contact-tab"
            data-toggle="tab"
            href="#thur"
            role="tab"
            aria-controls="contact"
            aria-selected="false"
            >THUR</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="contact-tab"
            data-toggle="tab"
            href="#fri"
            role="tab"
            aria-controls="contact"
            aria-selected="false"
            >FRI</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="contact-tab"
            data-toggle="tab"
            href="#sat"
            role="tab"
            aria-controls="contact"
            aria-selected="false"
            >SAT</a
          >
        </li>
        <li className="nav-item" role="presentation">
          <a
            className="nav-link"
            id="contact-tab"
            data-toggle="tab"
            href="#sun"
            role="tab"
            aria-controls="contact"
            aria-selected="false"
            >SUN</a
          >
        </li>
      </ul>
      <div class="tab-content" id="myTabContent">
        <div
          className="tab-pane fade show active"
          id="mon"
          role="tabpanel"
          aria-labelledby="home-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public/movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="tue"
          role="tabpanel"
          aria-labelledby="profile-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="wed"
          role="tabpanel"
          aria-labelledby="contact-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="thur"
          role="tabpanel"
          aria-labelledby="profile-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="./img/movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="fri"
          role="tabpanel"
          aria-labelledby="profile-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="sat"
          role="tabpanel"
          aria-labelledby="profile-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-11.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-6.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-13.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div
          className="tab-pane fade"
          id="sun"
          role="tabpanel"
          aria-labelledby="profile-tab"
        >
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-14.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, FANTASY</p>
              <h3>It's over</h3>
              <p>
                European mercenaries searching htmlFor black powder become embroiled
                in the defense of It's over of China against a horde of
                monstrous creatures.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i>VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>14:30</button>
                  <button className="btn btn-secondary mx-1">15:30</button>
                  <button className="btn btn-secondary mx-1">16:30</button>
                  <button className="btn btn-secondary mx-1">17:30</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>105 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-5.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>ACTION, ADVENTURE, SCI-FI</p>
              <h3>Captain America: The First Avenger</h3>
              <p>
                Steve Rogers, a rejected military soldier transforms into
                Captain America after taking a dose of a "Super-Soldier serum".
                But being Captain America comes at a price as he attempts to
                take down a war monger and a terrorist organization.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">16:00</button>
                  <button className="btn btn-secondary mx-1">18:00</button>
                  <button className="btn btn-secondary mx-1">21:00</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>120 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-7.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Daylight</h3>
              <p>
                A chronicle of the childhood, adolescence and burgeoning
                adulthood of a young black man growing up in a rough
                neighborhood of Miami.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>11:00</button>
                  <button className="btn btn-secondary mx-1">14:30</button>
                  <button className="btn btn-secondary mx-1">20:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
          <div className="row py-5">
            <div className="col-12 col-sm-12 col-md-3 col-lg-2 col-xl-2">
              <img class="img-fluid" src="public\movie-8.jpg" alt="" />
            </div>
            <div
              className="col-12 col-sm-12 col-md-9 col-lg-10 col-xl-10 movie__details"
            >
              <p>DRAMA</p>
              <h3>Fences</h3>
              <p>
                A working-class African-American father tries to raise his
                family in the 1950s, while coming to terms with the events of
                his life.
              </p>
              <a href="#" className="mb-4 d-inline-block"
                >FULL SYNOPSIS <i className="fa fa-angle-right"></i
              ></a>
              <div className="row">
                <div className="col-12 col-md-12 col-lg-9">
                  <span className="mr-2 viewing-time"
                    ><i className="fa fa-clock mr-2"></i> VIEWING TIMES</span
                  >
                  <button className="btn btn-secondary mx-1" disabled>10:00</button>
                  <button className="btn btn-secondary mx-1" disabled>12:45</button>
                  <button className="btn btn-secondary mx-1">17:00</button>
                  <button className="btn btn-secondary mx-1">21:15</button>
                </div>
                <div
                  className="col-12 col-sm-4 col-md-4 col-lg-3 text-sm-left text-lg-right movie__time"
                >
                  <span>117 MINS</span>
                  <span className="d-inline-block ml-2 text-white bg-dark">15</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section className="comingSoon">
      <div className="comingSoon__bg"></div>
      <div className="comingSoon__content container">
        <h2 className="content__after position-relative py-4">COMING SOON</h2>
        <div className="row d-flex align-items-center py-5">
          <div className="col-12 col-md-6 col-lg-6 coming__detail">
            <p>COMEDY, CRIME</p>
            <h3>The Hangover Part III</h3>
            <p>
              <i className="fa fa-star"></i>
              <i className="fa fa-star"></i>
              <i className="fa fa-star"></i>
              <i className="fa fa-star"></i>
              <i className="fa fa-star"></i>
              <span className="coming__date">
                <i className="fa fa-calendar"></i>
                30 September, 2017
              </span>
            </p>
            <p>
              When one of their own is kidnapped by an angry gangster, the Wolf
              Pack must track down Mr. Chow, who has escaped from prison and is
              on the run.
            </p>
            <a href="">MORE INFO <i className="fa fa-angle-right"></i></a>
          </div>
          <div className="col-12 col-md-6 col-lg-6">
            <div className="comingSoon__trailer">
              <img class="img-fluid" src="public\slide-3-video.png" alt="" />
              <span className="d-inline-block rounded-circle"
                ><i className="fa fa-play"></i
              ></span>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section className="movieList py-5">
      <div className="movieList__content container">
        <div className="row text-center">
          <div className="col-4 col-sm-3 col-md-2 movieList__item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-11.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>Too fast</h5>
                <span>15 April, 2017</span>
              </div>
            </div>
          </div>
          <div className="col-4 col-sm-3 col-md-2 movieList__item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-4.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>The Hangover: Part III</h5>
                <span>30 September, 2017</span>
              </div>
            </div>
          </div>
          <div className="col-4 col-sm-3 col-md-2 movieList__item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-13.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>Transformers: Age of Extinction</h5>
                <span>15 April, 2018</span>
              </div>
            </div>
          </div>
          <div className="col-sm-3 col-md-2 movieList__item rp__none-item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-11.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>End of an empire</h5>
                <span>19 October, 2018</span>
              </div>
            </div>
          </div>
          <div className="col-sm-3 col-md-2 movieList__item rp__none-item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-3.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>The comedian</h5>
                <span>21 November, 2018</span>
              </div>
            </div>
          </div>
          <div className="col-sm-3 col-md-2 movieList__item rp__none-item">
            <div className="movieList__detail">
              <img class="img-fluid" src="public\movie-1.jpg" alt="" />
              <div className="movieList__Name-Date my-3 text-white">
                <h5>Locked out</h5>
                <span>01 December, 2018</span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section className="contact text-center">
      <div className="contact__content container">
        <div className="row">
          <div className="col-12">
            <div className="contact__more">
              <p>Need help? Contact our support team on</p>
              <span>039 3519 274</span>
            </div>
          </div>
        </div>
      </div>
    </section>
</>
)}
export default Header;
