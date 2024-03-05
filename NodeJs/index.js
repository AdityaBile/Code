const fs = require("fs");

// fs.writeFileSync("read.txt", "Welcome to node js series");
// fs.appendFileSync("read.txt", " This is another statement to add");
// const buf_file = fs.readFileSync("read.txt");
// const org_file = buf_file.toString();
// console.log(org_file);

fs.renameSync("read.txt", "readWrite.txt");