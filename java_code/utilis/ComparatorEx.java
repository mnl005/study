package utilis;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable 인터페이스는 자체 기본 정렬 기준을 가진다.
public class ComparatorEx implements Comparable<ComparatorEx> {
    private String name;
    private int age;

    public ComparatorEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(ComparatorEx o) {
        // 이름으로 오름차순 정렬
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        // 사용 예시
        List<ComparatorEx> people = new ArrayList<>();
        people.add(new ComparatorEx("Kim", 25));
        people.add(new ComparatorEx("Lee", 30));
        people.add(new ComparatorEx("Park", 20));
        people.add(new ComparatorEx("Ark", 99));
        people.add(new ComparatorEx("Arka", 9));
        people.add(new ComparatorEx("Krka", 9));
        Collections.sort(people);

        // 값 확인
        for (ComparatorEx p : people) {
            System.out.println(p.getName() + ", " + p.getAge());
        }
    }
}
