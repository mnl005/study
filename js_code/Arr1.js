let [x, y] = [1, 4];
let a = [1, 4];
console.log([x, y]);
console.log(a);

// 배열 내부의 배열
let arr1 = ["qwer", "adfs", "zxcv"];
let item1 = "iii";
let item2 = "222";
let arr2 = [arr1, item1, item2];
console.log(arr2);

// 객체 해체 할당
let user = { name: 'mike', age: 30 };
let { name, age } = user;
console.log(name);
let name1 = user.name;
let age1 = user.age;
console.log(name1);

// 변수 이름 변경
let { name: userName, age: userAge } = user;
console.log(userName); // mike
console.log(userAge); // 30

// 기본값 설정
let user2 = {
    name: 'jame',
    age: 18,
    gender: 'female'
};
let { name: name2, age: age2, gender = 'male' } = user2;
console.log(user2);
console.log(gender);
