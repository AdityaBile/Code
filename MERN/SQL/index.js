const { faker } = require("@faker-js/faker");
const mysql = require("mysql2");

const connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  database: "college",
  password: "root123",
});

connection.connect();

let query1 = "SHOW TABLES";
// connection.query(addUser, user1, (err, result) => {

// Adding single user
let addUser =
  "INSERT INTO user (userID, username, email, password) VALUES (?,?,?,?)";
let user1 = ["123", "user1", "user1@gmail.com", "user1"];
// connection.query(addUser, user1, (err, result) => {

// Inserting multiple records
let addMultiUser =
  "INSERT INTO user (userID, username, email, password)  VALUES ?";
let multiUsers = [
  ["456", "user2", "user2@gmail.com", "user2"],
  ["789", "user3", "user3@yahoo.com", "user3"],
];
connection.query(addMultiUser, [multiUsers], (err, result) => {
  console.log(result);
  connection.end(); // Stop connection
});

let userGenerator = () => {
  return {
    userId: faker.string.uuid(),
    username: faker.internet.userName(),
    email: faker.internet.email(),
    password: faker.internet.password(),
  };
};

console.log(userGenerator());
