import useCounter from "../Hooks/useCounter";

function SecondCounter() {
    const [count, incrementCount] = useCounter(2);
  
    return (
      <div>
        <h2>Counter 2:</h2>
        <p>{count}</p>
        <button onClick={incrementCount}>Add 2</button>
      </div>
    );
  };

  export default SecondCounter;