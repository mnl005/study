package java_code.utilis;

enum e1 {
    low, medium, high
}

enum e2 {
    low(100), medium(200), high(300);

    private final int val;

    e2(int val) {
        this.val = val;
    }

    public int getval() {
        return val;
    }
}

public class EnumeEx {
    public static void main(String[] args) {

        System.out.println(e2.low.getval());
        System.out.println(e2.valueOf("low"));
        System.out.println(e2.low.ordinal());

        e2[] arr = e2.values();
        for (e2 i : arr) {
            System.out.println(i);
            System.out.println(i.getval());
        }
    }
}
