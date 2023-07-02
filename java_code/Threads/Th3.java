package java_code.Threads;

class Account {
    int balance = 1000;

    public synchronized void withDraw(int money) {
        if (balance >= money) {
            try {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + " 출금 금액 ->> " + money);
                Thread.sleep(1000);
                balance -= money;
                System.out.println(thread.getName() + " balance:" + balance);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            Thread.currentThread().interrupt(); // 잔고가 부족할 때 현재 쓰레드를 중단
        }
    }
}

class Task implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.balance > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withDraw(money);
        }
    }
}

public class Th3 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("t1-Thread");
        t2.setName("t2-Thread");

        t1.start();
        t2.start();
    }
}
