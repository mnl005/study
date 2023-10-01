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
//클래스를 매개변수로 가질 수 있다

//부모클래스에 기본생성자가 있다면 자식클래스에 super(매개값1,매개값2...)가 자동으로 추가된다
//부모클래스에 기본생성자가 없고 매개 변수가 있는 생성자만 있다면 자식 생성자에게 반드시 부모생성자 호출위해 super(매개값1,매개값2...)를 반드시 명시해야 한다

//오버라이딩 어노테이션은 부모로부터 상속받은 메소드 재정의시 표시하는 역할이다
//자식의 오버라이딩된 메소드중 부모의 원래 메소드 사용시 super.메소드명() 으로 불러온다

//final 클래스로 자식 클래스 만드는것 불가
//final 메소드는 오버라이딩 불가

// 업캐스팅은 부모클래스 타입으로 자식클래스 객체를 참조하는 것, 이때 자식의 오버라이딩된 메소드가 있다면 자식의 오버라이딩된 메소드가 호출됨, 부모에 없는 메소드 호출안됨

//부모 클래스, 부모를 상속받고 부모의 메소드 오버라이딩한 자식클래스, 부모클래스의 메소드 사용하는 클래스가 있을때 자식클래스와 클래스 선언후 클래스에 자식클래스 대입시 오버라이딩된 메소드가 실행된다




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
