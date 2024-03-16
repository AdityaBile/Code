import React from "react";
import Product from "./Product";
const ProductLab = () => {
  let option = ["A", "B", "C"];
  let opt = { a: "A", b: "B", c: "C" };
  return (
    <>
      <Product features={option} />
      <Product title="Laptop" price={20000} />
      <Product quality={opt} />
      {/* Pass value in "curly bracket" so the value will be passed as NUMBER not STRING */}
      <Product title="Tab" price="50000" />
    </>
  );
};

export default ProductLab;
