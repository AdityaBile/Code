const express = require("express");
const app = express();

let port = 8080;

app.listen(port, ()=>{
    console.log(`Port is running at ${port}`);
});

// Handling Request ------------------
/* 
app.use((req,res) =>{
    console.log("request received");
    res.send({
        name : "John",
        age : 12
    })
    console.log("request send");
})
*/


// app.get() -> Routes -----------------
/*
app.get("/", (req,res)=>{
    res.send({
        name:"Home"
    })
});

app.get("/apple", (req, res) =>{
    res.send({
        name:"Apple",
        color:"Red"
    })
});

app.get("*", (req, res) =>{
    res.send({
        status : "Page Not Found"
    })
});
*/

//  Query  Parameters ----------
/*
app.get("/:user/:id", (req,res) =>{
    let {user, id} = req.params;
    let htmlStr = `<h1>Your username is @${user} and id is ${id}</h1>`
    res.send(htmlStr);
    
});
*/

// Query String
app.get("/search", (req,res) => {
    let {q} = req.query;  
    res.send(`You are searching for string ${q}`);
});
