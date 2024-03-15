const mongoose = require("mongoose");
const express = require("express");
const path = require("path");
const Chat = require("./models/chat");
const methodOverride = require("method-override");

const app = express();
const port = 8080;

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "/views")); // Access the views folder in our project directory
app.use(express.static(path.join(__dirname, "public"))); // Make public folder accessible to the client side
app.use(express.urlencoded({ extended: true })); //  Allows us to access data from HTML forms
app.use(methodOverride("_method")); //  Overrides HTTP methods (GET, POST etc.) based on the _method parameter

// Connect to MongoDB database using Mongoose
main()
  .then(() => {
    console.log(`Connection established with mongoDB`);
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/whatsapp");
}

// Routing
app.listen(port, () => {
  console.log(`Server is live at ${port}`);
});

// Home Page
app.get("/", (req, res) => {
  res.send(`Welcome to Home page`);
});

// Display all chats
app.get("/chats", async (req, res) => {
  let chats = await Chat.find();
  // console.log(chats);
  res.render("allChats.ejs", { chats });
});

// Add new chat form
// method -> POST
app.get("/chats/new", (req, res) => {
  res.render("form.ejs");
});

// Render new chat in AllChats
app.post("/chats", async (req, res) => {
  let { from, to, msg } = req.body; // for this first use "urlencoder"
  let newChat = new Chat({
    from: from,
    to: to,
    msg: msg,
    dated_at: new Date(),
  });
  // console.log(newChat);
  await newChat // Whenever we use "then" no need of "async and await"
    .save()
    .then((result) => console.log(result))
    .catch((err) => console.log(err));
  res.redirect("/chats");
});

// Edit a chat
// method -> GET
app.get("/chats/:id/edit", async (req, res) => {
  let { id } = req.params;
  let currChat = await Chat.findById(id)
    .then((doc) => console.log(doc)) // console.log(currChat);
    .catch((err) => err);

  res.render("editChat.ejs", { currChat });
});

//Update a chat
// method  -> POST
app.put("/chats/:id", async (req, res) => {
  let { id } = req.params;
  let chat = req.body; // Updated chat
  console.log(`Modified Message`);
  await Chat.findByIdAndUpdate(
    id,
    { msg: chat.msg },
    { runValidators: true, new: true }
  )
    .then((update) => {
      console.log(update); //console.log(modifyChat);
    })
    .catch((err) => err);
  res.redirect("/chats");
});

// Delete a chat
// method -> POST
app.delete("/chats/:id", async (req, res) => {
  let { id } = req.params;
  await Chat.findByIdAndDelete(id)
    .then((res) => console.log(res))
    .catch((err) => err);
  console.log(`chat with id : ${id} is deleted`);
  res.redirect("/chats");
});
