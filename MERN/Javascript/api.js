let api1 = `[
    {
      "length": "12 to 16 inches",
      "origin": "Southeast Asia",
      "image_link": "https://api-ninjas.com/images/cats/abyssinian.jpg",
      "family_friendly": 3,
      "shedding": 3,
      "general_health": 2,
      "playfulness": 5,
      "children_friendly": 5,
      "grooming": 3,
      "intelligence": 5,
      "other_pets_friendly": 5,
      "min_weight": 6,
      "max_weight": 10,
      "min_life_expectancy": 9,
      "max_life_expectancy": 15,
      "name": "Abyssinian"
    }
  ]`;

  let valid = JSON.parse(api1);
  console.log(valid);

  let student = {
    name:"Aditya",
    age:12
  }

  let valid2  = JSON.stringify(student);
  console.log(valid2);