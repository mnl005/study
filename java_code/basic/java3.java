package basic;// java.lang....
// Object : 자바 클래스의 최상위 클래스
// System : 표준 입력.출력 장치 사용시, 자바 가상 기계 종료시, 쓰레기 수집기 요청시
// Class : 메모리로 클래스 로딩시
// String : 문자열 저장시, 정보 얻을때
// Wrapper(Byte,Short,Character,Integer,Float,Double,Boolean,Long)
// : 기본타입의 데이터 갖는 객체 생성시,문자열기본타입으로 변환시,입력값검사시
// Math : 수학 함수 이용시

// obj.hashCode() : 객체 식별하는 정수값, 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴

//

import java.util.Date;
import basic.*;


public class java3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Object ob1 = new Object();
        Object ob2 = new Date();
        System.out.println(ob1 + " , " + ob2);

        long time1 = System.nanoTime();
        for(int a = 0; a < 100; a++){
            if(a % 3 == 0){
                a++;
            }
        }
        long time2 = System.nanoTime();
        System.out.println(time1 + " ~~~ " + time2);

        Class ob3 = java2.class;
        Class ob5 = Class.forName("basic.java2");
        Class ob4 = ob3.getClass();
        System.out.println(ob3.getName());
        System.out.println(ob3.getSimpleName());
        System.out.println(ob3.getPackage().getName());

        String str = "  abc efg ";
        String strr = "abc cba";
        String num = "1234";
        System.out.println(str.charAt(0));
        System.out.println(str.equals(strr));
        System.out.println(str.indexOf("b"));
        System.out.println(str.length());
        System.out.println(str.replace("abc","qqq"));
        System.out.println(str.substring(0,3));
        System.out.println(str.toUpperCase());
        System.out.println(String.valueOf(23));


        System.exit(0);
    }
}
