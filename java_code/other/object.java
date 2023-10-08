package other;

import java.lang.reflect.Array;

//자바의 타입은 기본타입(정수타입, 실수타입, 논리타입) 과 참조타입(배열,열거,클래스,인터페이스)
//참조타입은 번지를 통해 객체를 참조
//메소드영역은 클래스들을 읽어 이것을 모든 스레드가 공유한다
//힙영역은 객체와 배열이 생성되는 영역이며 다른 영역에서 참조하고 참조하지 않는 객체는 쓰레기 수집기가 자동으로 제거한다
//JVM스택영역은 메소드 호출시 프레임을 push,pop 한다


public class object {
    public static void main(String[] args){

        //문자열
        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = new String("aaa");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        //객체의 번지를 비교해서 false
        System.out.println(str1.equals(str3));
        //문자열을 비교해서 true


        //배열
        String[] arr1 = null;
        arr1 = new String[] {"a","b"};
        System.out.println(arr1[0]);

        String[] arr2 = new String[10];
        arr2[3] = "abc";
        System.out.println(arr2[3]);
        System.out.println(arr2.length);


    }
}
