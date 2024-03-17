import React from "react";

function submitData(event) {
  event.preventDefault(); //prevents page refresh on form
  console.log(`From is submitted`);
}

const Events = () => {
  return (
    <>
      <form>
        <input placeholder="Enter Data"></input>
        <button onClick={submitData}>Submit</button>
      </form>
    </>
  );
};

export default Events;
