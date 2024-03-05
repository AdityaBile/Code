const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req,res) =>{
    res.write("<h1>Hello from home page</h1>")
    res.send();
});

app.get("/about", (req,res) =>{
    res.send("Hello from about us");
});

app.get("/contact", (req, res) =>{
    res.send([
        {
            id:1,
            name:"ad"
        },
        {
            id:2,
            name:"ad"
        },
        {
            id:3,
            name:"ad"
        }
    ]);    
});

app.listen(port, () =>{
    console.log(`Listening from port ${port}`);
});