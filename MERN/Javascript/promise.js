function dataB(data){
    return new Promise((resolve, reject) =>{
        let inSpeed = Math.floor(Math.random()*10) + 1;
        // console.log(inSpeed);

        if(inSpeed > 4){
            resolve("sucess: data is added");
        }
        else{
            reject("failure : data is not added");
        }
    });
};

/*
dataB("Hi")
    .then(() =>{
        console.log("promise resolved");
    })
    .catch(() =>{
        console.log("promise rejected");
    });

    */


// for multiple data
dataB("Data1")
.then((result) => {
    console.log("Data1 is saved");
    console.log(result);
    return dataB("Data2");
})
.then((result) => {
    console.log("Data2 is saved");
    console.log(result);
    return dataB("Data3");
})
.then((result) => {
    console.log("Data3 is saved");
    console.log(result);
})
.catch(() =>{
    console.log("data is rejected");
});