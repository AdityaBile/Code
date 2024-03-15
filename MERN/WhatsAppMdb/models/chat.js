const mongoose = require("mongoose");

//Creating Chat schema
const chatSchema = new mongoose.Schema({
  from: {
    type: String,
    required: true,
  },
  to: {
    type: String,
    required: true,
  },
  msg: {
    type: String,
    maxLength: 250,
  },
  dated_at: {
    type: Date,
    required: true,
  },
});

// Creating a model -> (class)
const Chat = mongoose.model("Chat", chatSchema);

module.exports = Chat;
