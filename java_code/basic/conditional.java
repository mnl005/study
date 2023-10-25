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
                System.out.println("1 " + num2);
                break;

            case 2:
                System.out.println("2 " + num2);
                break;

            case 3:
                System.out.println("3 " + num2);
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

        for (int a = 0; a < 10; a++) {
            if (a < 5) {
                continue;
            }
            System.out.println(a);
            if (a < -1) {
                break;
            }
        }

    }

}
