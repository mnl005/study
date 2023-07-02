//콜백함수 ----------------------------------------------------------------------
function fetchData(callback) {
    // 비동기 작업 시뮬레이션
    setTimeout(() => {
      const data = { name: "John", age: 30 };
      callback(data);
    }, 2000);
  }
  
  function processResult(data) {
    console.log("Received data:", data);
    // 데이터 처리 작업
  }
  
  fetchData(processResult);
  console.log("Fetching data...");
  
  //Promise ----------------------------------------------------------------------

  function fetchData() {
    return new Promise((resolve, reject) => {
      // 비동기 작업 시뮬레이션
      setTimeout(() => {
        const data = { name: "John", age: 30 };
        resolve(data);
        // 또는 reject를 호출하여 실패 상황을 처리할 수 있습니다.
      }, 2000);
    });
  }
  
  fetchData()
    .then((data) => {
      console.log("Received data:", data);
      // 데이터 처리 작업
    })
    .catch((error) => {
      console.error("Error occurred:", error);
      // 에러 처리 작업
    });
  console.log("Fetching data...");


  function fetchUserData() {
    return new Promise((resolve, reject) => {
      // 비동기 작업 시뮬레이션
      setTimeout(() => {
        const data = { name: "John", age: 30 };
        resolve(data);
        // 또는 reject를 호출하여 실패 상황을 처리할 수 있습니다.
      }, 2000);
    });
  }
  
  fetchUserData()
    .then((data) => {
      console.log("Received data 1:", data);
      return data.age;
    })
    .then((age) => {
      console.log("Received age:", age);
      return age * 2;
    })
    .then((doubledAge) => {
      console.log("Doubled age:", doubledAge);
    })
    .catch((error) => {
      console.error("Error occurred:", error);
      // 에러 처리 작업
    });
  console.log("Fetching user data...");
  
  

  //Async/Await ----------------------------------------------------------------------

  function fetchData() {
    return new Promise((resolve, reject) => {
      // 비동기 작업 시뮬레이션
      setTimeout(() => {
        const data = { name: "John", age: 30 };
        resolve(data);
        // 또는 reject를 호출하여 실패 상황을 처리할 수 있습니다.
      }, 2000);
    });
  }
  
  async function processAsync() {
    try {
      const data = await fetchData();
      console.log("Received data:", data);
      // 데이터 처리 작업
    } catch (error) {
      console.error("Error occurred:", error);
      // 에러 처리 작업
    }
  }
  
  processAsync();
  console.log("Fetching data...");
  

  //이벤트 루프 ----------------------------------------------------------------------

  console.log("Start");

setTimeout(() => {
  console.log("Timeout 1");
}, 2000);

setTimeout(() => {
  console.log("Timeout 2");
}, 1000);

console.log("End");