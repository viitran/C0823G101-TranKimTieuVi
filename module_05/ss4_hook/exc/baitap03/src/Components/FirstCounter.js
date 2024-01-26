import useCounter from "../Hooks/useCounter";

function FirstCounter() {
  const [count, incrementCount] = useCounter(1);

  return (
    <div>
      <h2>Counter 1:</h2>
      <p>{count}</p>
      <button onClick={incrementCount}>Add 1</button>
    </div>
  );
}

export default FirstCounter;
