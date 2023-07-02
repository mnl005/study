package java_code.Threads;

// Thread 클래스를 상속하면 다른 클래스를 상속받을 수 없다.
// Runnable 인터페이스를 구현하면 다른 인터페이스를 함께 구현할 수 있으며, 클래스를 상속받을 수도 있다.
// Runnable을 구현하는 클래스는 Runnable의 run() 메서드를 오버라이딩하여 사용해야 하며,
// 실행할 때 Thread 객체를 생성하여 start() 메서드를 호출해야 한다.
// Thread 클래스를 사용하는 경우 this를 사용하여 현재 스레드 참조를 가져올 수 있다.
// Runnable 인터페이스를 사용하는 경우 Thread.currentThread().getName()을 사용하여 현재 스레드 이름을 가져올 수 있다.

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread : " + i);
        }
    }
}

interface ExtraInterface {
    void myMethod();
}

class MyRunnable implements Runnable, ExtraInterface {

    public void myMethod() {
        System.out.println("Implementing method from ExtraInterface");
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable : " + i);
        }
    }
}

public class Th2 {
    public static void main(String[] args) {

        // Thread 클래스 상속을 사용하는 기본적인 방법
        MyThread myThread = new MyThread();
        myThread.start();

        // Runnable 인터페이스 구현을 사용하는 기본적인 방법
        MyRunnable myRunnable = new MyRunnable();
        Thread threadForRunnable = new Thread(myRunnable);
        threadForRunnable.start();

        // 실행단 바로 사용하는 방법
        Thread th2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        th2.start();

        // 실행단 바로 사용하는 방법
        Thread th3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i * 10);
            }
        });
        th3.start();

        // 실행단 바로 사용하는 방법
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("this in run" + i);
                }
            }
        };
        thread.start();

    }
}
