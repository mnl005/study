package APIs;
// json, xms 둘다 구조화된 데이터 표현과 전송 위한 데이터 형식이다
// JSON은 경량의 데이터 교환 형식으로 텍스트 기반으로 구조화
// JSON은 객체와 배열로 구성
// JSON의 데이터 타입은 String, Number, Boolean, Object, Array, Null
// XML은 요소, 속성, 텍스트, 주석으로 이루어진 트리구조로 주성

import com.google.gson.*;

import java.util.*;

public class Json {
    public static  void main(String[] args){
        Gson gson = new Gson();


        //자바 객체를 제이슨으로
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();

        map2.put("k1","v1");
        map2.put("k2","v2");

        map1.put("key1","1111");
        map1.put("key2",new int[]{1,2,3});
        map1.put("key3",map2);

        String str = gson.toJson(map1);
        System.out.println(gson.toJson(map1));


        //제이슨을 자바 객체로
        Map<String, Object> map3= gson.fromJson(str,HashMap.class);
        System.out.println(map3);








    }
}
