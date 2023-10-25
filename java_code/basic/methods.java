package basic;

import java.util.Scanner;
class Test {
    static void display(int num1) {
        System.out.println(num1);
    }

    static void display(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void display(int num1, double num2) {
        System.out.println(num1 + num2);
    }
}

public class methods {
    // 블록범위
    static void m1() {
        System.out.println("m1");
    }

    static int m2(int a) {
        System.out.println(a);
        return a * 10;
    }

    static void m3(int a, String b) {
        System.out.println(a + " and " + b);
    }

    // 재귀호출
    static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return n + fun(n - 1);
    }

    public static void main(String[] args) {
        methods obj1 = new methods();
        obj1.m1();
        obj1.m2(3);
        obj1.m3(3, "a");

        // 메소드 오버로딩
        Test myfunc = new Test();
        myfunc.display(10);
        myfunc.display(10, 20);
        myfunc.display(10, 3.14);
        myfunc.display(10, 'a');

        //스캐너
        Scanner scan = new Scanner(System.in);
        System.out.println("입력");
        String text = scan.nextLine();
        System.out.println("text : " + text);

    }
}
