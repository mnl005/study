package java_code.utilis;

import java.util.HashSet;
import java.util.Iterator;

// 기본타입 >> 래퍼클래스 ===== 박싱
// 기본타입 << 래퍼클래스 ===== 언박싱
// 래퍼 클래스의 주요 용도는 기본 타입의 값을 박싱해서 포장 객체로 만ema
// 문자열을 기본 타입으로 변환시에도 사용
// 래퍼 객체는 내부 값 비교 위해 == 연산자 사용 불가, 이유는 == 연산자는 주소를 비교
// 객체 끼리의 비교는 equals 메서드를 사용
// 기본타입 == 래퍼클래스는 자동 언박싱되어 값이 비교

public class HashSetEx {
    public static void main(String[] args) {

        // 중복값 무시
        HashSet<Integer> arr = new HashSet<Integer>();

        arr.add(1);
        // 추가
        arr.contains(2);
        // 들었는지 true or false
        arr.remove(2);
        // 해당값 삭제
        arr.size();
        // 크기
        arr.clear();
        // 초기

        // 반복
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i > 30)
                it.remove();
        }

        // 박싱: 기본 타입을 래퍼 클래스로 변환
        Integer num = new Integer(17);

        // 언박싱: 래퍼 클래스를 기본 타입으로 변환
        int n = num.intValue();

        // 문자열을 지정한 기본타입으로 변환
        int numberFromString = Integer.parseInt("23");

        // 자동 박싱과 언박싱을 사용하여 두 수를 더함
        Integer a = 1;
        int b = 1;
        System.out.println(a + b);

        // 언박싱: Integer 객체의 값을 int로 반환
        Integer x = 10;
        int y = x.intValue(); // 메서드 이름은 intValue()
        System.out.println(y);

    }
}
