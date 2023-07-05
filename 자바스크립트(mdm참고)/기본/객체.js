let ob = {
    a:"aaa",
    b:"bbb",
    c:"ccc"
};
console.log(ob);

ob.d = "ddd";
ob.c = null;
ob["a"] = 0;
console.log(ob);

for(a in ob){
    console.log(a + " : " + ob[a]);
}

//프로토타입 체인통해 상속
const obob = Object.create(ob);
console.log(obob); //빈객체처럼
console.log(obob.a);
console.log(obob.b);
console.log(obob.c);
console.log(obob.d);
obob.d = "aaaaaa";
console.log(obob);
delete obob.d;
console.log(obob);

let test1 = {a : "a"};
let test2 = {a : "a"};
console.log(test1 == test2);
console.log(test1 === test2);

let test3 = test2;
console.log(test3 == test2);
console.log(test3 === test2);
test3.a = null;
console.log(test3);
console.log(test2);


