package java_code.classs;

//자바는 객체지향 
//캡슐화로 객체의 필드메소드를 하나로 묶오 구현 내용을 감추어 외부객체가 내부구조 알지 못하며 객체가 노출하는 필드와 메소드만 사용하게 한다
//상속으로 상위객체를 재사용해 하위 객체의 설계를 돕는다
//다형성은 하나의 객체의 여러 객체를 대입함으로써 객체의 부품화를 가능케한다

//필드는 객체의 정보를 저장하며 선언형태는 변수와 유사하고 생성자와 메소드 내에서만 사용되며 종료시 소멸
//생성자는 new 연산자로 호출되는 줄괄호 블록
//메소드는 객체의 동작에 해당하는 중괄호 블록이다

// 자바는 클래스를 통한 다중 상속을 미지원
// 인터페이스는 다른 클래스에 기본 틀을 제공, 다른 클래스 사이의 중간 매개 역할을 담당하는 추상 클래스
// 인터페이스는 오로지 추상 메서드와 상수만을 포함가능
// 접근 제어자(public static final [변수명], public abstract [메서드명])의 생략가능
// 인터페이스를 구현하는 클래스에서는 인터페이스에 선언된 모든 추상 메서드를 반드시 구현
// 디폴트 메서드는 인터페이스에 기본적인 구현을 제공, 필요에 따라 재정의
// 정적 메서드는 인터페이스명을 통해 호출, 객체 생성 없이도 호출
// 인터페이스를 익명 클래스로 구현하여 객체를 생성


class field1 {
    static String d1 = "this d1";
    // 클래스변수
    String d2 = "this d2";
    // 인스턴스변수
}

class field2 {
    String name = "none";
    String age = "none";

    field2(String name) {
        this(name, "adf");
    }

    field2(String name, String age) {
        this.name = name;
        this.age = age;
    }
}

class field3 {
    private int num1;
    private int num2;

    public field3() {
        System.out.println("기본 생성자가 호출됨");
    }// 기본생성자에 기능부여(사용 않더라도 자동호출된다)

    public void set(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public void get() {
        System.out.println(this.num1 + " " + this.num2);
    }
}

class field4 {
    private int num1;
    private int num2;

    public field4(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        System.out.println(this.num1 + " " + this.num2);
    }

    public void set(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public void get() {
        System.out.println(this.num1 + "nnnn" + this.num2);
    }
}

class field5 {
    private int num1;
    private int num2;

    public field5(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public void med() {
        System.out.println(this.num1 + " " + this.num2);
    }
}

class field6 extends field5 {
    public field6(int aa, int bb) {
        super(aa, bb);
    }
}

class field7 {
    int a = 10;
}

class field8 extends field7 {
    int a = 100;

    void med() {
        System.out.println(a); // child
        System.out.println(this.a);// child
        System.out.println(super.a);// parent
    }
}

class field9 {
    int a;

    field9() {
        a = 1;
    }

    field9(int n) {
        a = n;
    }
}

class field10 extends field9 {
    field10() {
        super(99999);
    }
}

class field11 {
    void med() {
        System.out.println("this is parent med()");
    }
}

class field12 extends field11 {
    // 오버라이딩
    void med() {
        System.out.println("this is child med()");
    }

    // 오버로딩 (매개변수의 타입,갯수,순서를 달리한다)
    void med(String str) {
        System.out.println("new : " + str);
    }

}

public class C1 {

    public static void main(String[] args) {
        String d3 = "this d3";// 지역변수
        System.out.println(d3);
        field1 obj = new field1();
        System.out.println(field1.d1);
        System.out.println(obj.d2);

        // 기본 생성자로 호출
        field2 obj2 = new field2("lee");
        System.out.println(obj2.name);
        System.out.println(obj2.age);

        // 기본생성자는 미작성해도 클래스에서 기본 명시됨
        field3 obj3 = new field3();
        obj3.set(1, 3);
        obj3.get();

        // 기본 생성자로 매개변수 작성
        field4 obj4 = new field4(100, 200);
        obj4.set(1, 3);
        obj4.get();

        // super()로 부모의 기본생성자를 호출
        field6 obj6 = new field6(1, 2);
        obj6.med();

        // 상속시 자식 클래스의 최상단에 super() 명시하니 않을시 super()이 자동으로 생성
        // super()은 부모 생성자를 호출
        // 부모 클래스에 기본생성자로 생성시, 자식클래스의 기본생성자에도 생성자 필요
        field8 obj8 = new field8();
        obj8.med();

        field10 obj10 = new field10();
        System.out.println(obj10.a);

        // 오버라이딩 : 상속받은 기존의 메소드 재정의
        // 오버로딩 : 새로운 기능의 메소드 정의
        field12 obj12 = new field12();
        obj12.med();
        obj12.med("haha");

    }

}
