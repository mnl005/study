package java_code.other;

public class Logic {
    public static void main(String[] args) {
        //단항연산자
        System.out.println(3 + 1);
        System.out.println(3 - 1);
        System.out.println(3 * 1);
        System.out.println(3 % 1);

        //증감연산자
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);

        //논리부정
        System.out.println(!true);

        //비트반전
        int a = 1;
        System.out.println(~a);

        //정확히 계산시 부동소수점 사용하는게 아닌 정수를 사용
        //NaN은 숫자아님(!= 연산자 제외한 모든 비교 연산자에서 false)
        //Infinity는 무한
        //문자열 연결 연산자에서 숫자사용시 사용순서가 값에관여

        //비교연산자
        System.out.println(1 > 2);
        System.out.println(1 == 1.0);
        System.out.println(1 != 1.0);
        System.out.println(1 >= 1.0);

        //논리 연산자
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true ^ false);
        System.out.println(!false);

        //대입 연산자
        int b = 0;
        System.out.println(b += 1);

        //삼항 연산자]
        boolean bool = (0 > 1) ? true : false;
        System.out.println(bool);

    }
}
