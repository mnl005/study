package java_code.utilis;

import java.util.*;
import java.lang.*;

//얕은 복제는 원본에 영향주나 깊은 복제는 원본에 영향안준다

//복제 가능한 클래스라고 명시적 선언
class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class counter {
    private int no;

    public counter(int no) {
        this.no = no;
    }

    protected void finalize() throws Throwable {
        System.out.println(no);
    }
}

public class ObjectEx {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 객체의 정보를 문자열 형태로 출력
        System.out.println(obj1.toString());

        // 두 인스턴스의 논리적 비교를 수행
        System.out.println(obj1.equals(obj));

        // 두 객체를 깊은 비교하여 null도 비교
        System.out.println(Objects.deepEquals(obj1, obj2));

        // 객체의 해시코드를 반환
        System.out.println(obj1.hashCode());

        // 객체가 null인지 판별
        System.out.println(Objects.isNull(obj));

        // 객체가 null이면 예외를 발생시키고, 아니면 객체를 반환
        System.out.println("requireNonNull? : " + Objects.requireNonNull(obj));

        // obj 객체의 문자 정보를 출력 (toString 메소드를 사용)
        System.out.println(Objects.toString(obj));

        int a = 5;
        int b = 3;
        System.out.println(Integer.compare(a, b));

        // .clone의 얕은 복사와 깊은 복사 (프로토타입으로부터 같은 속성값을 가진 복사본 생성)
        // 객체지향 프로그래밍의 정보은닉에 위배될 가능성이 있음으로 복제할 객체는 Cloneable 인터페이스 명시해야 한다
        try {
            Person original = new Person("John", 30);
            Person clone = (Person) original.clone();

            System.out.println(original.name);
            System.out.println(clone.name);

            clone.name = "Doe";

            System.out.println(original.name);
            System.out.println(clone.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 쓰레기 수집기
        counter c = null;
        for (int i = 1; i <= 50; i++) {
            c = new counter(i);
            c = null;
            System.gc();
        }
        // 시스템 종료
        System.exit(a);

        // 쓰래기수집기
        System.gc();

        // 시간
        long time1 = System.currentTimeMillis();
        long time2 = System.nanoTime();

        String os = System.getProperty("os.name");
        String name = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String dir = System.getProperty("user.dir");

        String version = System.getProperty("java.version");
        String jhome = System.getProperty("java.home");
        String file = System.getProperty("file.separator");
        String env = System.getenv("JAVA_HOME");

    }
}
