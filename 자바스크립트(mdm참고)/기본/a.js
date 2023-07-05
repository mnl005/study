//인터프리터언어 : 컴파일 과정 없이 브라우저나 엔진에서 직접실행
//동적타이핑 : 변수타입이 런타임시 결정, 타입이 동적변경가능
//객체지향 : 프로토타입기반 객체지향 지원, 클래스기반 객체지향문법 지원
//함수형 프로그래밍 : 고차함수,클로저등
//이벤트드리븐 : 사용자입력, 서버응답 등의 이벤트 반응에 동작하는 프로그램 작성가능
// 돔조작으로 웹페이지 내용 동적변경, 서버로직 개발가능, 다양한활용분야, npm으로패키지관리, 표준은 ECMAScript

// 변수 선언시 대소문자 구분, 문자,밑줄,달러로 시작해야함 그 이후 숫자포함가능
//var : 변수를 선언 동시에 값 초기화
//let : 블록스코브 지역변수를 선언 동시에 값 초기화
//const : 블록 스코피 읽기 전용 상수 선언
console.log(
  "변수선언_____________________________________________________________________________________________"
);
var a = "a";
let A = "b";
const c = "c";
console.log(a, A, c);

var d;
console.log("초기값 없는 d : " + d);

let e;
console.log("초기값 없는 e : " + e);

if (d === undefined && e === undefined) {
  console.log("d,e 둘다 undefined");
}

if (!d) {
  console.log("d가 false로 작동");
}

var arr1 = [];
if (!arr1[0]) {
  console.log("arr[0]이 false로 작동");
}

var f;
console.log("f + 3 = ");
console.log(f + 3);

var h = null;
console.log(h * 3);

// 전역변수 : 함수 바깥에 변수 선언시 해당문서 다른코드에서 선언한 변수 사용 가능
// 지역변수 : 함수 내부에 선언해서 함수 내에서만 사용가능
// var는 미적용

if (true) {
  var y = 3;
}
console.log(y);
if (true) {
  let z = 3;
}
try {
  console.log(z);
} catch (err) {
  console.log("레퍼런스 에러");
}

// var 호이스팅 : var로 선언된 변수는 스코프의 최상단으로 올라가나 변수의 초기화는 원래 초기화된 위치에서 이루어짐
console.log(aaa1 === undefined);
var aaa1 = 1;

// 함수 호이스팅 : 함수선언시 스코프 최상단으로 올라감
fun1();
function fun1() {
  console.log("fun1");
}

//let, const 호이스팅 : 호이스팅되나 변수언언된 코드라인 도달전 엑세스 불가한 임시사각지대에 위치됨
try {
  console.log(aaa2);
} catch (err) {
  console.log("레퍼런스 에러"); //에러발생
}
let aaa2 = 1;
console.log(aaa2);

var myvar = "my value";

(function () {
  console.log(myvar); // undefined
  var myvar = "local value";
})();

//const는 읽기 전용 상수 (재선언불가, 스코프규칙은 let과 동일)

function fun2() {}
// const fun2(); //불가

// var gg = 4;
// let gg = 2; // 에러발생

const ob1 = { k1: "val1" };
ob1.k1 = "vvv"; // 가능
console.log(ob1.k1);

const arr2 = ["a", "b", "c"];
arr2.push("d"); // 가능
console.log(arr2);
console.log(
  "데이터형_____________________________________________________________________________________________"
);
// Boolean : true or false
// null : 자바스크립트는 대소문자 구분으로 null,NULL,Null은 서로다름
// Number : 정수,실수형 숫자
// BigInt : 정밀한 정수
// String : 문자열
// Symbol : 인스턴트가 고유하고 불변
// Object : 객체

var str1 = 23;
console.log(str1);
str1 = "a df"; // 타입 변하는 동적 할당 가능
console.log(str1);

console.log("text : " + 23); // 텍스트
console.log(23 + " = text"); // 텍스트
console.log("23" - 3); // 숫자
console.log("23" + 3); // 문자

console.log(
  "문자열 -> int_____________________________________________________________________________________________"
);
console.log(parseInt("11")); // 정수로
console.log(parseInt("101", 2)); //2진법
console.log(parseInt("12", 8)); //8진법
console.log(parseInt("1234", 10)); // 10진법
console.log(parseInt("a", 16)); // 16진법
console.log(parseFloat("123")); // 부동소수점으로

console.log(
  "배열____________________________________________________________________________________________________________________"
);
let arr3 = ["a", "b", , "c"];
console.log(arr3.length); //배열의 길이
console.log(arr3[2]); // undefined

console.log(
  "객체____________________________________________________________________________________________________________________"
);
let ob2 = {};
ob2.a = "value1";
ob2.b = "value2";
ob2.c = "value3";
ob2.d = function () {
  console.log("ob2.d = function..");
};
ob2.e = ee;
function ee() {
  console.log("e = function...");
}
console.log(ob2);
console.log(ob2.a);
console.log(ob2["b"]);
ob2.d();
ob2.e();

let ob3 = {};
let ob3_in1 = {};
let ob3_in2 = {};
let ob3_in3 = {};
ob3_in3.arr1 = ["a", "b", "c"];
ob3_in1.a = "adsf";
ob3_in1.b = "fdsa";
ob3_in2.a = function () {
  console.log("ob3_in2 function a..");
};
ob3_in2.b = function () {
  console.log("ob3_in2 function b..");
};
ob3.ob3_in1 = ob3_in1;
ob3.ob3_in2 = ob3_in2;
ob3.arr1 = ob3_in3;
console.log(ob3);
console.log(ob3.ob3_in1.a);
console.log(ob3.ob3_in1.b);
ob3.ob3_in2.a();
ob3.ob3_in2.b();
console.log(ob3.arr1);
console.log(ob3.arr1.arr1);
console.log(ob3.arr1.arr1[0]);

console.log(
  "생성자함수,프로토타입__________________________________________________________________________________________________________________"
);
function fun3(a, b) {
  this.a = a;
  this.b = b;
}
fun3.prototype.med1 = function () {
  console.log("a : " + this.a + ", b : " + this.b);
};
let obj1 = new fun3("a", 1);
let obj2 = new fun3("b", 2);
console.log(obj1);
obj1.med1();

console.log(
  "기타__________________________________________________________________________________________________________________"
);
let str2 = "abc";
let str3 = "cba";
console.log(`str : ${str2}, str3 : ${str3}`); //백틱
