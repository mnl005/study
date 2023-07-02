package java_code.other;

public class errs {
    public static void main(String[] args) {
        int a = 0;
        try {
            if (a == 0) {
                throw new ArithmeticException("haha");
            }
        } catch (Exception e) {
            System.out.println(0);
        } finally {
            System.out.println("end");
        }
    }
}
