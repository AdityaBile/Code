import React from "react";
import { useState } from "react";

const Heart = () => {
  let [like, setLike] = useState(true);
  let [count, setCount] = useState(0);

  function toggle() {
    setLike(!like);
    setCount(count + 1);
  }

  let setStyle = { color: "pink" };

  return (
    <>
      <h2>Count : {count}</h2>
      <h2 onClick={toggle} style={setStyle}>
        {like ? (
          <i className="fa-regular fa-heart"></i>
        ) : (
          <i className="fa-solid fa-heart"></i>
        )}
      </h2>
    </>
  );
};

export default Heart;
