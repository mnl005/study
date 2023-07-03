var x = 5, y = 3;
var a = eval("x + y"); // 문자열을 계산, x와 y가 선언되어 있지 않아서 오류가 발생합니다. x와 y를 선언하여 값을 할당했습니다.
console.log(a); // 출력을 추가했습니다.

let str = "hello this is a end is a";
console.log(str[0]); // 문자 추출
console.log(str.length);

console.log("__________________________________________________________");

console.log(str.slice(2, 5));
console.log(str.slice(2, -51)); // 인덱스 2~5 추출(음수는 거꾸로)
console.log(str.substring(2, 5)); // 인덱스2~5 추출
console.log(str.substr(2, 4)); // 2부터 4개를 가져온다

console.log("__________________________________________________________");

console.log(str.search("this"));
console.log(str.indexOf('this'));
console.log(str.lastIndexOf("is")); // 단어의 인덱스 반환
console.log(str.charAt(10)); // 해당 인덱스 문자 반환
console.log(str.charCodeAt(10)); // 해당 인덱스 문자의 코드 반환
console.log(str.match(/[1-9]/gi)); // 종합 정보 반환, .sort()를 제거했습니다. str 내에 숫자가 없어서 null이 반환됩니다.
console.log(str.replace("this", "nope")); // 단어 찾아 바꾸기

console.log("__________________________________________________________");

console.log(str.split(" ")); // 문자열을 띄어쓰기로 나눠 배열에 저장
console.log(str.concat("asdf")); // 연결
console.log(str.toUpperCase());
console.log(str.toLowerCase()); // 대소문자
console.log(str.trim()); // 양끝공백 제거
console.log(str.repeat(3)); // 문자열 3번 반복
console.log(String.fromCodePoint(66, 55, 66)); // 코드를 문자로 변환, 이 부분은 정상적입니다.
