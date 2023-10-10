package other;

class Custom extends Exception {
    Custom(String message) {
        super(message);
    }
}


public class errs {

    //throws 키워드
    static void check1(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("0으로 나눌 수 없다");
        }
        int result = x / y;
    }

    //throws 키워드
    static void check2(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수를 허하지 않노라.");
        }
    }


    public static void main(String[] args) {

        //try-catch 문
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.err.println("오류 메시지 : " + e.getMessage());
        } finally {
            System.out.println("종료");
        }

        //throws 키워드
        check1(1,0);
        check2(-3);

        //다중 예외 처리
        try {
            int a = 0;
        } catch (ArithmeticException | ExceptionInInitializerError e) {

            e.printStackTrace();
        }



    }
}
