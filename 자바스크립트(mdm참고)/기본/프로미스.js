function fun1(n) {
  return new Promise((resolve) => {
    setTimeout(() => {
      n += 1;
      console.log("n :", n);
      resolve(n);
    }, 1000);
  });
}

function fun2(n) {
  return new Promise((resolve) => {
    setTimeout(() => {
      n += 2;
      console.log("n :", n);
      resolve(n);
    }, 1000);
  });
}

fun1(0)
  .then(fun1)
  .then(fun2)
  .then(fun1)
  .then(fun1)
  .catch((error) => {
    console.log("Error:", error);
  })
  .finally(() => {
    console.log("end...");
  });
