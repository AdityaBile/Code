
/*
const student = {
    name : "Aditya",
    age : 21,
    cgpa : 8.98,
    isPass : true
};
console.log("Hi");
console.log(student.name);
console.log(student["age"]);

*/

/*
const sum = (a,b) => {
    return a+b;
}

*/

/*
let vowel1 = (str) =>{
    let count = 0;
    for(const char of str){
        if(char === "a" || char === "e" || char === "i" || char === "o" || char === "u"){
            count++;
        }
    }
    return count;
}
console.log(vowel1("apnacollege"));
*/


/*
function vowel1(str){
    let count = 0;
    for(const char of str){
        if(char === "a" || char === "e" || char === "i" || char === "o" || char === "u"){
            count++;
        }
    }

    console.log(count);
}
*/

/*
let nums = [1,2,3,4,5];

nums.forEach((val) =>{
    let sqr = val * val;
    console.log(`Index is ${val} and is square is ${sqr}`)
});
*/


/*
let n = prompt(`Enter a number`);
// n =4
let arr = [];
// 1 2 3 4 
for(let i=1;i<=n; i++){
    arr[i-1] = i;
}

const sum = arr.reduce((prev, curr) => {
    return prev + curr;
});

console.log(`sum of ${n} is : ${sum}`);

const factorial = arr.reduce((prev, curr) =>{
    return prev*curr;
});

console.log(`factorial of ${n} is : ${factorial}`);

*/



console.log(document.body.childNodes);