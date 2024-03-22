const express = require("express");

const app = express();
let port = 8080;

let url = "https://s3.amazonaws.com/roxiler.com/product_transaction.json";

async function getData() {
  try {
    let res = await fetch(url);
    let data = await res.json();

    // console.log(data.show.id);
    console.log(data);
  } catch (e) {
    console.log("Erro4r", e);
  }
}

console.log(getData());

app.listen(port, () => {
  console.log(`Server is running at port :  ${port}`);
});
