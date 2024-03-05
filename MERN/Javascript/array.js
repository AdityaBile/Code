//Array
let fruits = ["Mango", "apple", "Leaches"];
console.log(fruits);

fruits.forEach((value) => {
    console.log(value);
});

// push : add last
// pop : delete end
// unshift : add first
// shift : delete first

fruits.push("Pineapple", "Grapes");
console.log(fruits);

fruits.pop();
console.log(fruits);

fruits.unshift("Chikoo");
console.log(fruits);
fruits.shift();
console.log(fruits);

