const express = require("express");
const app = express();

const port = 8080;
app.listen(port, () => {
  console.log(`app is live at ${port}`);
});

app.get("/register", (req, res) => {
  const { user, pass } = req.query;
  res.send(
    `Hey!! Good Morning, Welcome back ${user}, You had set pass as ${pass}`
  );
});

app.post("/register", (req, res) => {
  res.send(`This from post`);
});
