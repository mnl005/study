let one; // one은 선언되었지만 초기화되지 않았습니다.
one = 1;

function addOne(num) {
    console.log(one + num); // 여기서 one에 접근할 수 있습니다. 왜냐하면 one은 전역 스코프에 있기 때문입니다.
}

addOne(5); // 6을 출력합니다.

// 클로저 예제 1
function make(x) {
    return function(y) {
        return x + y;
    }
}

const add1 = make(3);
console.log(add1(2)); // 5를 출력합니다 (3 + 2)
// add1 함수는 클로저 때문에 x에 접근할 수 있습니다.
// 클로저는 함수가 선언됐을 때의 스코프에 있는 변수들에게 접근할 수 있도록 합니다.
// 심지어 그 스코프를 빠져나간 후에도 말이죠.

// 클로저 예제 2
function makeCounter() {
    let num = 0; // 이 함수 바깥에서는 num에 접근할 수 없습니다.
    return function() {
        return num++;
    }
}

let counter = makeCounter();
console.log(counter()); // 0을 출력합니다.
console.log(counter()); // 1을 출력합니다.
console.log(counter()); // 2를 출력합니다.
// counter 함수를 호출할 때마다 num은 증가합니다.
