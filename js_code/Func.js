// JavaScript에서 객체와 함수는 모두 변수입니다.
// 변수의 유효 범위는 해당 변수가 접근할 수 있는 변수, 객체, 함수의 집합입니다.
// 함수 내에서 선언된 변수는 지역 변수이며 함수가 종료될 때 메모리에서 제거됩니다.
// 함수의 매개 변수도 지역 변수입니다.
// 함수 외부에서 "var = 10;"과 같이 선언된 변수는 웹 페이지가 닫힐 때까지 유지됩니다.
// 함수 내에서 키워드 없이 변수를 선언하면 해당 변수는 전역 변수가 됩니다.
// 함수 내부에서 선언된 변수는 해당 함수 내에서만 접근 가능합니다.
// 호이스팅: 함수 내에서 선언된 변수는 함수 전체 범위에서 유효합니다(값은 변경될 수 있음).
// 함수는 블록 단위, 서브 프로그램으로 사용할 수 있으며 재사용이 가능합니다. 또한, 함수는 객체입니다.
// 함수에서 return 값이 명시되어 있지 않으면, return undefined;가 있는 것과 같습니다.

// 함수 작성 권장 사항:
// 1. 함수를 정의할 때 "function name(param1, param2) { body... return; }" 형식을 사용합니다.
// 2. 하나의 함수는 한 가지 일만 수행하도록 합니다.
// 3. 함수 이름은 해당 함수가 수행하는 일을 명확히 나타내도록 지정합니다 (예: createCard, createPoint).

//---------함수 예시-----------

// 객체의 name 속성을 'coder'로 변경하는 함수
function changeName(obj) { // changeName 오타 수정
    obj.name = 'coder';
}
const ellie = {name: 'ellie'}; // ellie 객체 생성
changeName(ellie); // 함수를 사용하여 ellie의 name 변경
console.log(ellie); // 변경된 ellie 출력

// 매개변수로 메시지를 받고, 보낸이를 출력하는 함수
function showMessage(message, from = 'unknown') {
    console.log(`${message} by ${from}`);
}
showMessage('HI'); // 함수 호출

// 가변 인자를 받아 출력하는 함수
function printAll(...arr) {
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}
printAll('dream', 'coding', 'ellie'); // 함수 호출

// 사용자 업그레이드 로직을 처리하는 함수
function upgradeUser(user) {
    if (user.point <= 10) {
        return;
    }
    // long upgrade logic...
}
// 조건이 맞지 않을 때 즉시 함수를 종료하고, 조건이 맞을 때 긴 로직을 실행하여 시간을 단축합니다.

// 함수 선언
const print = function() {
    console.log('print');
};

// 함수 선언 (이름이 있는 함수)
const printAgain = function print() { // printAgain으로 변경하여 충돌 방지
    console.log('print');
};

// 함수 호출
print();
const printss = print;
printss();

// 즉시 실행되는 함수 표현식 (IIFE)
(function hello() {
    console.log('IIFE');
})();

// 배열의 요소 합계를 계산하는 함수
var aaa = [1, 2, 4, 5, 6];
function sumArray() { // 함수 이름 변경 (fun -> sumArray)
    var sum = 0;
    for (var i = 0; i < aaa.length; i++) {
        sum += aaa[i];
    }
    return sum;
}
console.log(sumArray()); // 함수 호출

// 두 수를 뺀 결과를 반환하는 함수
function subtract(a, b = 1) { // 함수 이름 변경 (fun -> subtract)
    return a - b;
}
console.log(subtract(1)); // 함수 호출

// 배열의 첫 번째 요소에서 나머지 요소를 뺀 값을 반환하는 함수
function subtractElements(arr) { // 함수 이름 변경 (fun -> subtractElements)
    var firstNum = arr[0];
    for (var i = 1; i < arr.length; i++) {
        firstNum -= arr[i];
    }
    return firstNum;
}
console.log(subtractElements([9, 1, 1, 1])); // 함수 호출
