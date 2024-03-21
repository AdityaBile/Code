let url = `https://s3.amazonaws.com/roxiler.com/product_transaction.json`;
let url1 = `https://api.tvmaze.com/search/shows?q=all`;

fetch(url)
  .then((res) => {
    console.log(res);
    return res.json();
  })
  .then((data) => {
    console.log(data.score);
  })
  .catch((err) => {
    console.log("Error", err);
  });

/*
// Async ------

// let url = `https://api.tvmaze.com/search/shows?q=all`;

async function getFact() {
  try {
    let res = await fetch(url);
    let data = await res.json();

    // console.log(data.show.id);
    console.log(data);
  } catch (e) {
    console.log("Erro4r", e);
  }
}

getFact();
*/
