package basic;

//자바는 클래스 통한 다중상속 미지원
//인터페이스는 다른 클래스 작성시 기본틀 제공, 다른 클래스 사이의 중간매개역할 담당하는 일종의 추상 클래스
//인터페이스는 오로지 추상 메소드와 상수만을 포함가능
//public static final[변수명], public abstract[메소드명] 의 접근자 생략가능
//인터페이스를 상속받는 클래스에서는 인터페이스에 선언된 메소드를 반드시 구현
//인터페이스를 상속받는 클래스가 인터페이스의 필수 메소드에 기능을 명시하지 않을 시 추상클래스로 선언
//인터페이스가 다른 인터페이스를 상속 가능
//인터페이스의 디폴트 메소드는 인터페이스를 구현한 클래스의 인스턴스에서 호출가능
//인터페이스의 디폴트 메소드는 구현객체로 사용 가능하며 제정의 가능
//인터페이스의 정적 메소드는구현객체로 사용 가능하며 재정의 불가

interface inf1{
    int num1 = 1;
    public int num2 = 2; //상수정의(필드상용불가, final static 과 동일하다)
    void med1();
    public void med2(); //메소드의 기능정의 불가

    default void med3(){};  //수행내용을 명시해서 인터페이스에 추기가능 확장가능
    static void med4(){};   //객채없이 호출가능
}
class c1 implements inf1{
    public void medd(){};
    public void med1(){System.out.println("c1...med1...");}
    public void med2(){};
}
public class Interface {
    public static void main(String[] args) {
        inf1 ii = new inf1() {
            public void med1(){System.out.println("aaaaaa");}
            public void med2(){System.out.println("bbbbbb");}
        };
        //인터페이스에 선언된 추상메소드의 실체 메소드를 선언하는 방법
        ii.med1();
        ii.med2();
        System.out.println("_______________________________________________________________________");

        inf1 obj1 = new c1(){
            public void med2(){System.out.println("임시객체");}
            //이렇게도 가능하다--다형성...(임시객체)
        };
        obj1.med2();

    }
}

