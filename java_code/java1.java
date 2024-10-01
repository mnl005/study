// 기본타입 : boolean, byte, char, short, int, long, float, double
// 접근 제한자 : private, protected, public
// 클래스 : class, abstract, interface, extends, implements, enum
// 객체 : new, instanceof, this, super, null
// 메소드 : void, return
// 제어문 : if, else, switch, case, default, for, do, while, break, continue
// 논리값 : true , false
// 예외처리 : try, catch, finally, throw, throws
// 기타 : package, import, synchronized, final, static

// 변수 초기화시 메모리 번지 정보 갖게 되고 해당 메모리 번지에 값이 저장
// 변수는 중괄호 플록 내에서 선언되고 사용된다
// 메소드 블록 내에 선언된 로컬변수는 메소드 실행 끝나면 메모리에서 제거됨

// 작은범위허용 변수를 큰범위허용 변수에 집어넣을때 큰범위허용변수로 자동타입 변환
// byte < short < int < long < float < double
// 강제 타입 변환은 캐스팅 통해서

// 산술 : +, -, *, /, %
// 부호 : +, -
// 문자열 : +
// 대입 : =, +=, -=, *=, /=, %=
// 증감 : ++, --
// 비교 : ==, !=, >, <, >=, <=, instanceof
// 논리 : !, &, |, &&, ||
// 조건 : (조건식) ? A:B

// 객체의 번지를 참조하는 타입 : 배열, 열거, 클래스, 인터페이스
// 기본타입은 실제값을 변수에 저장
// 참조타입은 메모리 번지를 변수에 저장

// JVM이 운영체제로부터 할당받은 메모리 영역은 메소드,힙,JVM스택 영역으로 구분
// 메소드 영역 : 모든 스레드가 공유, 클래스들을 클래스 로더로 읽어 정적필드,상수,메소드코드,생성자코드로 분류 후 저장
// 힙 영역 : 객체가 생성되는 영역, 다른 영역에서 해당 영역 내의 데이터 참조, 참조되지 않는 데이터는 자동 제거
// JVM스택 영역 : 메소드 호출.종료시 프레임을 추가.제거 하는 동작을 반복
// 기본타입 변수는 JVM스택영역에 직접 생성
// 객체는 선언 후 초기화시 힙영역에 존재하고, 해당 객체를 가르키는 힙영역 주소가 JVM스택에 존재

// 객체 번지 비교 : ==
// 객체 값 비교 : equals
// 객체 = null : 참조 타입 변수가 힙 영역 객체를 참조하지 않는다
// 동일 문자열은 객체를 공유

// 배열 : 같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스를 부여한 구조, 길이 변경 불가

// 열거 타입 : 몇가지로 제한된 상수를 가지는 타입

import java.util.Scanner;

public class java1 {
    public static void main(String[] str) throws Exception {

        int int2 = 0b1011;
        int int8 = 0206;
        int int10 = 365;
        int int16 = 0xB3;
        System.out.println(int2 + " " + int8 + " " + int10 + " " + int16);

        byte byte1 = -128;
        byte byte2 = 0;
        byte byte3 = 127;
        System.out.println(byte1 + " " + byte2 + " " + byte3);

        long long1 = 20L;
        System.out.println(long1);

        char char1 = 'A';
        char char2 = 65;
        System.out.println(char1 + " " + char2);

        String string = "a\tb \n \"cc\" \\d";
        System.out.println(string);

        float float1 = 3.14f;
        double double1 = 3.15;
        System.out.println(float1 + " " + double1);

        float1 = (float) double1;
        System.out.println(float1);

        double double2 = (double) 3 / 4;
        System.out.println(double2);

        String string2 = 1 + 1 + (1 + 1) + "1";
        System.out.println(string2);

        int int1 = Integer.parseInt("103");
        System.out.println(int1 - 3);

//        int string3 = System.in.read();
//        System.out.println("Keycode : " + string3);

//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        System.out.println(input);

        int int3 = 0;
        ++int3;
        int3 += 1;
        String string3 = (int3 == 2) ? "a" : "b";
        System.out.println(string3);

        if (false) {
            System.out.println("false");
        } else if (false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        switch (2) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("err");
                break;
        }

        for (int a = 0; a < 3; a++) {
            System.out.println("for : " + a);
        }

        while (3 > 0) {
            System.out.println("while");
            if (true) {
                break;
            }
        }

        do {
            System.out.println("do");
            if (false) {
                continue;
            }
        }
        while (false);

        String string4 = "a";
        String string6 = new String("a");
        System.out.println(string4.equals(string6));
        System.out.println(string4 == string6);

        int[] array1 = new int[3];
        int[] array2 = {1,2,3};
        int[] array3 = new int[] {1,2,6};
        System.arraycopy(array3,0,array1,0,array3.length);
        array2[2] = 5;
        System.out.println(array1[2]);
        System.out.println(array3.length);

        int[][] array4 = {{1,2}, {3,4}};
        System.out.println(array4[0][1]);
        for(int a : array1){
            System.out.println(a);
        }

        enum test{A, B, C};
        System.out.println(test.A);



    }
}
