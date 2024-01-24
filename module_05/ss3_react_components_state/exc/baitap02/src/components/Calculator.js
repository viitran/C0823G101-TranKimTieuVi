function Calculator(props) {
  return (
    <form>
      <input type="number"></input>
      <br />
      <input type="number"></input>
      <br />
      <button value={"cong"}>+</button>
      <button value={"tru"}>-</button>
      <button value={"nhan"}>*</button>
      <button value={"chia"}>/</button>
      <p>Result: {props.result}</p>
    </form>
  );
}
export default Calculator;
