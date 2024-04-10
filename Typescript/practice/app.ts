console.log("Compile code.. ");

function add(num1: number, num2: number) {
  return num1 + num2;
}

// const numb1 = "5";  // Type 'string' is not assignable to type 'number'.
const numb1 = 5;
const numb2 = 6;

const result = add(numb1, numb2);

console.log(result); // Outputs: 11

// This type of "type" is used where there is need of initalization
// When inalizing and declaring dont need of mentioning "type"
let num3: number;
num3 = 12;
