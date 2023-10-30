package classs;

// 추상 클래스는 추상 메서드를 포함하는 점을 제외하고는 일반 클래스와 유사
// 필드, 일반 메서드, 생성자 등을 가질 수 있다
// 추상 클래스는 직접 인스턴스화할 수 없으며, 하위 클래스를 통해 추상 클래스의 인스턴스를 생성
// 추상 클래스를 상속받는 클래스는 추상 클래스의 모든 추상 메서드를 반드시 구현
// 추상 메서드는 하위 클래스에서 해당 메서드의 구현을 제공해야 함

abstract class ab {
    abstract void med();
}

class s1 extends ab {
    void med() {
        System.out.println("this is s1");
    }
}

class s2 extends ab {
    void med() {
        System.out.println("this is s2");
    }
}

public class C4 {
    public static void main(String[] args) {
        s1 obj1 = new s1();
        s2 obj2 = new s2();
        obj1.med();
        obj2.med();


    }

}
