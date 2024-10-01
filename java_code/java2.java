// 객체 : 자신의 속성이 있고 식별 가능한 것
// 객체 모델링 : 현실세계 객체의 속성과 동작을 추려내 소프트웨어의 긱체의 필드와 메소드로 정의하는 과정

// 집합관계 : 완성품과 구성부품 간의 관계
// 사용관계 : 다른 객체의 메소드로 결과를 얻는것
// 상위관계 : 상위 객체 기반으로 생성하는 구체화된 하위객체 간의 관계

// name.java 형태의 소스파일을 컴파일하면 name.class 형태의 바이트 코드 파일이 생성
// new 클래스() : 클래스로부터 객체를 생성하는 연산자, 힙 메모리 영역에 생성

// 필드 : 객체의 데이터 저장소, 변수와 다른점은 필드는 생성자와 메소드 전체에서 사용되며 객체와 항상 존재
// 필드선언 : 클래스 중괄호 내부중 생성저와 메소드 내부 이외에 영역에 선언가능
// 필드사용 : 클래스 내부에선 바로 사용 가능, 클래스 외부에선 객체 생성 후 참조변수를 통해 사용
// 로컬변수 : 생성자나 메소드 중괄호 내부에 선언된 변수, 필드와 다름
// 생성자 : 객체 생성시 초기화, 클래스 이름으로 되었으며 리턴 타입이 없음
// 객체 초기화 : new 연산자에 의해 생성자 실행시 힙 영역에 객체가 생성되고 객체의 번지가 클래스 변수에 저장
// 기본 생성자 : 클래스 내부에 생성자 선언 생략시 컴파일러가 바이트코드에 자동으로 생성자 추가
// 메소드 : 객체의 동작에 해당, 객체간 데이터 전달
// 외부 메소드 사용시 객체 선언 후 사용가능

// 오버로딩 : 같은 클래스에 같은 이름의 메소드 여러개 단, 매개변수타입.개수.순서 중 하나이상 달라야 한다

// 인스턴스 맴버 : 객체 생성 후 사용가능한 필드와 메소드
// this : 객체 내부에서 인스턴스 맴버에 접근하기 위함
// 정적 맴버 : static로 선언된 필드와 메소드, 객체 없이 실행가능, this 키워드 사용 불가
// 정적 맴버는 클래스 로더가 클래스 바이트 코드 로딩해서 메모리 영역에 적재시 클래스별로 관리되며 클래스 로딩후 바로 사용가능
// static는 객체마다 고유하지 않을 공용 데이터일때 사용

// 싱글톤 : 객체 생성시 new 키워드 막고 클래스 내부에 선언된 객체 하나만 사용하도록 강제해서
// 전체 프로그램에서 하나의 객체만 만들도록 하는것

// final : 초기값 저장시 프로그램 실행 도중 수정 불가
// static final : 불변값

// 상위패키지.하위패키지.클래스

// default : 다른 패키지간 사용 제한
// public : 다른 패키지간 사용 가능
// protected :  같은 패키지간 사용 가능, 다른 패키지에 속한 클래스가 해당 클래스의 자식인 경우 사용 가능
// private : 클래스 내부에서만 호출과 객체생성 가능
// getter.setter : 객체 지향 프로그래밍에서 객체의 필드가 외부와 직접적으로 접근하는 걸 막는다

// 상속 : 부모 여럿 불가, 부모 클래스의 private 가진 플드나 메소드 상속 불가, 부모와 자식이 다른 패키지에 존재시 default 갖는 필드.메소드상속ㄴ
// super : 부모의 기본생성자 호출
// 오버라이딩 : 메소드 재정의

// 다형성 : 메소드 재정의 + 타입변환
// 부모타입 변수 = 자식타입; : 자동 타입 변환, 부모에 정의된 메소드 사용가능, 재정의된 메소드 사용가능, 부모에 정의되지 않은 메소드 사용 불가
// 객체 instanceof 타입 : 객체의 타입 확인

// 추상 클래스 : 추상 클래스를 상속받는 실체 클래스들에서 공통되는 필드와 메소드의 집합

// 인터페이스 : 개발코드와 객체가 통신하는 접점, 코드변경 없이 사용객체 변경하여 리턴내용을 다양화
// 객체 사용 방법을 정의한 것으로 인스턴스 필드나 정적필드 선언 불가, 상수필드 선언가능

// 일반예외 : 소스 컴파일 중 예외처리 코드 없을시 컴파일 오류(java.lang.Exception.* 을 제외한 예외)
// 실행예외 : 프로그램 실행중 발생하는 예외(java.lang.Exception.* 에 해당하는 예외)

// NullPointerException : 객체=null인 객체 참조시
// ArrayIndexOutOfBoundsException : 배열의 인덱스 범위를 초과한 경우
// NumberFormatException : 문자열을 숫자로 변경하는 경우 중 발생
// ClassCastException : 타입 변환시 관계가 부적절한 경우 발생


public class java2 {


    static class c1 {
        static void hello() {
            System.out.println("hello?");
        }

        void hello1() {
            System.out.println("hello?");
        }

        c1(String str) {
            this.other = str;
        }

        c1(String str1, String str2) {
            this.name = str1;
            this.other = str2;
        }

        c1(String str1, String str2, String str3) {
            this(str1, str2);
            this.other2 = str3;
        }

        String name = "c1";
        String other;
        String other2;
    }

    static class c2 extends c1 {
        c2(String str) {
            super(str);
        }

        @Override
        void hello1() {
            System.out.println("hihihi");
        }

        ;

        void sss() {
            super.hello1();
        }
    }

    static abstract class person {
        public String name;

        public person(String name) {
            this.name = name;
        }

        public abstract void work();

        public abstract void run();
    }

    static class man1 extends person {
        public man1(String name) {
            super(name);
        }

        @Override
        public void work() {
            System.out.println("....");
        }

        @Override
        public void run() {
            System.out.println("bbbrrbrbrbrbr");
        }
    }

    static interface inter {
        public int MAX = 10;
        public int MIN = 0;

        public void get();

        public void set(int value);
    }

    static class product implements inter {
        int val = 0;

        public void get() {
            System.out.println("val : " + val);
        }

        public void set(int value) {
            if (value <= MAX && value >= MIN) {
                this.val = value;
            }
        }
    }

    public static void main(String[] args) {

        c1.hello();
//        c1.hello1(); 불가

        c1 ob1 = new c1("...");
        System.out.println(ob1.name + " : " + ob1.other);

        c1 ob2 = new c1("nn", "rr");
        System.out.println(ob2.name + " : " + ob2.other);

        c1 ob3 = new c1("nn", "rr", "qq");
        System.out.println(ob3.name + " : " + ob3.other + " : " + ob3.other2);

        c2 ob4 = new c2("...");
        ob4.hello1();
        ob4.sss();

        man1 ob5 = new man1("lee");
        System.out.println("name : " + ob5.name);
        ob5.run();
        ob5.work();

        inter ob6 = new product();
        ob6.set(3);
        ob6.get();

        try {
            throw new Exception("확인 안 한 에러");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("done");
        }


    }
}
