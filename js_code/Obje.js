//클래스 --------------------------------------------------------------------------------
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayHello() {
    console.log("Hello, my name is " + this.name + ".");
  }

  getAge() {
    return this.age;
  }

  setAge(newAge) {
    this.age = newAge;
  }
}

const john = new Person("John", 30);
john.sayHello();
console.log(john.getAge()); // 30

john.setAge(35);
console.log(john.getAge()); // 35

class Student extends Person {
  constructor(name, age, major) {
    super(name, age);
    this.major = major;
  }

  sayHello() {
    console.log("Hello, I'm a student. My name is " + this.name + ".");
  }

  getMajor() {
    return this.major;
  }
}

const mary = new Student("Mary", 25, "Computer Science");
mary.sayHello();
console.log(mary.getAge()); // 25
console.log(mary.getMajor()); // "Computer Science"

//상속 --------------------------------------------------------------------------------
class Animal {
    constructor(name) {
      this.name = name;
    }
  
    eat() {
      console.log(this.name + " is eating.");
    }
  
    sleep() {
      console.log(this.name + " is sleeping.");
    }
  }
  
  class Dog extends Animal {
    constructor(name, breed) {
      super(name);
      this.breed = breed;
    }
  
    bark() {
      console.log(this.name + " is barking.");
    }
  }
  
  class Cat extends Animal {
    constructor(name, color) {
      super(name);
      this.color = color;
    }
  
    meow() {
      console.log(this.name + " is meowing.");
    }
  }
  
  const dog = new Dog("Buddy", "Golden Retriever");
  dog.eat(); // "Buddy is eating."
  dog.sleep(); // "Buddy is sleeping."
  dog.bark(); // "Buddy is barking."
  
  const cat = new Cat("Whiskers", "Orange");
  cat.eat(); // "Whiskers is eating."
  cat.sleep(); // "Whiskers is sleeping."
  cat.meow(); // "Whiskers is meowing."
  


//다형성 --------------------------------------------------------------------------------

class Shape {
    calculateArea() {
      // 도형의 면적을 계산하는 기본 메소드
    }
  }
  
  class Circle extends Shape {
    constructor(radius) {
      super();
      this.radius = radius;
    }
  
    calculateArea() {
      return Math.PI * this.radius ** 2;
    }
  }
  
  class Rectangle extends Shape {
    constructor(width, height) {
      super();
      this.width = width;
      this.height = height;
    }
  
    calculateArea() {
      return this.width * this.height;
    }
  }
  
  // 다형성을 활용한 메소드 호출
  function printArea(shape) {
    console.log("Area:", shape.calculateArea());
  }
  
  const circle = new Circle(5);
  const rectangle = new Rectangle(3, 4);
  
  printArea(circle); // "Area: 78.53981633974483"
  printArea(rectangle); // "Area: 12"
  

//캡슐화 --------------------------------------------------------------------------------

class BankAccount {
    #balance; // private field
  
    constructor(initialBalance) {
      this.#balance = initialBalance;
    }
  
    deposit(amount) {
      this.#balance += amount;
    }
  
    withdraw(amount) {
      if (amount <= this.#balance) {
        this.#balance -= amount;
      } else {
        console.log("Insufficient funds");
      }
    }
  
    getBalance() {
      return this.#balance;
    }
  }
  
  const account = new BankAccount(1000);
  console.log(account.getBalance()); // 1000
  
  account.deposit(500);
  console.log(account.getBalance()); // 1500
  
  account.withdraw(200);
  console.log(account.getBalance()); // 1300
  