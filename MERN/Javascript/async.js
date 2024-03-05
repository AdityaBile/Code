let h1 = document.querySelector("h1");
function changeColor(color, delay){
    return new Promise((resolved, rejected) => {
        setInterval(() =>{
            h1.style.color = color;
            console.log(`change color ${color}`);
            resolved("promise resolved");
        }, delay);
    });
}

async function demo(){
    await changeColor("red", 5000);
    await changeColor("blue", 1000);
    await changeColor("green",1000);
     
}
demo();

/*
async function greet(){
    abc;
    return "Hello";
}

console.log(greet());

greet()
.then((result) =>{
    console.log("promise resolved");
    console.log(result);
}).catch((err) =>{
    console.log("promise rejected");
    console.log(err);
});

*/