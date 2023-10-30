package basic;

public class conditional {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        if (num1 < 3) {
            System.out.println("small " + num1);
        } else if (num1 < 6) {
            System.out.println("mall " + num1);
        } else {
            System.out.println("nope.." + num1);
        }

        switch (num2) {
            case 1:
                System.out.println("1 : " + num2);
                break;

            case 2:
                System.out.println("2 : " + num2);
                break;

            case 3:
                System.out.println("3 : " + num2);
                break;

            default:
                System.out.println("default~~");
                break;
        }


        while (num3 < 5) {
            System.out.println(num3);
            num3++;
        }

        do {
            System.out.println(num3);
            num3--;
        } while (num3 > 0);

        int a = 10;
        while (true) {
            a--;

            if (a < 0) {
                System.out.println("정지!");
                break;
            }

            if (a < 5) {
                System.out.println("다음으로 넘어감...");
                continue;
            }

            System.out.println("출력... " + a);
        }

    }

}
