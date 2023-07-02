package java_code.Threads;

import java.util.Map;

public class Th1 {

    public static void main(String[] args) throws InterruptedException {
        
        // 쓰레드 th1 생성, 1초 동안 정지
        Thread th1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // 쓰레드 정보 출력
        System.out.println(th1.toString()); // 스레드의 정보를 문자열로 출력
        System.out.println(th1.getId()); // 스레드의 ID 출력
        System.out.println(th1.getName()); // 스레드의 이름 출력
        System.out.println(th1.getPriority()); // 스레드의 우선순위 출력
        System.out.println(th1.getThreadGroup()); // 스레드 그룹 정보 출력
        System.out.println(th1.getState()); // 스레드 상태 출력
        
        // 쓰레드 th2 생성 및 우선순위 설정
        Thread th2 = new Thread(() -> {});
        th2.setPriority(1); // 우선순위를 1로 설정5
        th2.setPriority(Thread.MIN_PRIORITY); // 우선순위를 최소값으로 설정
        
        // 스레드를 1초 동안 정지시킴
        Thread.sleep(1000);
        
        // 현재 스레드가 실행 대기 상태가 되도록 함
        Thread.yield();
        
        // th1이 종료될 때까지 현재 스레드를 대기시킴
        th1.start();
        th1.join();
        
        // 데몬 스레드 예제
        Thread th3 = new Thread(() -> {});
        th3.setDaemon(true); // 데몬 스레드로 설정
        th3.start();
        
        // 모든 스레드의 스택 트레이스를 가져옴
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        System.out.println(map);
        
        // 쓰레드 그룹 예제
        ThreadGroup group = new ThreadGroup("Group1"); // 쓰레드 그룹 생성
        group.setMaxPriority(1); // 쓰레드 그룹의 최대 우선순위 설정
        System.out.println("activeCount : " + group.activeCount()); // 활성화된 쓰레드 수 출력
        System.out.println("activeGroupCount : " + group.activeGroupCount()); // 활성화된 쓰레드 그룹 수 출력
        System.out.println("getMaxPriority : " + group.getMaxPriority()); // 최대 우선순위 출력
        System.out.println("getName : " + group.getName()); // 쓰레드 그룹 이름 출력
        System.out.println("getParent : " + group.getParent()); // 부모 쓰레드 그룹 출력
        System.out.println("parentOf : " + group.parentOf(group)); // 부모 쓰레드 그룹 여부 출력
        System.out.println("isDaemon : " + group.isDaemon()); // 데몬 쓰레드 그룹인지 출력
        System.out.print("list : "); group.list(); // 쓰레드 그룹의 목록 출력
        
        // wait, notify 예제
        Object lock = new Object(); // 동기화를 위한 객체 생성
        synchronized (lock) { // 동기화 블록
            try {
                lock.wait(1000); // 1초 동안 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.notify(); // 대기 중인 쓰레드에게 알림
        }
    }
}
