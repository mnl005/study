package java_code.Threads;

public class Th5 {

    public static void main(String[] args) throws InterruptedException {

        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true);

        Thread daemonThread1 = new Thread(new DaemonTask());
        daemonThread1.setDaemon(true);

        Thread normalThread = new Thread(new NormalTask());

        daemonThread.start();
        daemonThread1.start();
        normalThread.start();

        normalThread.join(); // 일반 스레드가 종료될 때까지 대기

        System.out.println("메인 스레드 종료");
    }

    static class DaemonTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("데몬 스레드 실행 중");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class NormalTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("일반 스레드 실행 중____________" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
