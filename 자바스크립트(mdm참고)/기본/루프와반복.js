for (c = 0; c < 2; c++) {
  console.log(c);
}

do {
  (() => {
    console.log("d");
  })();
} while (false);

do {
  this.a = typeof this.a === "undefined" ? -2 : ++this.a;
  console.log("a : " + this.a);
} while (this.a); // 3번실행

while (1) {
  console.log(1);
  if (0) {
    return 0;
  } else if (0) {
    continue;
  } else {
    break;
  }
}
console.log("in_____");
let arr1 = [1, 2, 3, "f", 5];
for (index in arr1) {
  console.log(typeof index);
  console.log(arr1[index]);
  let num = parseInt(index);
  console.log(arr1[num]); // 배열 인덱스 문자로 취급
}
console.log("of_____");
for (a of arr1) {
  console.log(a);
  arr1.pop();
}
