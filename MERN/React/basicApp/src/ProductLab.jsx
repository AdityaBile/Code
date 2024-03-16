import React from "react";
import Product from "./Product";
const ProductLab = () => {
  let option = ["A", "B", "C"];
  let opt = { a: "A", b: "B", c: "C" };
  return (
    <>
      <Product title="Tab" price={50000} features={option} />
      {/* e.g price="50000" Pass value in "curly bracket" so the value will be passed as NUMBER not STRING */}
      <br></br>
      <Product title="Laptop" price={20000} quality={opt} />
    </>
  );
};

export default ProductLab;
