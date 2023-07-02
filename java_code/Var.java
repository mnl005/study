package java_code;

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

        // 1. @@@@@@@@@@문자-> 숫자
        String strNum = "1";
        // string to int
        int intNum = Integer.parseInt(strNum);
        // string to double
        double doubleNum = Double.valueOf(strNum);
        // string to float
        float floatNum = Float.valueOf(strNum);
        // string to long
        long longNum = Long.parseLong(strNum);
        // string to short
        short shortNum = Short.parseShort(strNum);

        // 2.숫자 -> 문자
        int intNum1 = 10;
        String strNum1 = "";
        strNum1 = String.valueOf(intNum1);
        strNum = Integer.toString(intNum);

        // 3. 정수 <--> 실수
        // 실수의 소수점은 버려진다.
        double doubleNum2 = 1.12345;
        float floatNum2 = 1.123f;
        int intNum2;

        // double to int
        intNum = (int) doubleNum;

        // float to int
        intNum = (int) floatNum;

        // 4.데이터오버플로우 (DataOverFlow)
        int num = 290;
        byte byteNum = (byte) num; // 34

    }
}