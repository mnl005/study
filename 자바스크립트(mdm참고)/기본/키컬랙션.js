
//맵
let map1 = new Map();
map1.set("a","aaa");
map1.set("b","bbb");
map1.set("c","ccc");
console.log(map1);
console.log(map1.size);
console.log(map1.get("a"));
console.log(map1.has("aaa"));
map1.delete("c");
for([a,b] of map1){
    console.log(a,b);
}

//셋
let set = new Set();
set.add(1);
set.add("a");
set.add("b");
set.add("b");
set.delete("a");
console.log(set);
console.log(set.has(1));
console.log(set.size);
for(a of set){
    console.log(a);
}


