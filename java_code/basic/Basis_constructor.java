package basic;

// 기본생성자는 객체의 초기화 작업을 담당
// 클래스에 생성자 미정의시 컴파일러가 기본생성자 추가

public class Basis_constructor{

    private int a = 0;

    //기본생성자 초기화
    public Basis_constructor(int a){
        System.out.println("기본생성자가 호출됨");
        System.out.println("인스턴스 변수 a : " + this.a);
        System.out.println("지역변수 a : " + a);
    }

    public static  void main(String[] args){

        Basis_constructor obj = new Basis_constructor(100);

    }

}