const express = require("express");
const app = express();

let port = 8080;

app.set("view engine", "ejs");

const path = require("path");
app.set("views", path.join(__dirname, "/views"));
/*
Before it was mandatory to be in the same directory as your views, 
but now you be in any subdirectory of your project and still use ejs 
files from a folder called views.
*/

app.get("/", (req, res) => {
  res.render("hello");
});

app.get("/dice", (req, res) => {
  var num = Math.floor(Math.random() * 6) + 1;
  res.render("rollDice.ejs", { valDice: num });
  // OR
  // var valDice = Math.floor(Math.random() * 6) + 1;
  // res.render("rollDice", {valDice});
});

app.get("/ig/:username", (req, res) => {
  let { username } = req.params;
  let followers = ["Aditya", "Abhi", "Captain", "Chandu"];
  res.render("instagram", { username, followers });
});

app.listen(port, () => {
  console.log(`App is running at port ${port}`);
});
