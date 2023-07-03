// var, let 차이---------------------------------------------------------------------------
var name = "John";
if (true) {
  var name = "Jane"; // 같은 이름의 변수를 중복 선언
  console.log("내부:", name); // "Jane" 출력
}
console.log("외부:", name); // "Jane" 출력 (변수가 덮어써짐)

let age = 25;
if (true) {
  let age = 30; // 블록 스코프 내에서만 유효한 변수
  console.log("내부:", age); // 30 출력
}
console.log("외부:", age); // 25 출력 (변수가 유지됨)

// 데이터 타입---------------------------------------------------------------------------
// 숫자 타입
let age1 = 25;
console.log(typeof age1); // "number"

// 문자열 타입
let name1 = "John";
console.log(typeof name1); // "string"

// 불리언 타입
let isStudent = true;
console.log(typeof isStudent); // "boolean"

// null 타입
let nullValue = null;
console.log(typeof nullValue); // "object"

// undefined 타입
let undefinedValue;
console.log(typeof undefinedValue); // "undefined"

// 객체 타입
let person = {
  name: "John",
  age: 25,
};
console.log(typeof person); // "object"

// 배열 타입
let numbers = [1, 2, 3, 4, 5];
console.log(typeof numbers); // "object"

// 함수 타입
function greet() {
  console.log("Hello!");
}
console.log(typeof greet); // "function"

// 데이터 타입---------------------------------------------------------------------------

// 산술 연산자
let x = 10;
let y = 5;

console.log(x + y); // 덧셈: 15
console.log(x - y); // 뺄셈: 5
console.log(x * y); // 곱셈: 50
console.log(x / y); // 나눗셈: 2
console.log(x % y); // 나머지: 0
console.log(x ** y); // 거듭제곱: 100000

// 할당 연산자
let a = 10;

a += 5; // a = a + 5;
console.log(a); // 15

a -= 3; // a = a - 3;
console.log(a); // 12

a *= 2; // a = a * 2;
console.log(a); // 24

a /= 4; // a = a / 4;
console.log(a); // 6

a %= 5; // a = a % 5;
console.log(a); // 1

// 비교 연산자
let b = 10;
let c = 5;

console.log(b > c); // 크다: true
console.log(b < c); // 작다: false
console.log(b >= c); // 크거나 같다: true
console.log(b <= c); // 작거나 같다: false
console.log(b === c); // 일치: false
console.log(b !== c); // 불일치: true

// 논리 연산자
let isTrue = true;
let isFalse = false;

console.log(isTrue && isFalse); // 논리 AND: false
console.log(isTrue || isFalse); // 논리 OR: true
console.log(!isFalse); // 논리 NOT: true

// 조건(삼항) 연산자
let num = 10;
let result = num > 5 ? "크다" : "작다";
console.log(result); // "크다"

// 문자열 연결 연산자
let firstName = "John";
let lastName = "Doe";
let fullName = firstName + " " + lastName;
console.log(fullName); // "John Doe"

// 타입 연산자
console.log(typeof 10); // "number"
console.log(typeof "Hello"); // "string"
console.log(typeof true); // "boolean"
console.log(typeof undefined); // "undefined"
console.log(typeof null); // "object"
console.log(typeof {}); // "object"
console.log(typeof []); // "object"
console.log(typeof function () {}); // "function"

// 조건문---------------------------------------------------------------------------

// if 문
let xx = 10;

if (xx > 5) {
  console.log("x는 5보다 큽니다.");
} else {
  console.log("x는 5보다 작거나 같습니다.");
}

// if-else if-else 문
let time = 14;

if (time < 12) {
  console.log("오전입니다.");
} else if (time >= 12 && time < 18) {
  console.log("오후입니다.");
} else {
  console.log("저녁입니다.");
}

// switch 문
let fruit = "apple";

switch (fruit) {
  case "apple":
    console.log("사과입니다.");
    break;
  case "banana":
    console.log("바나나입니다.");
    break;
  case "orange":
    console.log("오렌지입니다.");
    break;
  default:
    console.log("기타 과일입니다.");
    break;
}

// 삼항 조건 연산자
let age2 = 25;
let canVote = age2 >= 18 ? "투표할 수 있습니다." : "투표할 수 없습니다.";
console.log(canVote);

// 반복문---------------------------------------------------------------------------
// for 문
for (let i = 1; i <= 5; i++) {
  console.log(i);
}

// while 문
let num2 = 1;
while (num2 <= 5) {
  console.log(num2);
  num2++;
}

// do-while 문
let count = 1;
do {
  console.log(count);
  count++;
} while (count <= 5);

// for...in 문 (객체 순회)
const person1 = {
  name: "John",
  age: 30,
  city: "New York",
};

for (let key in person1) {
  console.log(key + ": " + person1[key]);
}

// for...of 문 (배열 순회)
const fruits = ["apple", "banana", "orange"];

for (let fruit of fruits) {
  console.log(fruit);
}

// 함수---------------------------------------------------------------------------
// 함수 선언문
function greet(name) {
    console.log("Hello, " + name + "!");
  }
  
  greet("John");
  
  // 함수 표현식
  const square = function(num) {
    return num * num;
  };
  
  const result3 = square(5);
  console.log(result3);
  
  // 화살표 함수
  const multiply = (a, b) => a * b;
  console.log(multiply(3, 4));
  
  // 기본 매개변수
  function sayHello(name = "Guest") {
    console.log("Hello, " + name + "!");
  }
  
  sayHello(); // 매개변수를 전달하지 않고 호출
  sayHello("John");
  
  // 가변 인자
  function sum(...numbers) {
    let total = 0;
    for (let num of numbers) {
      total += num;
    }
    return total;
  }
  
  console.log(sum(1, 2, 3));
  console.log(sum(4, 5, 6, 7));
  
  // 재귀 함수
  function factorial(n) {
    if (n === 0 || n === 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
  
  console.log(factorial(5));
  
// 배열---------------------------------------------------------------------------
// 배열 생성과 접근
var fruitsq = ['apple', 'banana', 'orange'];
console.log(fruitsq[0]); // 'apple'
console.log(fruitsq[1]); // 'banana'
console.log(fruitsq[2]); // 'orange'

// 배열 요소 추가 및 삭제
fruitsq.push('grape');
console.log(fruitsq); // ['apple', 'banana', 'orange', 'grape']
fruitsq.splice(1, 1); // 인덱스 1의 요소 삭제
console.log(fruitsq); // ['apple', 'orange', 'grape']

// 배열 순회 (반복문 활용)
for (var i = 0; i < fruitsq.length; i++) {
  console.log(fruitsq[i]);
}

fruitsq.forEach(function(fruit) {
  console.log(fruit);
});

// 배열 메서드 활용
var numbersq = [3, 1, 4, 1, 5, 9, 2, 6, 5];
numbers.sort();
console.log(numbersq); // [1, 1, 2, 3, 4, 5, 5, 6, 9]
console.log(numbersq.indexOf(5)); // 4
console.log(numbersq.lastIndexOf(1)); // 1

var evenNumbers = numbers.filter(function(number) {
  return number % 2 === 0;
});
console.log(evenNumbers); // [2, 4, 6]

// 다차원 배열
var matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];
console.log(matrix[0][1]); // 2
console.log(matrix[2][2]); // 9





