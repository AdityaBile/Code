let inp = document.querySelector("input");
let sub = document.querySelector(".Submit");
let ul = document.querySelector("ul");

sub.addEventListener("click", function(){
    console.log(inp.value);


    let item = document.createElement("li"); //Create new list
    item.innerText = inp.value; // set value of li
    
    let btn1 = document.createElement("button");
    btn1.innerText = "Delete";
    btn1.classList.add(".delete");

    item.appendChild(btn);
    ul.appendChild(item); // add li in ul


    inp.value = ""; // reset input value
});

let delBtns = document.querySelectorAll(".delete");
for(btn1 of delBtns){
    btn1.addEventListener("click", function(){
        let par = btn1.parentElement;
        par.remove();
    })
}