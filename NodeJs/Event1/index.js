const EventEmitter = require("events");

const e1 = new EventEmitter();

e1.on("intro", () =>{
    console.log("Hey its aditya")
});

e1.on("intro", () =>{
    console.log("I am working on node")
});

e1.on("intro", () =>{
    console.log("i had learned basic of node js")
});

e1.emit("intro");


const e2 = new EventEmitter();

e2.on("checkPage", (sc, msg) =>{
    console.log(`The status code is ${sc} and page number is ${msg}`);
});

e2.emit("checkPage", 200, "Ok");