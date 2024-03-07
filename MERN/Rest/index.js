const express = require("express");
const app = express();

const port = 8080;

const path = require("path");

// To setunique id
const { v4: uuidv4 } = require("uuid");

// Override
const methodOverride = require("method-override");
app.use(methodOverride("_method"));

app.set("views engine", "ejs"); // Can be accessed from any folder
app.set("views", path.join(__dirname, "views")); // Set the views directory to this file's directory

app.use(express.static(path.join(__dirname, "public"))); // Serve static files from public directory
app.use(express.urlencoded({ extended: true })); // Parse URL-encoded bodies

// Home Directory
app.get("/", (req, res) => {
  res.send("server is working well!");
});

app.listen(port, () => {
  console.log("Server is running on port: " + port);
});

// Main Page - List of Post
app.get("/posts", (req, res) => {
  res.render("post.ejs", { posts });
});

// New Post - Form page
app.get("/posts/new", (req, res) => {
  res.render("new.ejs");
});

// Create a new post
app.post("/posts", (req, res) => {
  let { user, content } = req.body;
  let id = uuidv4();
  posts.push({ id, user, content });
  console.log(id, user, content);
  // res.send("Post request is working");
  res.redirect("/posts");
});

// Display single Post details
app.get("/posts/view/:id", (req, res) => {
  let { id } = req.params;
  console.log(`Viewing ${id}`);
  let postD = posts.find((p) => id === p.id);
  console.log(`post details ${postD}`);
  res.render("view.ejs", { postD });
});

//  Edit the selected Post
app.patch("/posts/:id", (req, res) => {
  let { id } = req.params;
  let newContent = req.body.content;
  let post = posts.find((p) => id === p.id);
  post.content = newContent; // Updating content
  res.redirect("/posts");
});

//Update post
app.get("/posts/:id/edit", (req, res) => {
  let { id } = req.params;
  let post = posts.find((p) => id === p.id);
  console.log(post);
  res.render("edit.ejs", { post });
});

//Delete Post
app.delete("/posts/:id", (req, res) => {
  let { id } = req.params;
  posts = posts.filter((p) => id !== p.id);
  res.redirect("/posts");
});

// array post
let posts = [
  {
    id: uuidv4(),
    user: "Aditya",
    content:
      "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
  },
  {
    id: uuidv4(),
    user: "sourabh",
    content:
      "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
  },
  {
    id: uuidv4(),
    user: "Abhi",
    content:
      "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
  },
];
