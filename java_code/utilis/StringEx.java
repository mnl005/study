package java_code.utilis;

import java.util.StringTokenizer;

public class StringEx {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.charAt(1)); // 출력: e
        
        System.out.println(str.indexOf("lo")); // 출력: 3
        
        System.out.println(String.valueOf(123)); // 기본타입 값을 문자열로 변환
        
        System.out.println(str.length()); // 출력: 11
        
        System.out.println(str.isEmpty()); // 출력: false
        
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // 출력: true
        
        System.out.println(str.contains("World")); // 출력: true
        
        System.out.println(str.replace("e", "a")); // 출력: Hallo World
        
        System.out.println(str.substring(0, 2)); // 출력: He
        
        System.out.println(str.concat("!!!")); // 출력: Hello World!!!
        
        System.out.println("   Hello World   ".trim()); // 출력: Hello World
        
        System.out.println(str.toUpperCase()); // 출력: HELLO WORLD
        
        System.out.println(str.toLowerCase()); // 출력: hello world
        
        String[] splitted = str.split(" ");
        System.out.println(splitted[0]); // 출력: Hello
        System.out.println(splitted[1]); // 출력: World
        
        byte[] bb = {76, 45, 65, 34};
        String byteArrayString = new String(bb);
        System.out.println(byteArrayString); // 출력: L-A"
        
        byte[] stringBytes = str.getBytes();
        System.out.println(stringBytes[0]); // 출력: 72
        
        String tokens = "asdf/fff/ddd";
        StringTokenizer tokenizer = new StringTokenizer(tokens, "/");
        int tokenCount = tokenizer.countTokens();
        for (int i = 0; i < tokenCount; i++) {
            String text = tokenizer.nextToken();
            System.out.println(text); // 출력: asdf, fff, ddd
        }

        
    }
}