package java_code.Threads;

public class Th4 {
    public int a = 0;

    public static void main(String[] args) {
        Th4 obj = new Th4();
        obj.a = 0;

        Thread th1 = new Thread() {
            public void run() {
                while (!isInterrupted()) {
                    obj.a++;
                    System.out.println(this.getName() + " : " + obj.a);
                }
            }
        };

        Thread th2 = new Thread() {
            public void run() {
                try {
                    while (true) {
                        obj.a++;
                        System.out.println(this.getName() + " : " + obj.a);
                        Thread.sleep(1);
                        System.out.println(this.isInterrupted());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread th3 = new Thread() {
            public void run() {
                while (!isInterrupted()) {
                    obj.a++;
                    System.out.println(this.getName() + " : " + obj.a);
                }
            }
        };

        th1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt(); // 인터럽트 방법 1

        th2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th2.interrupt(); // 인터럽트 방법 2

        th3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.interrupt(); // 인터럽트 방법 3
    }
}
