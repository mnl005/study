const arr1 = new Array(2);
console.log(arr1.length);

arr1.length = 0;
console.log(arr1);

let arr2 = ["a","b","c"];
//삽입
arr2.push("d");
console.log(arr2);

//마지막제거
arr2.pop();
console.log(arr2);

//첫번째 제거
arr2.shift();
console.log(arr2);

//앞에 삽입
arr2.unshift("aaa");
console.log(arr2);

//잘라서 새배열생성
let newarr = arr2.slice(1,2);
console.log(newarr);

//배열 부분수정
arr2.splice(2,0,"nn","nnn");
console.log(arr2);

//반복
arr2.forEach((x) => console.log(x));

//반복해 결과반환
let newarr1 = arr2.map((str) => str+="t");
console.log(newarr1);

// 필터링
let narr1 = [1,2,3,4,5];
console.log(narr1.filter((x) => x % 2 === 0));

// 줄이기
console.log(narr1.reduce((x) => x+x));

//찾기
console.log(narr1.find((x) => x === 4));

//인덱스 확인
console.log(narr1.indexOf(2));

//있는지 확인
console.log(narr1.includes(2));








