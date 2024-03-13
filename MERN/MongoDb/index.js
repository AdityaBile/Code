const mongoose = require("mongoose");

main()
  .then(() => {
    console.log("Database connection is successful");
  })
  .catch((err) => console.log(err));

/* 
    mongodb:// -> protocol
    127.0.0.1: -> localhost
    27017/ -> port and
    test -> database name
    */
async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/test");
}

// Schema for user -> Columns
const userSchema = new mongoose.Schema({
  name: String,
  email: String,
  age: Number,
});

// Model of user
const User = mongoose.model("User", userSchema); //Collection

//Delete User
User.deleteMany({ name: "Paney" })
  .then((data) => {
    console.log(data);
  })
  .catch((err) => console.log(err));

/*
// Find User
User.find({})
  .then((res) => {
    console.log(res);
  })
  .catch((err) => console.log(err));
*/

/*
// Update user -> findOneAndUpdate
// Same as update (<filter>, <update>, <option> -> new : true => return update doc)
User.findOneAndUpdate({ name: "Hardy" }, { age: 11 }, { new: true })
  .then((update) => {
    console.log(update);
  })
  .catch((e) => console.error(e));

  */

/*
//Update user
User.updateOne({ name: "Tony" }, { age: 99 })
  .then((update) => {
    console.log(update);
  })
  .catch((err) => console.log(err));
*/

/*
// Insert Many user
User.insertMany([
  {
    name: "Hardy",
    email: "hardy@gmail.com",
    age: 87,
  },
  {
    name: "Paney",
    email: "paney@yahoo.com",
    age: 45,
  },
  {
    name: "Tony",
    email: "tony@yahoo.com",
    age: 25,
  },
])
  .then((res) => {
    console.log(res);
  })
  .catch((err) => console.log(err));

  */

/*
// Create User -> Insert User
const user2 = new User({
  name: "Adam Smith",
  email: "adamsmith@gmail.com",
  age: 35,
});

// To save to database
user2
  .save()
  .then((res) => {
    console.log(res);
  })
  .catch((err) => console.log(err));

  */
