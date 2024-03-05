const fs = require("fs");

const bioData = {
    name : "Aditya",
    age : 21,
    class : "TE Comp"
}

// const jsonData = JSON.stringify(bioData);
// console.log(jsonData);

// const objData = JSON.parse(jsonData);
// console.log(objData);
// console.log(objData.age);

const jsonData = JSON.stringify(bioData);
fs.writeFile("json1.json", jsonData, (err) =>{
    console.log("Done");
});

fs.readFile("json1.json", "UTF-8", (err,data) =>{
    const orgData = JSON.parse(jsonData);
    console.log(orgData);
    console.log(data);
});


