import { React, useState } from "react";

const UseState = () => {
  // count =>  state variable, setCount => function to update the state of count
  // useState(//initialValue);
  const [count, setCount] = useState(0);

  let incCount = () => {
    setCount(count + 1);
    console.log(count);
  };
  return (
    <>
      <h1>Count : {count}</h1>
      <button onClick={incCount}>Increase Count</button>
    </>
  );
};

export default UseState;

/*
//  UseState()
// This normal variable will not update when the state changes, it's just a simple value holder
function App() {
  let count = 0;
  function incCount() {
    count += 1;
    console.log(count);
  }
  return (
    <>
      <h1>Count : {count}</h1>
      <button onClick={incCount}>Increase Count</button>
    </>
  );
}
export default App;
*/
