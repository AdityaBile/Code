let btn = document.querySelector("button");

btn.addEventListener("click", function() {
    let colorChange = changeColor(); // functon store
    let h2  = document.querySelector("h2");
    h2.innerHTML = colorChange; // change h2 as pe4r coloir

    let div = document.querySelector("div");
    div.style.backgroundColor = colorChange; // change background color
    console.log("Hello");
});

var changeColor = () =>{
    let red = Math.floor(Math.random() * 255);
    let green = Math.floor(Math.random() * 255);
    let blue = Math.floor(Math.random() * 255);

    let color = `rgb(${red}, ${green}, ${blue})`; // rgb(r,g,b) format
    return color;
}