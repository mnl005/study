console.log(Math.min(1, 2, 3, 4, 5, 3, -100)); // 최솟값
console.log(Math.max(1, 2, 3, 4, 5, 3, -100)); // 최대값
console.log(Math.random()); // 랜덤값
console.log(Math.round(9.1)); // 반올림
console.log(Math.floor(10.9)); // 무조건 내림
console.log(Math.ceil(10.1)); // 무조건 올림
console.log(Math.sin(9)); // sine 값
console.log(Math.abs(-100)); // 절댓값
console.log(Math.pow(3, 4)); // 3의 4제곱
console.log(Math.sqrt(50)); // 제곱근 반환

console.log("__________________________________________________________");

let num = 123; // 'num' 변수가 선언되어 있지 않았으므로, 추가로 선언합니다.
console.log(num.toString()); // 숫자를 문자로
let num1 = new Number(190);
console.log(typeof(num1)); // 숫자 객체 생성 (new 빼도 숫자로 변환 가능)
let str = "asdf";
console.log(str.length); // 길이 반환 (str은 객체가 아니지만 임시 객체가 되어 프로퍼티 참조 가능)
let num2 = 10;
console.log(num2.toString(8)); // 숫자를 8진수로 문자열로

console.log("__________________________________________________________");

let num3 = Number.parseFloat("23.93");
console.log(num3); // 문자열을 소수점 포함 숫자로
let num4 = Number.parseInt("23", 3); // 숫자 문자열을 소수점 제거 숫자로, '23.93'은 잘못된 입력이므로 '23'으로 변경
console.log(num4); // 뒤의 3은 생략 가능하며 3진법으로 표현한다는 의미

console.log("__________________________________________________________");

console.log(Number.isNaN(NaN)); // NaN값인지 (true or false)
console.log(Number.isFinite(32)); // 유한한지 (true or false)
console.log(Number.isInteger(0.3)); // 정수인지
console.log(Number.isSafeInteger(4)); // 64비트 부동소수점으로 정확히 표현되는지

console.log("__________________________________________________________");

let nnn = 1234.043124;
console.log(nnn.toExponential(3)); // 소수 부분의 자릿수 3을 받아 지수표기법으로 전환
console.log(nnn.toFixed(4)); // 소수 4자리 까지만 문자열로 보여줌
console.log(nnn.toPrecision(5)); // 정수와 소수자리 합쳐서 5자리까지만 보여줌
console.log(nnn.toString(3)); // 숫자를 3진법으로 변환
console.log(nnn.valueOf()); // nnn의 값 반환
