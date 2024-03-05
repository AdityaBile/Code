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

// parse POST request => extract important dat (key:value)
app.use(express.urlencoded({ extended: true })); // middleware to parse url encoded bodies
// Option if body contain json data then use below also
app.use(express.json());

app.post("/register", (req, res) => {
  // res.send(`This from post`);
  let { user, pass } = req.body;
  console.log(req.body);
  res.send(`From POST, Hi ${user} and your set password is ${pass}`);
});
