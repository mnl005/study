package java_code.Utilis1;

import java.util.ArrayList;
import java.util.List;

class c1<T> {
    private T data;

    public void set(T a) {
        this.data = a;
    }

    public T get() {
        return data;
    }
}

class c2<K, V> {
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

class c3 {
    public <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }
}

public class GenericEx {
    public static void main(String[] args) {
        c1<String> obj1 = new c1<String>();
        obj1.set("this string text");
        System.out.println(obj1.get());

        c2<String, Integer> obj2 = new c2<String, Integer>();
        obj2.set1("text..");
        obj2.set2(1234);
        System.out.println(obj2.get1());
        System.out.println(obj2.get2());

        List<String> arr = new ArrayList<String>();
        arr.add("adf");
        arr.add("adff");
        arr.add("adffafe");
        System.out.println(arr);

        c3 obj = new c3();
        System.out.println(obj.compare(123, 12));
    }
}
