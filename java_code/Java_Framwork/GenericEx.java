package Java_Framwork;
import java.util.*;

// 제네릭은 데이터 타입을 일반화한다 <타입명시>
// 제네릭 사용시 컬렉션,메서드, 클래스 등에서 사용하는 데이터 타입을 런타임시 결정가능
// 따라서 코드의 재사용성이 높아진다

// 제네릭 멀타 타입 파라미터
class generic_test1<K, V> {
    private K data1;
    private V data2;

    public void set1(K a) {
        this.data1 = a;
    }

    public void set2(V a) {
        this.data2 = a;
    }

    public K get1() {
        return this.data1;
    }

    public V get2() {
        return this.data2;
    }
}

class generic_test2 {
    public <T> boolean compare(T t1, T t2) {
        return t1.equals(t2);
    }
}

class generic_test3<T>{
    private T[] array;
    generic_test3(int size){
        array = (T[])new Object[size];
    }
    public void set(int index, T value){
        array[index] = value;
    }
    public T get(int index){
        return array[index];
    }
    public int size(){
        return array.length;
    }

}

// 제한된 파라미터(숫자만 받는게 가능해진다)
class generic_test4<T extends Number> {
    private T value;

    public generic_test4(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericEx {
    public static void main(String[] args) {

        // 타입을 명시하지 않을시 Object 타입으로 받으며 여러 타입이 존재가능해진다
        List list = new ArrayList();
        list.add("abc");
        list.add(123);
        System.out.println("list.get(0) : " + list.get(0));
        System.out.println("list.get(1) : " + list.get(1));

        // 타입을 명시할시 명시된 타입만을 받는다
        generic_test1<String, Integer> obj1 = new generic_test1<>();
        obj1.set1("text..");
        obj1.set2(1234);
        System.out.println(obj1.get1());
        System.out.println(obj1.get2());

        //응용
        generic_test2 obj2 = new generic_test2();
        System.out.println(obj2.compare(123, 12));
        System.out.println(obj2.compare("123", "123"));

        // obj3 내부의 객체의 메소드 활용시 형변환이 요구되며 권장되는 방식이 아니다
        generic_test3<Object> obj3 = new generic_test3<>(4);
        obj3.set(0,obj1);
        obj3.set(1,obj2);
        System.out.println(obj3.get(0));
        System.out.println(obj3.get(1));

        // 제한된 파라미터
        generic_test4<Integer>  intBox = new generic_test4<>(42);

        // 컴파일 오류
        // generic_test4<String> stringBox = new generic_test4<>("Hello");




    }
}
