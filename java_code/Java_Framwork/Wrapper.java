package Java_Framwork;
// Wrapper 은 기본 데이터 타입을 객체로 다룰 수 있도록 만들어진 클래스

public class Wrapper {
    public static void main(String[] args){

        //기본자료형
        int a = 0;

        //박싱
        Integer aa = new Integer(10);

        //언박싱
        int aaa = aa.intValue();

        //오토박싱
        Integer ao = 10;

        //오토언박싱
        int b = aaa;

    }
}
