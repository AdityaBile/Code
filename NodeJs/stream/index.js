const fs = require("fs");
const http = require("http")

const server = http.createServer();

server.on("request", (req, res) =>{
    
    // const rStream = fs.createReadStream(`input.txt`);

    // rStream.on("data", (chunkData) =>{
    //     res.write(chunkData);
    // });
    // rStream.on("end", () =>{
    //     res.end();
    // });

    // rStream.on("error", (err) =>{
    //     console.log(err);
    //     res.end("File not found");
    // });

    ////              OR....

    const rStream = fs.createReadStream("input.txt");
    rStream.pipe(res);
});

server.listen(8000, "127.0.0.1");