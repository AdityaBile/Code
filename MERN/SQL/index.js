const { faker } = require("@faker-js/faker");
const mysql = require("mysql2");
const express = require("express");
const path = require("path");
const { connect } = require("http2");
const methodOverride = require("method-override");

const app = express();
let port = 8080;

// Ejs setting
app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "/views"));

// method_override
app.use(methodOverride("_method"));
app.use(express.urlencoded({ extended: true }));

app.listen(port, () => {
  console.log(`Server is live at ${port}`);
});

// Connecting to database
const connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  database: "college",
  password: "root123",
});

connection.connect();

// Home page
app.get("/", (req, res) => {
  let countUser = "SELECT COUNT(*) FROM  user";
  connection.query(countUser, (err, result) => {
    if (err) throw err;
    let count = result[0]["COUNT(*)"]; // Print -> 103
    // console.log(result[0]); // print -> {"count(*) =103"}
    console.log(count);
    res.render("home.ejs", { count });
  });
});

// Users Info
app.get("/user", (req, res) => {
  let q = `SELECT * FROM user`;
  connection.query(q, (err, users) => {
    if (err) throw err;
    // console.log(users);
    res.render("users.ejs", { users });
  });
});

// Edit
app.get("/user/:id/edit", (req, res) => {
  let { id } = req.params;
  let q = `SELECT * FROM user WHERE userId = '${id}'`;
  connection.query(q, (err, result) => {
    if (err) throw err;
    let user = result[0];
    console.log(user);
    res.render("edit.ejs", { user });
  });
});

//Update
app.patch("/user/:id", (req, res) => {
  let { id } = req.params;
  let { password: newPass, username: newUserName } = req.body;
  console.log(`New user: ${newUserName}`);

  let q = `SELECT * FROM user WHERE userId='${id}'`;

  connection.query(q, (err, result) => {
    if (err) throw err;
    let user = result[0];
    if (newPass != user.password) {
      res.send(`Wrong Password`);
    } else {
      let q1 = `UPDATE user SET username='${newUserName}' WHERE userId='${id}'`;

      connection.query(q1, (err, result) => {
        if (err) throw err;
        res.redirect("/user");
      });
    }
  });
});
/*  CREATE, INSERT QUERY ------------

let userGenerator = () => { // Generates user data
  return [
    faker.string.uuid(),
    faker.internet.userName(),
    faker.internet.email(),
    faker.internet.password(),
  ];
};

let query1 = "SHOW TABLES";
// connection.query(addUser, user1, (err, result) => {

// Adding single user
let addUser =
  "INSERT INTO user (userId, username, email, password) VALUES (?,?,?,?)";
let user1 = ["123", "user1", "user1@gmail.com", "user1"];
// connection.query(addUser, user1, (err, result) => {

// Inserting multiple records
let addMultiUser =
  "INSERT INTO user (userId, username, email, password)  VALUES ?";
let multiUsers = [
  ["456", "user2", "user2@gmail.com", "user2"],
  ["789", "user3", "user3@yahoo.com", "user3"],
];
// connection.query(addMultiUser, [multiUsers], (err, result) => {

// Inserting using  a loop to create random users
let addBulkUser =
  "INSERT INTO user (userId, username, email, password)  VALUES ?";

let data = [];
for (let i = 0; i < 100; i++) {
  data.push(userGenerator());
}

connection.query(addBulkUser, [data], (err, result) => {
  console.log(result);
  connection.end(); // Stop connection
});



// let userGenerator = () => {
//   return {
//     userId: faker.string.uuid(),
//     username: faker.internet.userName(),
//     email: faker.internet.email(),
//     password: faker.internet.password(),
//   };
// };

// console.log(userGenerator());


*/
