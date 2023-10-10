package classs;

public class Var_range {

    // 클래스변수 - 모든 객체가 공유하며 클래스 로딩 시 초기화되고 프로그램 종료시까지 존재 (static 로 선언된다)
    static String d1 = "클래스 변수";

    // 인스턴스변수 - 각 객체가 생성될 때 초기화되고, 객체 소멸시 함깨 소멸
    String d2 = "인스턴스 변수";

    public static void main(String[] args) {
        // 지역변수 - 선언된 블록 내에서만 사용 가능하며 블록 벗어날 시 소멸
        String d3 = "지역 변수";
        System.out.println(d3);

        Var_range obj = new Var_range();
        System.out.println(Var_range.d1);
        System.out.println(obj.d2);
    }

}
