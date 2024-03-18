import React from "react";
import { useState } from "react";

const Heart = () => {
  let [like, setLike] = useState(true);
  let [count, setCount] = useState(0);

  function toggle() {
    setLike(!like);
    setCount(count + 1);
  }

  let setStyle = { color: "red" };

  return (
    <>
      <h1>Count : {count}</h1>
      <h1 onClick={toggle} style={setStyle}>
        {like ? (
          <i className="fa-regular fa-heart"></i>
        ) : (
          <i className="fa-solid fa-heart"></i>
        )}
      </h1>
    </>
  );
};

export default Heart;
