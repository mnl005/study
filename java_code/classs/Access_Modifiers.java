package classs;

// 접근 제어자(Access Modifiers) : 클래스, 변수, 메서드 등의 접근 범위를 설정하는 제어자
// public : 모든 클래스에서 접근 가능
// protected : 같은 패키지 내부 및 상속받은 클래스에서 접근 가능
// default (아무 제어자도 없는 경우) : 같은 패키지 내부에서 접근 가능
// private : 해당 클래스에서만 접근 가능

// 그 외 제어자(Modifiers) : 접근 제어자를 제외한 나머지 제어자
// static : 클래스 레벨에서 공유되는 필드와 메서드를 선언할 때 사용
// final : 수정이 불가능한 상수, 메서드 오버라이딩 금지, 클래스 확장 금지 등의 용도로 사용
// abstract : 인스턴스 생성이 불가능한 추상 클래스, 추상 메서드를 선언할 때 사용
// synchronized : 멀티스레드 환경에서 동기화를 위해 사용
// volatile : 멀티스레드 환경에서 공유 변수의 값을 읽거나 쓸 때 메인 메모리에 접근보장
// transient : 직렬화 시에 해당 필드를 제외
// native : 자바 외부에서 구현된 네이티브 메서드를 선언할 때 사용

public class Access_Modifiers {

    // private는 public만을 통해 접근(단,시스템창 예외)
    // public는 외부에 공개
    // public로 private에 접근
    private String str = "private String";

    private String test() {
        return "1010";
    }

    private void test1() {
        System.out.println("test1");
    }

    public void publicmed() {
        System.out.println(this.str);
    }

    // 접근제어자 미지정시 default자동할당
    // 같은 패키지 내에서만 접근가능
    void defaultmed() {
        System.out.println("defaultmed()");
    }

    // 같은 패키지나 다른 패키지의 자식에서 접근허용
    protected void protectedmed() {
        System.out.println("protected test.med4()");
    }

    // 싱글톤 (getIns 라는 메소드를 통해 단 한번 객성)
    private static Access_Modifiers single = new Access_Modifiers();

    private Access_Modifiers() {
    }

    public static Access_Modifiers getIns() {
        return single;
    }

    // final 필드(프로그램 실행도중 수정불가)
    final String fffstr1 = "a";

    // final static 필드(프로그램 실행도중 수정불가)
    final String fffsssstr1 = "a";

    //패키지는 상위패키지.하위패키지 형태로 구성
    //import 상위패키지.하위패키지.*;


    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        obj.test();
        obj.test1();
        obj.publicmed();// puvlic로 private접근
        obj.defaultmed();


    }
}
