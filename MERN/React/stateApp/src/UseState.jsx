import { React, useState } from "react";

// More about useState()
// 2) Passing function to initialization

function init() {
  return Math.random();
}

const UseState = () => {
  // Pass function as "init"-> (this will execute function once) not "init()" -> (this will execute multiple times)
  const [count, setCount] = useState(init);
  let incCount = () => {
    setCount((count) => count + 1);
  };

  /*
  // 1) callBack
  const [count, setCount] = useState(0);
  let incCount = () => {
    
    // setCount(count + 1);
    // setCount(count + 1);
    // setCount(count + 1);
    
    // Above will not increaement by 3 as useState depend on old value, here no value updation
    // Use callback
    // Now value will be updated by 2
    setCount((currValue) => {
      return currValue + 1;
    });
    setCount((currValue) => {
      return currValue + 1;
    });

    
  };
  */
  return (
    <>
      <h1>Count : {count}</h1>
      <button onClick={incCount}>Increase Count</button>
    </>
  );
};

export default UseState;

/* // UseState
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

*/

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
