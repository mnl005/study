package java_code.utilis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class CalendatEx {

    public static void main(String[] args) {

        Calendar time = Calendar.getInstance();
        // 객체 선언 후 사용(현재 시간 기준으로 동작)

        System.out.println(time.getTime());
        // 현재시간 출력

        time.add(Calendar.SECOND, 120);
        // 현재 시간에 120초 추가
        System.out.println(time.getTime());

        time.set(2000, 3, 3); // 년도, 월(0부터 시작), 일
        System.out.println(time.getTime());

        time.set(Calendar.YEAR, 2020);
        // 년도를 2020으로 설정
        System.out.println(time.getTime());

        Calendar anotherTime = Calendar.getInstance();
        // 다른 시간 객체 생성

        System.out.println(time.after(anotherTime));
        System.out.println(time.before(anotherTime));
        // 현재 시간이 anotherTime보다 이후인지 이전인지 판단

        System.out.println(time.get(Calendar.DAY_OF_WEEK));
        System.out.println(time.get(Calendar.MONTH) + 1);
        System.out.println(time.get(Calendar.HOUR_OF_DAY));
        System.out.println(time.get(Calendar.MINUTE));
        System.out.println(time.get(Calendar.SECOND));
        System.out.println(time.get(Calendar.YEAR));

        LocalDate a = LocalDate.now();
        System.out.println(a); // 현재 날짜 출력

        LocalTime b = LocalTime.now();
        System.out.println(b); // 현재 시간 출력

        LocalDateTime c = LocalDateTime.now();
        System.out.println(c); // 현재 날짜와 시간 출력

    }
}
