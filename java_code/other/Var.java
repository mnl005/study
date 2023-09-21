package java_code.other;

public class Var {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = 32000;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        float num5 = 32.2332f;
        double num6 = 23.2323d;
        boolean num7 = true;
        char chr = 'a';
        String chrr = "asdf\nast\tdddfs";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(chr);
        System.out.println(chrr);

        // 1. 문자 -> 숫자
        String strNum = "1";
        int intNum = Integer.parseInt(strNum);
        double doubleNum = Double.parseDouble(strNum);
        float floatNum = Float.parseFloat(strNum);
        long longNum = Long.parseLong(strNum);
        short shortNum = Short.parseShort(strNum);

        // 2. 숫자 -> 문자
        int intNum1 = 10;
        String strNum1 = String.valueOf(intNum1);
        String strNum2 = Integer.toString(intNum);

        // 3. 정수 <--> 실수
        double doubleNum2 = 1.12345;
        float floatNum2 = 1.123f;
        int intNum2;

        intNum2 = (int) doubleNum2; // 실수를 정수로 변환
        intNum2 = (int) floatNum2; // 실수를 정수로 변환

        // 4. 데이터 오버플로우 (Data Overflow)
        int num = 290;
        byte byteNum = (byte) num; // byte로 형변환 (오버플로우 발생, 반대의 경우는 자동형변환, 강제타입변환시 데이터 손실)

        float n1 = Math.max(1, 3); // 최댓값 계산
        float n2 = Math.min(1, 4); // 최솟값 계산
        double n3 = Math.sqrt(36); // 제곱근 계산
        float n4 = Math.abs(-19); // 절댓값 계산
        double n5 = Math.random(); // 0 이상 1 미만의 난수 생성
        double ran1 = Math.floor(n5 * 10); // 0 이상 10 미만의 정수 난수 생성
    }
}
