import { useState } from "react";

function useCounter(step) {
  const [count, setCount] = useState(0);

  const incrementCount = () => {
    setCount(count + step);
  };

  return [count, incrementCount];
}

export default useCounter;
