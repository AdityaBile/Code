let arr = [1,2,3,4];

let reduce1 = arr.reduce((res, el) =>{
    console.log(res);
    return res+el;
});
console.log(reduce1);