//속성할당
let ob1 = {};
ob1.a = null;
console.log(ob1.a);

//속성제거
delete ob1.a;
console.log(ob1.a);

//구조분해 : 객체나 배열에서 데이터 추출하는 표현식
let arr1 = ["a", "b", "c"];
let [aa, bb, cc] = arr1;
console.log(arr1);
console.log([aa, bb, cc]);

//느슨한비교
console.log(1 == "1");
//비교
console.log(1 === "1");

//연산
let a = 1;
console.log((a *= 3));
console.log((a /= 3));
console.log((a -= 3));
console.log((a += 3));
console.log((a %= 3));
console.log(true && true);
console.log(true || false);
console.log(!false);
console.log(true ? "a" : "b");
console.log(a++);
let ob2 = { a: "a" };
console.log("a" in ob2);
let q = [];
console.log(q instanceof Array);

let fun = new Function("none");
let str = "a";
let num = 1;
let arr = [];
let date = new Date();
console.log(typeof fun);
console.log(typeof str);
console.log(typeof num);
console.log(typeof arr);
console.log(typeof date);
console.log(typeof true);
console.log(typeof null);
console.log(typeof adfe);

let arr2 = ["1", "c"];
console.log(1 in arr2);
console.log("1" in arr2);
console.log("2" in arr2);
console.log(2 in arr2);

let ob3 = { a: "aa", b: "bb" };
console.log(a in ob3);
console.log(0 in ob3);
console.log("aa" in ob3);
console.log("a" in ob3); //true
