class c1{
    constructor(a,b,...c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.get = function(){console.log(this.c);}
    }

    field1 = "aaa";
    med1(){console.log("med1...")};
    static field2 = "bbbb";
    static med2(){console.log("med1...");};

    static{
        console.log("static block..");
    }
}

let ins1 = new c1(12,"ds",1,2,3);
console.log(ins1.field1);
ins1.med1();
console.log(ins1.a);
console.log(ins1.b);
ins1.get();
ins1.a = null;
console.log(ins1);


class c2 extends c1{
    constructor(){
        super();
        console.log("c2..");
    }
}
let ins2 = new c2();
console.log(ins2);















