package Java_Framwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// 스트림은 배열의 원소들을 스트림 형태로 변환해 처리할 수 있게 하는것이다
// 스트림은 원본 데이터를 변경하지 않고 필요한 데이터 처리 작업을 적용한 결과를 생성한다
// 따라서 인덱스 통한 접근은 불가
// 데이터 처리 작업을 연속적인 파이프라인으로 나타낼 수 있어 가독성 높고 병렬처리 구현 돕는다
// 필터링, 매핑, 정렬 등의 처리후 최종결과를 배열이나 컬렉션으로 변환 가능

class c1 {
    private String str1;
    private String str2;
    private String str3;

    public c1(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }
    public void view(){
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
    }
}

public class StreamEX1 {

    public static void main(String[] args) throws Exception {

        System.out.println("1. 컬렉션으로 스트림 얻기__________________________________");
        // list에서 얻기
        List<String> list = Arrays.asList("b", "c", "a");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // 객체에서 얻기
        ArrayList<c1> cadd = new ArrayList<>();
        cadd.add(new c1("adsf", "fdas", "fafa"));
        cadd.add(new c1("eeee", "jjjjj", "kkkk"));
        Stream<c1> treem = cadd.stream();
        treem.forEach(c1::view);

        System.out.println("2. 배열로 스트림 얻기__________________________________");
        int[] array = { 1, 2, 3, 4, 5 };
        IntStream st2 = Arrays.stream(array);
        st2.forEach(System.out::println);

        System.out.println("3. 숫자 범위로 스트림 얻기__________________________________");
        IntStream st3 = IntStream.rangeClosed(0, 5);
        st3.forEach(System.out::println);

        LongStream stlong = LongStream.rangeClosed(6, 10);
        stlong.forEach(System.out::println);

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
