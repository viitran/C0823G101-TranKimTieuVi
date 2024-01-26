import { useState } from "react";
function Counter() {
  let [count, setCount] = useState(0);

  const handleClick = (e) => {
    const newValue = count + 1;
    setCount(newValue);
  };

  return (
    <div>
      <h3>Giá trị: {count}</h3>
      <>
        <button onClick={handleClick}>Tăng giá trị</button>
      </>
    </div>
  );
}

export default Counter;
