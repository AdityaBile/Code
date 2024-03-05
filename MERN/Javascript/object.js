const student = {
    name: "Aditya",
    roll: 12
}

console.log(student.name);
console.log(student.name = "Abhi"); //Update: obj.key = value; you can  replace value with 
// any datatype i.e num -> string etc.
// Add: obj.key = value;
student.gender = "male";
console.log(student.gender);
console.log(student.name);
console.log(`student are ${student}`);
delete student.gender;
console.log(`after deletion student are ${student}`);


const obj = {
    1: "Abs", // treat every key as string
    null: 34,
    undefined: 'w',
    true: 34
}
console.log(1);