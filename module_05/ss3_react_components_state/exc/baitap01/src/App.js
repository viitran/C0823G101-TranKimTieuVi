import "./App.css";
import Alert from "./components/Alert";
import "bootstrap/dist/css/bootstrap.css";
import "./index.css";

function App() {
  return (
    <div class="alert alert-warning" role="alert">
      <Alert text="Cảnh báo! Tài nguyên bạn vừa truy cập không tồn tại."></Alert>
    </div>
  );
}

export default App;
