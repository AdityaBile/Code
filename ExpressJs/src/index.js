const path = require("path");
const express = require("express");
const app = express();
const port = 3000;

const staticPath = path.join(__dirname, "../public")
console.log(staticPath);
app.use(express.static(staticPath));

app.get("/", (req,res) =>{
    res.send("Hello from home page");
});

app.get("/about", (req,res) =>{
    res.send("Hello from about us");
});

app.get("/contact", (req, res) =>{
    res.send("Hello from contact page");    
});

app.listen(port, () =>{
    console.log(`Listening from port ${port}`);
});