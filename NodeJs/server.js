// const http = require("http");

// const server = http.createServer((req, res) =>{
//     res.end("Hello from another side");
// });

// server.listen(8000, "127.0.0.1", () =>{
//     console.log("Listening from port no. 8000");
// });

const http = require("http");

const server = http.createServer((req, res) =>{
    if(req.url == "/"){
        res.end("Hello from home page"); 
    }
    else if(req.url == "/about"){
        res.end("Hello from about us");
    }
    else if(req.url == "/contact"){
        res.end("Hello from contact us");
    }
    else{
        res.writeHead(404, {"content-type" : "text/html"})
        res.end("<h1>Error 404</h1>")
    }
});

server.listen(8000, "127.0.0.1", () =>{
    console.log("Listening from port no. 8000");
});