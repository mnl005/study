package java_code.classs;

class out {
    String a = "this is out";

    class in {
        String b = "this is in";

        class iin {
            String c = "this is iin";
        }
    }
}

class form {
    int a = 11111;
    public int b = 1111;

    class in {
        int a = 22222;

        public void med1() {
            System.out.println(form.this.a);
        }// 클래스 외부 값

        public void med2() {
            System.out.println(this.a);
        }// 클래스 내부
    }
}

class out2 {
    in1 obj;

    public void set(in1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.med();
    }

    interface in1 {
        public void med();
    }
}

class ci1 implements out2.in1 {
    public void med() {
        System.out.println("c1......");
    };
}

class ci2 implements out2.in1 {
    public void med() {
        System.out.println("c2......");
    };
}

public class C6 {
    public static void main(String[] args) {
        out obj1 = new out();
        System.out.println(obj1.a);

        out.in obj2 = obj1.new in();
        System.out.println(obj2.b);

        out.in.iin obj3 = obj2.new iin();
        System.out.println(obj3.c);

        //
        form f = new form();
        form.in inner = f.new in();
        inner.med1();
        inner.med2();
        System.out.println(f.b);

        //
        out2 ob = new out2();
        ob.set(new ci1());
        ob.run();
        ob.set(new ci2());
        ob.run();

        out2.in1 gg = new ci1();
        gg.med();

    }
}