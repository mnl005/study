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
        //NaN은 숫자아님
        //Infinity는 무한
    }
}
