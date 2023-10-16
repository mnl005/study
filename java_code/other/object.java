package other;

import java.lang.reflect.Array;

// 자바의 타입은 기본 타입(정수 타입, 실수 타입, 논리 타입) 과 참조 타입(배열,열거,클래스, 인터 페이스)
// 참조 타입은 번지를 통해 객체를 참조
// 메소드 영역은 클래스 들을 읽어 이것을 모든 스레드 가 공유 한다
// 힙 영역은 객체와 배열이 생성 되는 영역 이며 다른 영역 에서 참조 하고 참조 하지 않는 객체는 쓰레기 수집기 가 자동 으로 제거 한다
// JVM 스택 영역은 메소드 호출시 프레임 을 push,pop 한다

public class object {
    public static void main(String[] args){

        // 문자열
        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = new String("aaa");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        // 객체의 번지를 비교 해서 false
        System.out.println(str1.equals(str3));
        // 문자열 을 비교 해서 true


        // 배열
        String[] arr1 = null;
        arr1 = new String[] {"a","b"};
        System.out.println(arr1[0]);

        String[] arr2 = new String[10];
        arr2[3] = "abc";
        System.out.println(arr2[3]);
        System.out.println(arr2.length);

    }
}
