import React from "react";

function add(a,b){
    let add = a + b; 
    return add;
}

function sub(a,b){
    let sub = a - b;
    return sub;
}

function muti(a,b){
    let multi = a * b;
    return multi;
}

function div(a,b){
    let div = a / b;
    div = div.toFixed(3);
}

export {add, sub, multi, div}