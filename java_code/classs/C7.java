package java_code.classs;

class pars1 {
    void med1() {
    };
}

class pars2 {
    void med() {
        System.out.println("par med..");
    };
}

class cchh2 {
    pars2 obj = new pars2() {
        void med() {
            System.out.println("111");
        }
    };

    public void get1() {
        obj.med();
    }

    public void get2() {
        obj.med();
    }
}

class pars3 {
    void med() {
        System.out.println("par med..");
    };
}

class cchh3 {
    public void get(pars3 obj) {
        obj.med();
    };
}

// 메인 클래스
public class C7 {
    public static void main(String[] args) {

        pars1 obj = new pars1() {
            void med1() {
                System.out.println("med1..");
            }
        };
        obj.med1();

        cchh2 obj2 = new cchh2();
        obj2.get1();
        obj2.get2();
        obj2.obj.med();

        pars2 obj3 = new pars2() {
            @Override
            public void med() {
                System.out.println("익명객체");
            }
        };
        obj3.med();

        cchh3 obj4 = new cchh3();
        obj4.get(new pars3() {
            @Override
            void med() {
                System.out.println("obj...");
            }
        });

    }
}
