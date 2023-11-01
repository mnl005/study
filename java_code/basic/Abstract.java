package basic;

// 추상 클래스로 다형성을 보장(반드시 재정의를 한다)
// 필드, 일반 메서드, 생성자 등을 가질 수 있다
// 추상 클래스는 직접 인스턴스화할 수 없으며, 하위 클래스를 통해 추상 클래스의 인스턴스를 생성

abstract class ab {
    public abstract void med();
}

class s1 extends ab {
    @Override
    public void med() {
        System.out.println("this is s1");
    }
}

class s2 extends ab {
    @Override
    public void med() {
        System.out.println("this is s2");
    }
}

public class Abstract {
    public static void main(String[] args) {
        s1 obj1 = new s1();
        s2 obj2 = new s2();
        obj1.med();
        obj2.med();
    }

}
