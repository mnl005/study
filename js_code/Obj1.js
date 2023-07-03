const letters = new Set();
letters.add("a");
letters.add("b");
letters.add("c");
console.log(letters.size);
//_________________________________________________________________
const person1 = {
    name: 'lee',
    color: 'black',
    age: 32,
    job: "백수",
};

const person2 = {
    name: 3333,
};

person1.__proto__ = person2;
person1.__proto__.nnn = "dsf";
//_________________________________________________________________
delete person1.name;
// 프로퍼티 삭제
console.log(Object.keys(person1));
console.log(Object.getOwnPropertyNames(person1));
// 속성을 배열로
console.log(Object.values(person1));
// 값을 배열로
let save1 = Object.entries(person1);
let save2 = Object.fromEntries(save1);
console.log(save1);
console.log(save2);
// 객체를 쌍 배열로, 쌍 배열을 객체로
console.log(Object.assign(save1, save2));
// 객체를 합친다(객체 복사시 사용)
//_________________________________________________________________
Object.defineProperties(person1, {
    job: {
        enumerable: false,
    },
});

console.log(Object.keys(person1));
// job 속성을 for..in이나 keys로 열거 불가하게 만든다
console.log(person1.propertyIsEnumerable("job"));
// 해당 속성이 열거 가능한지 확인(true or false)
console.log(Object.getPrototypeOf(person1));
// 해당 객체에 다른 프로토타입이 있는지 확인
console.log(Object.isExtensible(person1));
// 객체에 새로운 프로퍼티 추가 가능 여부 반환
//_________________________________________________________________
const firstName = Symbol("first name");
const lastName = Symbol("last name");
const nope = Symbol.for("adf");

const person = {
    [firstName]: "John",
    [lastName]: "Doe",
    lastName: "ddd",
    getFullName() {
        return `${this[firstName]} ${this[lastName]}`;
    },
};

console.log(person.getFullName()); // 출력 결과: John Doe
console.log(person[firstName]);    // 출력 결과: John
console.log(person[lastName]);     // 출력 결과: Doe
console.log(person.lastName);      // 출력 결과: "ddd"
console.log(Symbol.keyFor(nope));  // 전역 심볼 값 추출
console.log(Reflect.ownKeys(person)); // 객체의 키, 심볼 확인
