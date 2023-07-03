// 클래스 정의
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // 화살표 함수로 greet 메서드 정의
    greet = () => {
        console.log(`안녕하세요, 제 이름은 ${this.name}이고, 나이는 ${this.age}살 입니다.`);
    };
}

// JSON 데이터
const jsonData = `[
    { "name": "철수", "age": 29 },
    { "name": "영희", "age": 25 }
]`;


// JSON 파싱
const peopleData = JSON.parse(jsonData);
console.log(JSON.stringify(peopleData));
// 파싱된 데이터를 클래스 인스턴스로 변환
const people = peopleData.map(personData => {
    // 디스트럭처링을 사용하여 name, age 프로퍼티 추출
    const { name, age } = personData;
    // Person 클래스 인스턴스 생성
    return new Person(name, age);
});

// 인스턴스들을 반복하여 각각의 greet 메서드 호출
people.forEach(person => person.greet());
