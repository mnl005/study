package basic;

// 변수 : 데이터 저장할 메모리 공간의 이름
// 자료형 : 변수의 크기와 어떤 종류의 데이터를 저장할지 결정
// 변수의 종류 : 멤버 변수(인스턴스 변수), 클래스변수(스태틱 변수), 지역 변수, 매개변수
// 심볼 테이블 : 변수가 만들어 지면 변수를 관리 하는 테이블 에 변수 정보가 저장 된다

// 할당 변수에 데이터를 저장하는것
// 변수의 이름은 숫자로 시작 불가
// 대소문자 구분, 숫자로 시작 불가
// $ 과 _ 이외의 특수문자 사용불가
// 키워드(예약어)는 변수 이름으로 사용 불가
// 클래스는 사용자가 정의한 자료형이라 할 수 있다
// 자동형변환(묵시적) : 작은 타입이 큰 타입에 저장되는 경우(byte -> int)
// 강제형변환(명시적) : 큰 타입이 작은 타입에 저장되는 경우(int -> byte)



public class Var {
    public static void main(String[] args) {

        // 기본 자료형
        byte num1 = 100;
        short num2 = 32000;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        float num5 = 32.2332f;
        double num6 = 23.2323d;
        boolean num7 = true;
        char chr = 'a';

        // 문자열은 객체 자료형
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
