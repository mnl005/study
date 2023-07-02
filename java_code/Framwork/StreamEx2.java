package java_code.Framwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {

        System.out.println("필터링 메소드___________________");
        List<Integer> list3 = Arrays.asList(1, 2, 4, 5, 7, 8, 34, 34, 6, 32345, 5532, 43, 21, 42);
        list3.stream()
                .distinct()
                .filter(a -> a > 10)
                .forEach(System.out::println);

        System.out.println("매핑 메소드___________________");
        List<List<Integer>> list4 = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9, 10));
        list4.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6));
        List<Integer> flatList2 = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList2);

        System.out.println("박싱언박싱 메소드___________________");
        List<Integer> list6 = Arrays.asList(1, 2, 4, 5, 7, 8, 34, 34, 6, 32345, 5532, 43, 21, 42);
        list6.stream()
                .mapToInt(Integer::intValue)
                .boxed()
                .mapToDouble(Integer::intValue)
                .boxed()
                .mapToLong(Double::longValue)
                .asDoubleStream()
                .forEach(System.out::println);

        System.out.println("정렬 메소드___________________");
        List<Integer> list7 = Arrays.asList(1, 2, 4, 5, 7, 8, 34, 34, 6, 32345, 5532, 43, 21, 42);
        list7.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("루핑 메소드___________________");
        list7.stream()
                .mapToInt(Integer::intValue)
                .filter(a -> a % 2 == 0)
                .peek(a -> System.out.println("처리결과1 : " + a))
                .map(a -> a - 10)
                .peek(a -> System.out.println("처리결과2 : " + a))
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println, () -> System.out.println("값이 존재하지 않습니다."));

        System.out.println("매치 메소드___________________");
        List<Integer> list8 = Arrays.asList(1, 2, 4, 5, 7, 8, 34, 34, 6, 32345, 5532, 43, 21, 42);

        boolean val1 = list8.stream()
                .filter(a -> a % 2 == 0)
                .allMatch(a -> a % 2 == 0);
        System.out.println(val1);

        boolean val2 = list8.stream()
                .filter(a -> a % 2 == 0)
                .anyMatch(a -> a % 2 == 0);
        System.out.println(val2);

        boolean val3 = list8.stream()
                .filter(a -> a % 2 == 0)
                .noneMatch(a -> a % 2 == 0);
        System.out.println(val3);

        System.out.println("집계 메소드___________________");
        list8.stream()
                .min(Integer::compare)
                .ifPresent(System.out::println);

        System.out.println("옵션 메소드___________________");
        list8.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        list8.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        list8.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(System.out::println, () -> System.out.println("값이 존재하지 않습니다."));

        System.out.println("reduce 메소드___________________");
        int sum = list8.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("collect 메소드___________________");
        List<Integer> collectedList = list8.stream()
                .sorted()
                .collect(Collectors.toList());
        collectedList.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Integer> collectedNumbers = numbers.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> scores = Arrays.asList(85, 90, 70);

        Map<String, Integer> map = IntStream.range(0, names.size())
                .boxed()
                .collect(Collectors.toMap(names::get, scores::get));
        System.out.println(map);

        // ....
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "durian", "cherry",
                "elderberry");
        fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .distinct()
                .sorted()
                .peek(System.out::println)
                .map(fruit -> fruit.toUpperCase())
                .flatMap(fruit -> Arrays.stream(fruit.split("")))
                .skip(2)
                .limit(4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 데이터 소스 →
        // 중간 연산 →
        // filter(Predicate<T> p) →
        // map(Function<T, R> f) →
        // flatMap(Function<T, Stream<R>> f) →
        // distinct() →
        // sorted() →
        // peek(Consumer<T> action) →
        // limit(long maxSize) →
        // skip(long n) →
        // 최종 연산 →
        // count() →
        // anyMatch(Predicate<T> p) →
        // allMatch(Predicate<T> p) →
        // noneMatch(Predicate<T> p) →
        // findAny() →
        // findFirst() →
        // forEach(Consumer<T> action) →
        // reduce(T identity, BinaryOperator<T> accumulator) →
        // collect(Collector<T, A, R> collector) →
        // max(Comparator<T> comparator) →
        // min(Comparator<T> comparator) →
        // toArray() →
        // iterator() →
        // sequential() →
        // parallel() →
        // isParallel() →
        // findAny() →
        // findFirst() →
        // forEach(Consumer<T> action) →
        // reduce(T identity, BinaryOperator<T> accumulator) →
        // collect(Collector<T, A, R> collector) →
        // max(Comparator<T> comparator) →
        // min(Comparator<T> comparator) →
        // toArray() →
        // iterator() →
        // sequential() →
        // parallel() →
        // isParallel() →
        // toArray(IntFunction<A[]> generator) →

    }
}
