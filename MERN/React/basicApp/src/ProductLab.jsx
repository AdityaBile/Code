import React from "react";
import Product from "./Product.jsx";

const ProductLab = () => {
  let option = ["Hey", "Hello", "Ola"];
  let option1 = { a: "Hey", b: "Hello", c: "Ola" };
  return (
    <>
      {/* Pass value in "curly bracket" so the value will be passed as NUMBER not STRING */}
      <Product
        title="Phone"
        price={12000}
        feature={option}
        feature1={option1}
      />
      <Product title="Laptop" price={60000} />
      <Product title="Display" price={20000} />
    </>
  );
};

export default ProductLab;
