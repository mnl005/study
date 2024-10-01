package basic;

// 컬렉션 프레임워크 : 자료구조를 사용해서 객체들의 효율적 관리를 위한 인터페이스와 구현클래스
// List : 객체를 인덱스로 관리, 저장용량 자동증가, 객체의 직접저장이 아닌 객체의 번지를 참조
// Vector : 동기화된 메소드로 구성되어 있어 멀티스레드의 동시참조를 막는다
// ArrayList : 내부 배열에 객체를 저장해서 관리, 순차적 삭제시 LinkedList보다 성능 좋다
// LinkedList : 인접 참조를 링크해서 체인처럼 관리, 특정 인덱스의 객체 제거시 제거된 객체의 앞뒤 객체끼리 연결되는 구조로 데이터 삽입과 삭제시 성능좋다

// Set : 순서 유지 불가, 객체 중복 저장 불가
// HashSet : hashCode()의 리턴값이 다르거나, hashCode()의 리턴값이 같으나 equals()의 리턴값이 다른경우 저장

// Map : 키와 값으로 구성, 키는중복불가, 값은 중복가능
// HashMap : hashCode()의 리턴값이 다르거나, hashCode의 리턴값이 같으나 equals()의 리턴값이 다른경우 다른 키로 저장
// Hashtable : 동기화된 메소드로 구성되어 멀티스레드의 동시참조를 막는다

// Stack : 후입선출
// Queue : 선입선출

import java.util.*;

public class java4 {
    public static void main(String[] args){

        // string
        String str = "  abc efg ";
        String strr = "abc cba";
        String num = "1234";
        System.out.println(str.charAt(0));
        System.out.println(str.equals(strr));
        System.out.println(str.indexOf("b"));
        System.out.println(str.length());
        System.out.println(str.replace("abc","qqq"));
        System.out.println(str.substring(0,3));
        System.out.println(str.toUpperCase());
        System.out.println(String.valueOf(23));

        // math
        Math.abs(-3);
        Math.ceil(5.3);
        Math.floor(5.3);
        Math.max(3,4);
        Math.random();
        Math.round(3.3);

        // List
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add(2,"c2");
        list.get(1);
        list.size();
        list.remove(0);
        list.remove("a");
        System.out.println(list);
        for(String stre : list){
            System.out.println(stre);
        }

        // Set
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.size();
        set.remove("b");
        for (String string : set) {
            System.out.println(string);
        }

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.remove(4);
        map.size();
        Set<Integer> map_keyset = map.keySet();
        for(Integer n : map_keyset){
            System.out.println(map.get(n));
        }
        map.clear();

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int c = stack.size();
        for(int i = 0; i < c; i++){
            System.out.println(stack.pop());
        }

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        for(int i = 0; i< c; i++){
            System.out.println(queue.poll());
        }



    }
}
