const x = document.getElementById("demo");

function getLocation() {
  try {
    navigator.geolocation.getCurrentPosition(showPosition, showError);
  } catch (err) {
    x.innerHTML = "Geolocation is not supported by this browser.";
  }
}

function showPosition(position) {
  x.innerHTML = "Latitude: " + position.coords.latitude + 
  "<br>Longitude: " + position.coords.longitude;
}

function showError(error) {
  switch(error.code) {
    case error.PERMISSION_DENIED:
      x.innerHTML = "User denied the request for Geolocation.";
      break;
    case error.POSITION_UNAVAILABLE:
      x.innerHTML = "Location information is unavailable.";
      break;
    case error.TIMEOUT:
      x.innerHTML = "The request to get user location timed out.";
      break;
    case error.UNKNOWN_ERROR:
      x.innerHTML = "An unknown error occurred.";
      break;
  }
}

localStorage.setItem("name", "John Doe");
console.log(localStorage.getItem("name"));

sessionStorage.setItem("name", "John Doe");
console.log(sessionStorage.getItem("name"));




document.write("userAgent 프로퍼티로 알 수 있는 추가 정보는 " + navigator.userAgent + "입니다.");
document.write("현재 브라우저가 실행되고 있는 운영체제는 " + navigator.platform + "입니다.");
document.write("현재 브라우저의 기본 언어 설정은 " + navigator.language + "입니다.");

document.write("현재 브라우저는 자바 애플릿를 ");
if (navigator.javaEnabled()) {
  document.write("실행할 수 있습니다.");
} else {
  document.write("실행할 수 없습니다.");
}

document.write("현재 브라우저는 쿠키를 ");
if (navigator.cookieEnabled) {
  document.write("사용할 수 있습니다.");
} else {
  document.write("사용할 수 없습니다.");
}
document.write("현재 문서의 주소는 " + location.href + "입니다.");
document.write("현재 문서의 호스트 이름은 " + location.hostname + "입니다.");
document.write("현재 문서의 파일 경로명은 " + location.pathname + "입니다.");
document.write("Page protocol is " + location.protocol);
document.write("Port number is " + location.port);
function openDocument() {
  location.assign("/index.php");
}

function openDocumentWithReplace() {
  location.replace("/index.php");
}
function goBack() {
  window.history.back();
}

function goForward() {
  window.history.forward();
}
