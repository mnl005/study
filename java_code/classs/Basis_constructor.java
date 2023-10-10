package classs;

// 기본생성자는 객체의 초기화 작업을 담당
// 클래스에 생성자 미정의시 컴파일러가 기본생성자 추가
// 기본 생성자는 매개변수 받지 않는 형태로 정의
// 생성자는 new 연산자로 호출되는 중괄호 블록


public class Basis_constructor{

    private int num1;
    private int num2;

    //기본생성자로 초기화
    public Basis_constructor(int a, int b){
        System.out.println("기본생성자가 호출됨");
        this.num1 = a;
        this.num2 = b;
        System.out.println("a : " + this.num1);
        System.out.println("b : " + this.num2);
    }

    public static  void main(String[] args){
        Basis_constructor obj = new Basis_constructor(1,2);
    }

}