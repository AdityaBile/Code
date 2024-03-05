console.log("HI");

let sum = (a,b) =>{
   return a+b;
}

setTimeout(() =>{
   let result = sum(4,6);
   console.log(`Sum of 2 numbers is : `,result);
}, 4000);

console.log("After time out");