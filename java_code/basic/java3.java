package basic;// java.lang....
// Object : 자바 클래스의 최상위 클래스
// System : 표준 입력.출력 장치 사용시, 자바 가상 기계 종료시, 쓰레기 수집기 요청시
// Class : 클래스와 인터페이스의 메타 데이터를 Class 클래스로 관리(이름,생성자정보,필드정보,메소드정보)
// String : 문자열 저장시, 정보 얻을때
// Wrapper(Byte,Short,Character,Integer,Float,Double,Boolean,Long)
// : 기본타입의 데이터 갖는 객체 생성시,문자열기본타입으로 변환시,입력값검사시
// Math : 수학 함수 이용시

// obj.hashCode() : 객체 식별하는 정수값, 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴

// 박싱 : 기본타입의 값을 포장 객체로 만드는 과정
// 언박싱 : 포장 객체에서 기본타입의 값을 얻어내는 과정

// 프로세스 : 운영체제의 실행중인 하나의 애플리케이션
// 스레드 : 각 프로세스 별로 존재하는 하나의 작업 흐름
// 프로세스는 할당받은 메모리 영역 내에서 실행
// 멀티 스레드는 하나의 프로세스 내부에서 실행되기 때문에 다른 스레드에 영향을 준다

// Runnable : 작업 스레드가 실행할 수 있는 코드를 가지고 있는 객체
// synchronized(동기화 메소드) : 하나의 스레드만 실행 가능한 코드영역인 임계영역을 지정해준다
// Thread.interrupt() : 일시정지 상태의 스레드에 interruptedException 발생
// Thread.sleep(long num) : 주어진 시간 동안 스레드 일시정지
// Thread.stop() : 불완전한 종료
// 데몬 스레드 : 주 스레드 돕는 역할, 주 스레드 종료시 강제 종료, 주 스레드의 start()메소드 호출전 setDaemon(true)


import java.text.SimpleDateFormat;
import java.util.Date;
import basic.*;


public class java3 {

    static class ppp{
        int save = 0;

        // synchronized 미사용시 숫자가 순서대로 표시되지 않는다
        public synchronized void plus(){
            save++;
            System.out.println(save);
        }
    }


    static class Task implements Runnable{
         String name;

        Task(String name){
            this.name = name;
        }

        public void run(){
            for(int i = 0; i < 1000; i++){
                System.out.println(name + " : " + System.nanoTime());
            }
        }
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Object ob1 = new Object();
        Object ob2 = new Date();
        System.out.println(ob1 + " , " + ob2);

        long time1 = System.nanoTime();
        for(int a = 0; a < 100; a++){
            if(a % 3 == 0){
                a++;
            }
        }
        long time2 = System.nanoTime();
        System.out.println(time1 + " ~~~ " + time2);

        Class ob3 = java2.class;
        Class ob5 = Class.forName("basic.java2");
        Class ob4 = ob3.getClass();
        System.out.println(ob3.getName());
        System.out.println(ob3.getSimpleName());
        System.out.println(ob3.getPackage().getName());

        Integer obj = 100;
        int value1 = obj;

        Date date = new Date();
        SimpleDateFormat sss = new SimpleDateFormat("yyyy - MM - dd - hh - mm - ss");
        System.out.println(sss.format(date));
//
//        Thread thread1 = new Thread(new Task("test1"));
//        thread1.start();
//
//        Thread thread2 = new Thread(new Task("test2"));
//        thread2.start();

        ppp ppp1 = new ppp();

        Thread thread3 = new Thread() {
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println(Thread.currentThread().getName());
                    ppp1.plus();
                }
            }
        };
        Thread thread4 = new Thread() {
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println(Thread.currentThread().getName());
                    ppp1.plus();
                }
            }
        };
        thread3.start();
        thread4.start();



//        System.exit(0);

    }
}
