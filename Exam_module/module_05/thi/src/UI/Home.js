function Home() {


    return(<>
    <h3 style={{textAlign:"center"}}>Table name</h3>
        <table class="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Tên</th>
          </tr>
        </thead>
        <tbody>
          
        </tbody>
      </table>

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

    </>
  );
}
export default Home;