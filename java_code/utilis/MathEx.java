package java_code.utilis;

import java.util.Random;

public class MathEx {

    public static void main(String[] args) {

        System.out.println(Math.E);
        // 자연로그의 밑값 출력

        System.out.println(Math.PI);
        // 원주율 값 출력

        Random ran = new Random();
        System.out.println(ran.nextInt(100));
        // 랜덤값(0~99) 출력

        System.out.println((int) (Math.random() * 100));
        // 랜덤값(0~99) 출력

        System.out.println(Math.abs(-32.1));
        // 절댓값 출력

        System.out.println(Math.ceil(3.5));
        // 무조건 올림

        System.out.println(Math.floor(3.5));
        // 무조건 내림

        System.out.println(Math.round(3.5));
        // 반올림

        System.out.println(Math.rint(5.4));
        // 가까운 값으로(double)

        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(1, 2));
        // 두 수의 크기비교

        System.out.println((int) Math.pow(3, 2));
        // 3의 2제곱

        System.out.println((double) Math.sqrt(7));
        // 제곱근

        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.cos(Math.PI / 6));
        System.out.println(Math.tan(Math.PI / 6));
        // 사인 코사인 탄젠트

        System.out.println(Math.toDegrees(1));
        // 호도법의 라디안값을 대략적인 육십분법의 각도 값으로 변환

        System.out.println(Math.toRadians(1));
        // 육십분법의 각도값을 대략적인 호도법의 라디안 값으로 변환
    }
}
