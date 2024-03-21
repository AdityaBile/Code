import React, { useState } from "react";

const LudoBoard = () => {
  let [moves, setMoves] = useState({ blue: 0, green: 0, orange: 0, red: 0 });

  // Updating array using spread operator
  let [arr, setArr] = useState("First");

  let updateArr = () => {
    setArr((prevValue) => {
      return [...prevValue, "Add"];
    });
  };

  // Updating  object using spread operator
  let updateBlue = () => {
    setMoves((prevValue) => {
      return { ...prevValue, blue: prevValue.blue + 1 };
    });
  };

  let updateGreen = () => {
    setMoves((prevValue) => {
      return { ...prevValue, green: prevValue.green + 1 };
    });
  };

  let updateOrange = () => {
    setMoves((prevValue) => {
      return { ...prevValue, orange: prevValue.orange + 1 };
    });
  };

  let updateRed = () => {
    setMoves((prevValue) => {
      return { ...prevValue, red: prevValue.red + 1 };
    });
  };
  return (
    <>
      <h2>Let Game Begin</h2>
      {/* Array Updation  */}
      <p>{arr}</p>
      <button onClick={updateArr} style={{ backgroundColor: "pink" }}>
        Update Array
      </button>
      <div className="board">
        <h4>Blue : {moves.blue}</h4>
        <button onClick={updateBlue} style={{ backgroundColor: "blue" }}>
          +1
        </button>
        <h4>Green : {moves.green}</h4>
        <button onClick={updateGreen} style={{ backgroundColor: "green" }}>
          +1
        </button>
        <h4>Orange : {moves.orange}</h4>
        <button onClick={updateOrange} style={{ backgroundColor: "orange" }}>
          +1
        </button>
        <h4>Red : {moves.red}</h4>
        <button onClick={updateRed} style={{ backgroundColor: "red" }}>
          +1
        </button>
      </div>
    </>
  );
};

export default LudoBoard;
