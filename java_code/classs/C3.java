package java_code.classs;

//자식 클래스 타입의 참조 변수로는 부모 클래스 타입의 인스턴스 참조 불가
//이유는 참조 변수가 사용 가능한 맴버의 개수가 실제 인스턴스의 맴버 개수보다 많기 때문
//클래스는 상속을 통해 확장은 가능하나 축소는 불가능 

// //참조변수 instanceof 클래스이름
// //참조 변수의 인스턴스 확인
// Parent c = new Child();
// c of instanceof Object //true
// c of instanceof Parent //true
// c of instanceof Child//true
// //클래스를 매개변수로 가질 수 있다

class Parent {

}

class Brother extends Parent {

}

class Child extends Parent {

}

// 클래스를 매개변수로 가질 수 있다
class parent1 {
    public void parent1(child1 a) {
        a.med();
    }

    public void run() {
        System.out.println("달린다");
    }
}

class child1 {
    public void med() {
        System.out.println("c1");
    }
}

class child2 {
    public void med(child1 a) {
        a.med();
    }
}

class par {
    // 부모 클래스의 내용
}

class chi extends par {
    // 자식 클래스의 내용
}

public class C3 {

    public static void main(String[] args) {
        Parent pa = new Parent(); // 허용
        Child ch = new Child(); // 허용
        Parent pc = new Child(); // 허용
        // Child cp = new Parent(); // 오류 발생

        Parent pa01 = null;
        Child ch1 = new Child();
        Parent pa02 = new Parent();
        Brother br = null;

        pa01 = ch1; // pa01 = (Parent)ch; 와 같으며, 타입 변환을 생략할 수 있음.
        // br = (Brother) pa02; // 오류 발생.
        // br = (Brother) ch1; // 직접적인 상속 관계가 아니므로, 오류 발생.

        // par obj1 = new chi(); // 업캐스팅
        // par obj2 = new par();
        // // chi obj3 = (chi) obj2;//동작 x

        par obj1 = new chi(); // 업캐스팅

        par obj2 = new par(); 
        // chi obj3 = (chi) obj2;// 문법오류 없으나 동작 안함
    }
}
