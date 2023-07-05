function fun1(a, b) {
  return a * b;
}
console.log(fun1(4.2, 0.001));

function fun2(ob) {
  if (typeof ob === "object") {
    throw Error;
  }
}

try {
  fun2(Object("a"));
} catch (e) {
  console.log("e : " + e);
  console.log(typeof e);
}

function fun3(ob) {
  ob.a = null;
}
const ob2 = {
  a: "aaa",
  b: "bbb",
};
fun3(ob2);
console.log(ob2);

function fun4(n) {
  return n < 2 ? 1 : n * fun4(n - 1);
}

console.log(fun4(3));

function fun5(a, b) {
  function fun6(c) {
    return c--;
  }
  return fun6(a) * fun6(b);
}
console.log(fun5(1, 2));

console.log("____");

function fun7() {
  var x = 10;
  function fun8(x) {
    return x * 2;
  }
  return fun8;
}
console.log(fun7()(3));

function fun9(a, b = 1) {
  console.log(a * b);
}
fun9(2);

console.log(
  "화살표함수___________________________________________________________________"
);

function fun10(a, ...b) {
  return b.map((x) => (a += x));
}
console.log(fun10(1, 2, 3, 4));

function fun11() {
  this.a = 1;
  this.b = 2;
  console.log("fun11.a : " + this.a);
  function fun12() {
    this.b = 100;
    console.log("fun12 a : " + this.a);
    console.log("fun12 b : " + this.b);
  }
  fun12();
}
fun11();
