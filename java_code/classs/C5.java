package java_code.classs;

//자바는 클래스 통한 다중상속 미지원
//인터페이스는 다른 클래스 작성시 기본틀 제공, 다른 클래스 사이의 중간매개역할 담당하는 일종의 추상 클래스
//인터페이스는 오로지 추상 메소드와 상수만을 포함가능
//public static final[변수명], public abstract[메소드명] 의 접근자 생략가능
//인터페이스를 상속받는 클래스에서는 인터페이스에 선언된 메소드를 반드시 구현
//인터페이스를 상속받는 클래스가 인터페이스의 필수 메소드에 기능을 명시하지 않을 시 추상클래스로 선언
//인터페이스가 다른 인터페이스를 상속 가능
//인터페이스의 디폴트 메소드는 인터페이스를 구현한 클래스의 인스턴스에서 호출가능

interface inf1 {
    int num1 = 1;
    int num2 = 2; // 상수 정의(필드 상용 불가)

    void med1();

    void med2(); // 메소드의 기능 정의 불가

    default void med3() {
        System.out.println("default med3");
    };

    static void med4() {
        System.out.println("static med4");
    };
}

class ct1 implements inf1 {
    public void medd() {
        System.out.println("public ct1 medd");
    };

    public void med1() {
        System.out.println("c1...med1...");
    }

    public void med2() {
        // 구현 내용
    };
}

// __________________________

interface face1 {
    public abstract void med();
}

interface face2 {
    public abstract void oed();
}

class cf1 implements face1, face2 {
    public void med() {
        System.out.println("this is cf1.med()");
    }

    public void oed() {
        System.out.println("this is cf1.oed()");
    }
}

// __________________________

interface face3 {
    public abstract void med();
}

interface face4 extends face3 {
    public abstract void med();
}

interface face5 extends face3 {
    public abstract void med();
}

class cf2 implements face4, face5 {
    public void med() {
        System.out.println("cf2");
    }
}

public class C5 {
    public static void main(String[] args) {

        //
        inf1 ii = new inf1() {
            public void med1() {
                System.out.println("aaaaaaa");
            }

            public void med2() {
                System.out.println("bbbbbbbbbb");
            }
        };
        ii.med1();
        ii.med2();
        ii.med3();
        inf1.med4();

        //
        inf1 obj1 = null;
        obj1 = new ct1() {
            public void med2() {
                System.out.println("cccccccc");
            }
        };
        obj1.med1();
        obj1.med2();
        obj1.med3();

        // 상속받은 인터페이스의 디폴트메소드 사용
        ct1 obj2 = new ct1();
        obj2.med3();

        // 다중상속
        cf1 obj3 = new cf1();
        obj3.med();
        obj3.oed();

        // 다중상속
        cf2 obj4 = new cf2();
        obj4.med();

    }
}
