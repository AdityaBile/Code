const { faker } = require("@faker-js/faker");
const mysql = require("mysql2");

const connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  database: "college",
  password: "root123",
});

connection.connect();

connection.query("SHOW TABLES", (err, result) => {
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
