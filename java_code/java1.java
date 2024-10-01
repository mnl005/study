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
        String string3 = (int3 == 2)? "a" : "b";
        System.out.println(string3);



    }
}
