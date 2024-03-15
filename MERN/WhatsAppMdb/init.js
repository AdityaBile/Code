// To run once creating chat query in database we have created this seperate file

const mongoose = require("mongoose");
const Chat = require("./models/chat");

// Connect to MongoDB database using Mongoose
main()
  .then(() => {
    console.log(`Connection established with mongoDB`);
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/whatsapp");
}

//Insert Many chats
Chat.insertMany([
  {
    from: "Alice",
    to: "Bob",
    msg: "Sure, here's a random fact: The world's largest desert is not the Sahara, but Antarctica. While we often think of deserts as hot, sandy places, a desert is technically defined by its low precipitation levels.",
    dated_at: new Date(),
  },
  {
    from: "Alice",
    to: "Charlie",
    msg: "Did you know that the Mona Lisa has no eyebrows or eyelashes?",
    dated_at: new Date(),
  },
  {
    from: "Bob",
    to: "Eve",
    msg: "The Eiffel Tower can be 15 cm taller during the summer due to thermal expansion of the iron.",
    dated_at: new Date(),
  },
  {
    from: "Charlie",
    to: "Alice",
    msg: "Bananas are berries, but strawberries are not.",
    dated_at: new Date(),
  },
  {
    from: "David",
    to: "Frank",
    msg: "Cows moo in regional accents.",
    dated_at: new Date(),
  },
  {
    from: "Eve",
    to: "Bob",
    msg: "A day on Venus is longer than a year on Venus.",
    dated_at: new Date(),
  },
  {
    from: "Frank",
    to: "David",
    msg: "The Great Wall of China is not visible from space without aid.",
    dated_at: new Date(),
  },
  {
    from: "Grace",
    to: "Harry",
    msg: "The 100 folds in a chef's hat represent 100 ways to cook an egg.",
    dated_at: new Date(),
  },
  {
    from: "Harry",
    to: "Grace",
    msg: "Polar bears are left-handed.",
    dated_at: new Date(),
  },
  {
    from: "Isabel",
    to: "Jack",
    msg: "Oxford University is older than the Aztec Empire.",
    dated_at: new Date(),
  },
  {
    from: "Jack",
    to: "Isabel",
    msg: "A group of flamingos is called a flamboyance.",
    dated_at: new Date(),
  },
  {
    from: "Kevin",
    to: "Linda",
    msg: "The unicorn is the national animal of Scotland.",
    dated_at: new Date(),
  },
  {
    from: "Linda",
    to: "Kevin",
    msg: "There are more fake flamingos in the world than real ones.",
    dated_at: new Date(),
  },
  {
    from: "Michael",
    to: "Nancy",
    msg: "Peanuts are not nuts, they are legumes.",
    dated_at: new Date(),
  },
  {
    from: "Nancy",
    to: "Michael",
    msg: "A 'jiffy' is an actual unit of time: 1/100th of a second.",
    dated_at: new Date(),
  },
  {
    from: "Oliver",
    to: "Pamela",
    msg: "The longest English word is 'pneumonoultramicroscopicsilicovolcanoconiosis'.",
    dated_at: new Date(),
  },
])
  .then((result) => {
    console.log(result);
  })
  .catch((err) => console.log(err));

/* // Insert Single Chat
// Creating first Chat
let chat1 = new Chat({
    from: "Alice",
    to: "Bob",
    msg: "Sure, here's a random fact: The world's largest desert is not the Sahara, but Antarctica. While we often think of deserts as hot, sandy places, a desert is technically defined by its low precipitation levels.",
    dated_at: new Date(),
  });
  
  // Save chat1
  chat1
    .save()
    .then((result) => console.log(result))
    .catch((error) => console.log(error));
*/
