import React from "react";

// Price default value is 2000
const Product = ({ title, price = 2000, feature, feature1 = {} }) => {
  return (
    <div className="Product">
      <h4>{title}</h4>
      <p>Price: {price}</p>
      <p>Features: {feature}</p>
      <p>Feature1 a: {feature1.a}</p>
    </div>
  );
};

export default Product;
