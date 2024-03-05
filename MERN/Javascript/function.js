

//Higher order function => return function OR take function as parameter
function result(request){
    if(request == "odd"){
        let odd =  function(num){
            console.log(!(n%2 == 0));
        }
        return odd;
    }
    else if(request == "even"){
        let even = function(num){
            console.log((n%2) == 0);
        }
        return even;
    }
    else{
        console.log("wrong");
    }
}

let request = "odd";
let fun = result(request);
console.log(fun);

//Function Expression
/*
var sum = function(a,b){
    console.log(a+b);
}
sum(12,45);
*/

/*
function table(num){
    for(let i=num; i<=num*10; i+=num){
        console.log(i);
    }
}

table(3);

function sum(a,b){
    return a+b;
}

console.log(`Sum of 2 numbers`, sum(2,5));
*/