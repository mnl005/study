package java_code.Threads;

public class Th6 implements Runnable {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            String groupName = Thread.currentThread().getThreadGroup().getName();
            System.out.println("Running in thread group: " + groupName);
            System.out.println("Name: " + Thread.currentThread().getName());
            System.out.println("_______________________________");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // create a thread group
        ThreadGroup group = new ThreadGroup("myThreadGroup");

        // create and start threads in the thread group
        Thread thread1 = new Thread(group, new Th6());
        // Thread thread2 = new Thread(group, new GroupExample());

        thread1.start();
        // thread2.start();
        // 그룹 지정한 스래드...

        // group obj = new group();
        // Thread thread4 = new Thread(obj);
        // thread4.start();
        // 그룹 지정하지 않은 스레드

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        group.interrupt();
        // 그룹 인터럽트

        group.setMaxPriority(1);
        System.out.println("activeCount : " + group.activeCount());
        System.out.println("activeGroupCount : " + group.activeGroupCount());
        System.out.println("getMaxPriority : " + group.getMaxPriority()); // set에따라 달라짐
        System.out.println("getName : " + group.getName());
        System.out.println("getParent : " + group.getParent());
        System.out.println("parentOf : " + group.parentOf(group));
        System.out.println("isDaemon : " + group.isDaemon());
        System.out.print("list : ");
        group.list();

        Thread[] threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        System.out.println("그룹스레드 이름:");
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }
}
