package java_code.Framwork;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class c1 {
    private String str1;
    private String str2;
    private String str3;

    public c1(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public String get1() {
        return str1;
    }

    public String get2() {
        return str2;
    }

    public String get3() {
        return str3;
    }
}

public class StreamEX1 {

    public String str = "this is a str...";

    public static void main(String[] args) throws Exception {

        System.out.println("1. 컬렉션으로 스트림 얻기__________________________________");
        // list에서 얻기
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.forEach(a -> System.out.println(a));

        // ArrayList에서 얻기(객체가 저장된 ArrayList를 반복한다)
        ArrayList<c1> cadd = new ArrayList<>();
        cadd.add(new c1("adsf", "fdas", "fafa"));
        cadd.add(new c1("eeee", "jjjjj", "kkkk"));
        Stream<c1> treem = cadd.stream();
        treem.forEach(a -> {
            System.out.println(a.get1());
            System.out.println(a.get2());
            System.out.println(a.get3());
            System.out.println("______________");
        });

        System.out.println("2. 배열로 스트림 얻기__________________________________");
        int[] array = { 1, 2, 3, 4, 5 };
        IntStream st2 = Arrays.stream(array);
        st2.forEach(a -> System.out.println(a));

        System.out.println("3. 숫자 범위로 스트림 얻기__________________________________");
        IntStream st3 = IntStream.rangeClosed(0, 5);
        st3.forEach(a -> System.out.println(a));

        LongStream stlong = LongStream.rangeClosed(6, 10);
        stlong.forEach(a -> System.out.println(a));

        DoubleStream stran = new Random().doubles();
        stran.limit(5).forEach(System.out::println);

        // System.out.println("4. 파일로 스트림 얻기__________________________________");
        // // 파일경로 문자열로 확인
        // Path path = Paths.get("stream/st.txt");
        // Path path = Paths.get("src/st.txt");
        // Stream<String> st4 = Files.lines(path);
        // System.out.println("문자열 표현된 파일경로 : " + st4);

        // // 불러온 파일을 읽어보기
        // File file = path.toFile();
        // FileReader filereader = new FileReader(file);
        // BufferedReader br = new BufferedReader(filereader);
        // Stream<String> st5 = br.lines();
        // st5.forEach(a -> System.out.println(a));

        // // 디렉터리 리스트 불러오기
        // Path dir = Paths.get("c:/study");
        // Stream<Path> st6 = Files.list(dir);
        // st6.forEach(System.out::println);
    }
}
