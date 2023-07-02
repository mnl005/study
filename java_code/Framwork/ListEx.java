package java_code.Framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

// List 인터페이스:
// ArrayList 클래스: 가변 크기의 배열 구현체
// LinkedList 클래스: 이중 연결 리스트 구현체
// Vector 클래스: 스레드 세이프한 동기화된 ArrayList
// Stack 클래스: Vector를 상속받은 스택 자료구조 클래스

// Set 인터페이스:
// HashSet 클래스: 해시 테이블 구현체
// TreeSet 클래스: 이진 검색 트리 구현체
// LinkedHashSet 클래스: 해시 테이블 + 연결 리스트 구현체

// Queue 인터페이스:
// LinkedList 클래스: 큐와 덱 구현체

// Map 인터페이스:
// HashMap 클래스: 해시 테이블 구현체
// TreeMap 클래스: 이진 검색 트리 구현체
// LinkedHashMap 클래스: 해시 테이블 + 연결 리스트 구현체

// Collections 클래스: 유틸리티 클래스로서 다양한 정적 메소드를 제공하는 클래스

public class ListEx {
    public static void mian(String[] args) throws IOException {

        // List 컬렉션은 인터페이스이다
        // ArrayList 배열 크기가 변하며 인덱스로 접근한다
        List<String> list = new ArrayList<>();

        // 위의 경우는 인터페이스 변수로 객체를 참조하는 경우로
        // list = new Vector(); <-- 이것이 가능하다 하지만
        // 밑의 경우처럼 클래스 변수를 객체로 참조하는 경우
        // ArrayList<String> not = new ArrayList<String>();
        // not = new Vector(); <-- 이것이 불가능하다

        list.add("a1");
        list.add(1, "a2");
        list.set(0, "aa");

        list.get(1);
        list.size();
        list.contains("str");
        list.isEmpty();

        list.remove(1);
        list.clear();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String a : list) {
            System.out.println(a);
        }

        // asList는 크기가 정해진 리스트
        List<String> asList = Arrays.asList("a", "b", "c");
        System.out.println(asList);

        // Vector는 ArrayList와 동일한 내부 구조이지만, 스레드 세이프하다고 한다
        List<String> vector = new Vector<>();

        // LinkedList 사용방법은 ArrayList와 동일
        // 내부구조는 인접 참조를 링크해서 체인처럼 관리한다
        // 삽입, 삭제가 빈번하고 순차접근이 드문 경우에 적합하다
        List<String> link = new LinkedList<>();
        link.add("maybe sa..");

        System.out.println("_______________________________________________________________________");
        // Set 컬렉션은 인터페이스이며, 순서 보장이 안됨, 중복 저장불가
        Set<String> set = new HashSet<>();
        set.add("a1");
        set.add("a2");

        set.size();
        set.contains("str");
        set.isEmpty();

        set.remove(1);
        set.clear();

        Set<String> set1 = new HashSet<String>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("_______________________________________________________________________");
        // Map 컬렉션은 인터페이스이며 키와 값으로 구성되며 키는 중복불가, 값은 중복 가능
        // HashMap은 Map 구현 컬렉션
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", null);

        map.size();
        map.get("key1");
        boolean m1 = map.containsKey("key3");
        boolean m2 = map.containsValue(null);

        Set<String> keySet = map.keySet();
        Collection<Integer> valueSet = map.values();
        System.out.println(keySet);
        System.out.println(valueSet);

        // Hashtable은 HashMap와 동일한 내부 구조를 가지며 동기화된 메소드를 가져 스레드가 안전하다
        Map<String, String> hmap = new Hashtable<String, String>();

        hmap.put("id", "mnl005");
        hmap.put("pwd", "mnl125454");
        hmap.put("email", "mnl005@naver.com");

        // Properties는 Hashtable의 특징을 거의 그대로 가지며 차이점은 키와 값이 String 타입으로 제한된 점이다
        // 다국어 정보를 읽을 때 사용된다
        Properties prop = new Properties();
        FileInputStream in = new FileInputStream("framework/config.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("key1"));
        in.close();

        FileOutputStream out = new FileOutputStream("framework/config.properties");
        prop.setProperty("key1", "111111");
        prop.setProperty("key2", "222222");
        prop.setProperty("key3", "333333");
        prop.store(out, "Added key1");
        System.out.println(prop.getProperty("key2"));
        out.close();

        System.out.println("_______________________________________________________________________");
        // TreeSet은 이진트리 기반 Set 컬렉션으로 부모값과 비교해 낮은 값은 왼쪽, 높은 값은 오른쪽에 저장된다
        // 무조건 오름차순으로 정렬된다
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(99999);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);

        tree.first();
        tree.last();
        tree.lower(10); // 보다 작은 값 추출
        tree.higher(11); // 보다 큰 값 추출
        tree.floor(10); // 와 동등한 값 추출
        tree.ceiling(10); // 와 동등한 값 추출 없으면 바로 위 값 추출
        tree.pollFirst(); // 첫 값 꺼내어 제거
        tree.pollLast(); // 마지막 값 꺼내 제거

        System.out.println(tree);

        Iterator<Integer> iter1 = tree.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        // 내림차순으로 만든다
        NavigableSet<Integer> na1 = tree.descendingSet();
        System.out.println(na1);

        // TreeMap은 키값을 정렬한다
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
        tmap.put(1, 10);
        tmap.put(4, 20);
        tmap.put(99, 30);
        tmap.put(12, 40);
        System.out.println(tmap);

        // 선입후출
        Stack<String> stack = new Stack<String>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        stack.push("ddd");
        stack.push("eee");
        System.out.println(stack.peek()); // 값만 보여주기

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // 값 꺼내기
        }

        // 인터페이스이다
        // 선입선출
        Queue<String> queue = new LinkedList<>();
        queue.offer("aaaa");
        queue.offer("bbbb");
        queue.offer("cccc");
        queue.offer("dddd");
        queue.offer("eeee");
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}