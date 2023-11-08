package Framwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SysEx {
    public static void main(String[] args) {

        // 동기화 처리....
        List<String> list1 = Collections.synchronizedList(new ArrayList<String>());
        Set<String> list2 = Collections.synchronizedSet(new HashSet<String>());
        Map<String, String> list3 = Collections.synchronizedMap(new HashMap<String, String>());

        // 병렬 처리....
        Map<String, String> mm = new ConcurrentHashMap<String, String>();
        Queue<String> qu = new ConcurrentLinkedQueue<String>();
    }
}
