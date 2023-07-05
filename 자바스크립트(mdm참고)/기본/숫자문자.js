var a = Number.MAX_VALUE;
var b = Number.MIN_VALUE;
var c = Number.POSITIVE_INFINITY;
var d = Number.NEGATIVE_INFINITY;
var e = Number.NaN;
console.log(a, b, c, d, e);

console.log(Math.sin(1));
console.log(Math.PI);
console.log(Date());
//절대값
console.log(Math.abs(-7.25)); // 7.25
//반올림
console.log(Math.round(4.7)); // 5
console.log(Math.round(4.4)); // 4

//제곱
console.log(Math.pow(2, 3)); // 8 (2의 3제곱)
console.log(Math.sqrt(64)); // 8 (64의 제곱근)

//최대최소
console.log(Math.max(5, 10)); // 10
console.log(Math.min(5, 10)); // 5

//랜덤
console.log(Math.random()); // 0 이상 1 미만의 랜덤한 숫자

//삼각함수
console.log(Math.sin(Math.PI / 2)); // 1 (90도의 사인값)
console.log(Math.cos(Math.PI)); // -1 (180도의 코사인값)
console.log(Math.tan(Math.PI / 4)); // 1 (45도의 탄젠트값)

//로그,지수
console.log(Math.log(1)); // 0 (자연로그)
console.log(Math.exp(1)); // 약 2.718 (e의 1승)


//문자길이
let text = "Hello World!";
console.log(text.length); 

//위치에서 문자추출
console.log(text.charAt(0));

//연결
console.log(text.concat("a"));

//서식확인
console.log(text.includes("World"));

//문자열 위치반환
console.log(text.indexOf("World"));

//대체
console.log(text.replace("World", "Universe"));

//추출
console.log(text.slice(6, 11));

//배열로
console.log(text.split(" "));

//일부반환
console.log(text.substring(0, 5));

//대소문자
console.log(text.toLowerCase());
console.log(text.toUpperCase());

//공백제거
console.log(text.trim()); 

//이메일검사 예제
function isValidEmail(email) {
    const pattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    return pattern.test(email);
  }
  console.log(isValidEmail("test@example.com")); // true
  console.log(isValidEmail("invalid-email")); // false

  //숫자알파벳만
  function isAlphanumeric(input) {
    const pattern = /^[a-zA-Z0-9]+$/;
    return pattern.test(input);
  }
  
  console.log(isAlphanumeric("abc123")); // true
  console.log(isAlphanumeric("abc!@#")); // false

  //url인지
  function isValidUrl(url) {
    const pattern = /^(http|https):\/\/[a-zA-Z0-9-\.]+\.[a-z]{2,4}(\/\S*)?$/;
    return pattern.test(url);
  }
  
  console.log(isValidUrl("https://example.com")); // true
  console.log(isValidUrl("invalid-url")); // false

  //비밀번호복잡성
  function isStrongPassword(password) {
    const pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return pattern.test(password);
  }
  
  console.log(isStrongPassword("Password123!")); // true
  console.log(isStrongPassword("password123")); // false
  
  //전화번호형식
  function isValidPhoneNumber(phone) {
    const pattern = /^\d{10}$/;
    return pattern.test(phone);
  }
  
  console.log(isValidPhoneNumber("1234567890")); // true
  console.log(isValidPhoneNumber("123-456-7890")); // false
  
  //공백문자제거
  function removeWhitespace(input) {
    const pattern = /\s+/g;
    return input.replace(pattern, '');
  }
  
  console.log(removeWhitespace("Remove   whitespace  characters")); // "Removewhitespacecharacters"

  //html 태그제거
  function removeHtmlTags(input) {
    const pattern = /<[^>]*>/g;
    return input.replace(pattern, '');
  }
  
  console.log(removeHtmlTags("<p>This is a <b>paragraph</b>.</p>")); // "This is a paragraph."
  








