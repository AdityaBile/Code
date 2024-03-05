const express = require("express");
const app = express();

let port = 1000;

// no issue to run file in any folder
const path = require("path");
app.set("views", path.join(__dirname, "/views"));

app.get("/", (req, res) => {
  res.render("This is home page");
});

// facebook page
app.get("/fb/:username", (req, res) => {
  const { username } = req.params;
  const fbData = require("./data.json");
  // console.log(fbData);

  const data = fbData.users.find((user) => user.name === username);
  console.log(data);
  res.render("facebook.ejs", { data, username });
});

app.listen(port, () => {
  console.log(`port is live at ${port}`);
});
