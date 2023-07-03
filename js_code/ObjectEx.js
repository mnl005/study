const person = {
    name: 'John',
    age: 30,
};

console.log(person.name); // 객체의 name 속성에 접근
console.log(person["age"]); // 객체의 age 속성에 대괄호 표기법으로 접근

const obj1 = {};
const obj2 = new Object();
// person이라는 생성자 함수가 있을 경우
function Person(name, age) {
    this.name = name;
    this.age = age;
}
const obj3 = new Person('Lee', 30);

obj1.name = "haha";
delete obj1.name; // obj1 객체의 name 속성 삭제

function Person(name, age) {
    this.name = name;
    this.age = age;
    this.greet = function() {
        console.log(`Hello, my name is ${this.name}.`);
    }
}
const personq = new Person('John', 30);
personq.greet();

console.log("____________________________");

let firstName = "";      // 빈 문자열 변수
let lastName = "";       // 빈 문자열 변수
let price = 0;           // 0으로 초기화된 숫자 변수
let discount = 0;        // 0으로 초기화된 숫자 변수
let fullPrice = 0;       // 0으로 초기화된 숫자 변수

const myArray = [];      // 빈 배열
const myObject = {};     // 빈 객체

let x1 = "";             // 새로운 문자열(primitive string) 변수
let x2 = 0;              // 새로운 숫자(primitive number) 변수
let x3 = false;          // 새로운 부울(primitive boolean) 변수
const x4 = {};           // 새로운 객체(object) 변수
// const x5 = [];           // 새로운 배열(array object) 변수
const x6 = /()/;         // 새로운 정규표현식(regexp object) 변수
const x7 = function(){}; // 새로운 함수(function object) 변수

const user = {
    name: 'mike',
    age: 32,
    showName: function() {
        console.log(`my name is ${this.name}`);
    }
};
console.log(user.hasOwnProperty('age'));
// 객체에 age 속성이 있는지 확인

const car = {
    wheels: 4,
    drivespeed() {
        console.log("shshshshsh");
    },
};
const carProto = Object.create(car); // car를 프로토타입으로 가지는 새로운 객체 생성

const bmw = Object.create(carProto); // carProto를 프로토타입으로 가지는 새로운 객체 생성
bmw.color = "red";
bmw.navi = 1;

const x5 = Object.create(bmw); // bmw를 프로토타입으로 가지는 새로운 객체 생성
x5.color = "white";
x5.name = "x5!";

console.log(car);
console.log(bmw);
console.log(x5);

console.log(Object.values(bmw));
console.log(Object.keys(bmw));
// x5는 bmw를 상속받고, bmw는 car를 상속 받는다.
// 이러한 연결 관계를 프로토타입 체인이라고 한다.
// 프로퍼티는 숨어있다.

for (p in x5) {
    if (x5.hasOwnProperty(p)) {
        console.log('o', p);
    } else {
        console.log('x', p);
    }
}

carProto.wheels = 8; // 프로토타입의 속성 수정
console.log(x5.wheels); // 8 출력
