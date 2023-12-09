package utilis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEX {
    private String name;
    private int age;

    public ComparableEX(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Comparator 인터페이스는 Comparable 인터페이스와 달리 객체의 기본 정렬 순서가 아닌 다른 기준으로 객체를 정렬하기 위해 사용된다.
    // 정렬 기준은 일반적인 동작과 관계없는 외부 조건일 수도 있다.
    public static class AgeComparator implements Comparator<ComparableEX> {
        @Override
        public int compare(ComparableEX o1, ComparableEX o2) {
            // 나이로 내림차순 정렬
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }

    public static void main(String[] args) {
        // 사용 예시
        List<ComparableEX> people = new ArrayList<>();
        people.add(new ComparableEX("Kim", 25));
        people.add(new ComparableEX("Lee", 30));
        people.add(new ComparableEX("Park", 20));
        Collections.sort(people, new AgeComparator());

        // 값 확인
        for (ComparableEX p : people) {
            System.out.println(p.getName() + ", " + p.getAge());
        }
    }
}
