const fs = require('fs');

// fs.writeFile('read.txt', "Welcome to node series", (err) =>{
//     console.log(err);
// })

fs.readFile("read.txt","UTF-8", (err,data) =>{
    console.log(data);
})


