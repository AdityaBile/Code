interface Greet {
  name: string;

  greet(phrase: string): void;
}

class Person implements Greet {
  name: string;
  age: 30;

  constructor(n: string) {
    this.name = n;
  }

  greet(phrase: string) {
    console.log(phrase + " " + this.name);
  }
}

let user1 = new Person("John");
console.log(user1);
