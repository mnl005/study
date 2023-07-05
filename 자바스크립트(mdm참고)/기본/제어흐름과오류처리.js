console.log(
  "while_______________________________________________________________________________________________________________________________________"
);
let i = 0;
let j = 0;
while (i < 3) {
  console.log("i : " + i++); //후행연산
  console.log("j : " + ++j); // 선행연산
}

i = 0;
j = 0;
do {
  i = 10;
  j = 10;
  console.log("실행");
} while (i < 10);

console.log(
  "if_______________________________________________________________________________________________________________________________________"
);

if (null) {
  console.log("true");
} else if (undefined) {
  console.log("true");
} else if (false) {
  console.log("true");
} else {
  console.log("false");
}

console.log(
  "switch_______________________________________________________________________________________________________________________________________"
);

let swi = "a";
switch (swi) {
  case 0:
    console.log(0);
    break;
  case "d":
    console.log("d");
    break;
  case " a":
    console.log(" a");
    break;
  default:
    console.log("default");
}

console.log(
  "try______________________________________________________________________________________________");

let count1 = 0;
while (1) {
  if (count1 > 2) {
    return 0;
  }
  try {
    throw {
      toString: function () {
        return "function......";
      },
    };
  } catch (e) {
    console.log("에러 : " + e);
  } finally {
    console.log("done..");
  }
  count1++;
}




