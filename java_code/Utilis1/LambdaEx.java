package java_code.Utilis1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class LambdaEx {
    public static void main(String[] args) {
        // 인터페이스에 람다식 사용 예시

        // in1 인터페이스
        in1 obj1 = () -> {
            System.out.println("in1...");
        };
        obj1.med();

        // Runnable 인터페이스
        Runnable ram1 = new Runnable() {
            public void run() {
                System.out.println("ram1...");
            }
        };
        ram1.run();

        // 람다식을 사용한 Runnable 인터페이스
        Runnable ram2 = () -> {
            System.out.println("ram2...");
        };
        ram2.run();

        // 클래스를 사용한 람다식
        in2 rrr = (int x) -> {
            return x + 1;
        };
        System.out.println(rrr.run(2));

        // Java 함수형 인터페이스

        // Consumer 인터페이스
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello, World!");

        // Supplier 인터페이스
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println(getRandomNumber.get());

        // Function 인터페이스
        Function<Integer, String> intToString = (num) -> String.valueOf(num);
        String str = intToString.apply(10);
        System.out.println(str);

        // UnaryOperator 인터페이스
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println(square.apply(5));

        // Predicate 인터페이스
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(5));

        // andThen()
        Function<Integer, Integer> f1 = x -> x + 1;
        Function<Integer, Integer> f2 = x -> x * 2;
        Function<Integer, Integer> f3 = x -> x + 3;
        int pipe1 = f1.andThen(f2).andThen(f3).apply(1);
        System.out.println(pipe1);

        // compose()
        Function<Integer, Integer> f4 = x -> x + 1;
        Function<Integer, Integer> f5 = x -> x * 2;
        Function<Integer, Integer> f6 = x -> x + 3;
        Function<Integer, Integer> f7 = f4.compose(f5).compose(f6);
        int pipe2 = f7.apply(1);
        System.out.println(pipe2);

        // Predicate 메소드
        Predicate<Integer> p1 = number -> number % 2 == 0;
        Predicate<Integer> p2 = number -> number < 0;
        Predicate<Integer> re1 = p1.or(p2);
        Predicate<Integer> re2 = p1.and(p2);
        Predicate<Integer> re3 = p1.negate();
        System.out.println(re1.test(4));
        System.out.println(re2.test(4));
        System.out.println(re3.test(0));

        Predicate<String> p3 = Predicate.isEqual("abc");
        System.out.println(p3.test("abc"));

        // BinaryOperator 인터페이스
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        // Stream 예시
        List<String> strings = Arrays.asList("this", "s", "a", "lqwerist", "of", "strings");
        String val2 = strings.stream()
            .max(Comparator.comparing(String::length))
            .orElse("");
        System.out.println(val2);
    }

    @FunctionalInterface
    interface in1 {
        public void med();
    }

    interface in2 {
        public int run(int x);
    }
}

