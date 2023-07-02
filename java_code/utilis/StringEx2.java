package java_code.utilis;

import java.util.regex.Pattern;

public class StringEx2 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abcde");
        // StringBuffer 인스턴스 생성

        str.append(" hi");
        // 버퍼 문자열 str에 문자열 추가
        System.out.println(str); // 출력: abcde hi

        str.insert(1, "nnn");
        // 해당 인덱스에 문자 추가
        System.out.println(str); // 출력: annnbcde hi

        str.replace(1, 4, "non");
        // 인덱스 1부터 4 전까지를 "non"으로 대체
        System.out.println(str); // 출력: anonde hi

        str.setCharAt(1, 'q');
        // 인덱스 1의 문자를 'q'로 대체
        System.out.println(str); // 출력: aqonde hi

        str.delete(1, 3);
        // 인덱스 1부터 3 전까지의 문자를 제거
        System.out.println(str); // 출력: aonde hi

        str.deleteCharAt(1);
        // 인덱스 1의 문자를 제거
        System.out.println(str); // 출력: aonde hi

        str.reverse();
        // 문자열을 역순으로
        System.out.println(str); // 출력: ihenoda

        int capacity = str.capacity();
        // 버퍼 크기 반환
        System.out.println(capacity);

        // 규식
        String regExp = "\\w+";
        String strr = "abddde";
        boolean aad = Pattern.matches(regExp, strr);
        System.out.println(aad);

    }
}
