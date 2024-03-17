import React from "react";
// feature = [] -> Array
// quality = {} -> Object
const Product = ({ title, price, features = [], quality = {} }) => {
  let list = features.map((feature) => <li>{feature}</li>);
  let discount = price > 25000;
  let styles = { backgroundColor: discount ? "grey" : "" };
  // Dynamic Component styling -> applying css using conditional &jsx
  return (
    <>
      <div style={styles}>
        <h2>Title : {title}</h2>
        <p>Price: ${price} </p>
        {/* Conditional statement- */}
        {discount ? <p>Discount 5%</p> : null}
        {/* OR  */}
        {/* {price > 25000 && <p>Discount 5%</p>} */}
        <h4>Array Items :</h4>
        <p>{list}</p>
        {/* OR */}
        {/* <p>{features.map((feature) => <li>{feature}</li>)}</p> */}
        <h4>Object elements : </h4>
        <p>{quality.a}</p>
      </div>
    </>
  );
};

export default Product;
