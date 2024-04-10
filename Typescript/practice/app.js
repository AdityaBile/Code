console.log("Compile code.. ");
function add(num1, num2) {
    return num1 + num2;
}
// const numb1 = "5";  // Type 'string' is not assignable to type 'number'.
var numb1 = 5;
var numb2 = 6;
var result = add(numb1, numb2);
console.log(result); // Outputs: 11
