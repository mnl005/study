// 배열 생성
let arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(arr); // 배열 출력
console.log(arr.length); // 배열 길이 출력
console.log(arr[0]); // 배열의 첫 번째 요소 출력

console.log("__________________________________________________________");

// 배열에 요소 추가
console.log(arr.push(10), arr); // 배열 끝에 10 추가
console.log(arr.pop(), arr); // 배열의 마지막 요소 제거
console.log(arr.shift(), arr); // 배열의 첫 번째 요소 제거
console.log(arr.unshift(-1), arr); // 배열 앞에 -1 추가
console.log(arr.reverse(), arr); // 배열 순서 뒤집기
console.log(arr.sort()); // 배열 정렬
arr.sort((a, b) => a - b); // 숫자 정렬을 위한 콜백 함수 사용

// 배열 요소 제거 및 삽입
console.log(arr.splice(1, 2, "q", "re"), arr);

// 배열 결합
console.log(arr.concat([333, 23], arr));

// 배열 채우기
arr.fill(0);

// 셋 생성 (중복 제거)
const set1 = new Set([1, 2, 3, 3]);

console.log("__________________________________________________________");

// 배열 내 요소 검색
console.log(arr.indexOf(7, 2)); // 인덱스 2부터 요소 7 찾기
console.log(arr.lastIndexOf(3)); // 배열 뒤에서부터 요소 3 찾기
console.log(arr.includes(3)); // 배열에 요소 3이 있는지 확인

// 배열 문자열 변환
console.log(arr.join("+"), arr);

// 문자열을 배열로 변환
let text = "one,two,three";
console.log(text.split(','));

// 배열의 일부 추출
console.log(arr.slice(1, 3), arr);

// 배열을 문자열로 변환
console.log(arr.toString(), arr);

console.log("__________________________________________________________");

// 배열의 모든 요소에 함수 적용
arr.forEach(function (value, index, array) {
    array[index] = value * 10;
    console.log(array[index]);
});

// 화살표 함수를 사용한 forEach
arr.forEach((a, b, c) => { c[b] = a * 10; });

console.log("__________________________________________________________");

// 배열 정렬
console.log(arr.sort((a, b) => a - b));

// 조건에 맞는 첫 번째 요소 찾기
console.log(arr.find((element) => element % 2 === 0));

// 조건에 맞는 첫 번째 요소의 인덱스 찾기
console.log(arr.findIndex((element) => element % 2 === 0));

// 배열의 각 요소에 함수 적용 후 새 배열 반환
console.log(arr.map((element) => element * 10));

// 조건을 만족하는 요소만으로 새 배열 생성
console.log(arr.filter((element) => element < 5));

// 모든 요소가 조건을 만족하는지 확인
console.log(arr.every((element) => element < 10));

// 일부 요소가 조건을 만족하는지 확인
console.log(arr.some((element) => element > 8));

// 배열의 요소를 하나의 값으로 줄임
console.log(arr.reduce((a, b) => a - b, 50));

console.log("__________________________________________________________");

// Person 객체 생성 함수
function makePerson(age, job, color, face, other) {
    this.age = age;
    this.job = job;
    this.color = color;
    this.face = face;
    this.other = other;
}

// Person 객체 배열 생성
const personData = [
    new makePerson(10, '백수', "black", "normal", "nope"),
    new makePerson(32, 'dsf', "fasd", "fd", "asd"),
    new makePerson(30, 'wee', "dsf", "xcv", "sd"),
    new makePerson(30, '백ddd수', "blaxcvck", "dsf", "hg"),
    new makePerson(99, 'sd', "vf", "df", "re"),
];

// 조건에 맞는 첫 번째 Person 객체 찾기
let result = personData.find((value) => value.age === 99);
console.log(result);

// 조건에 맞는 모든 Person 객체 찾기
let result1 = personData.filter((value) => value.age > 30);
console.log(result1);

// 모든 Person 객체의 나이를 100배하여 새 배열 생성
result = personData.map((value) => value.age * 100);
console.log(result);

// 모든 Person 객체의 나이 합계
result = personData.reduce((a, b) => a + b.age, 0);
console.log(result);

// 체이닝: 맵, 필터, 정렬, 반전, 결합
result = personData
    .map((value) => value.age)
    .filter((value) => value > 30)
    .sort()
    .reverse()
    .join(" ");
console.log(result);

console.log("__________________________________________________________");

// 배열 요소와 인덱스를 객체로 만들어 새 배열에 저장
let arr1 = [];
for (let [index, value] of arr.entries()) {
    arr1.push({ index, value });
}
console.log(arr1);


//in은 키, of는 값(단 객체는 of불가)
const personqq = {fname:"John", lname:"Doe", age:25};
const arrq = [1,2,3,4,5];

for (key in personqq){
    console.log(key);
}

for (value of arrq){
    console.log(value);
}