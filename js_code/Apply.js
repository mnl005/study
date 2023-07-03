const user = {
    name: "mike",
    showName: function () {
        console.log(`hello, ${this.name}`);
        return 0;
    }
}

let fn = user.showName;
fn(); 
// 오류: this.name은 undefined입니다.

let fn2 = user.showName(); 
fn2;
// 잘 나오지 않습니다.

user.showName();
// 잘 나옵니다.

let fn3 = user.showName();
console.log(fn3);
// 잘 나옵니다.

fn.call(user);
fn.apply(user);
// this를 직접 지정해주어서 잘 나옵니다.

let bindfn = fn.bind(user);
bindfn();
// 잘 나옵니다.
