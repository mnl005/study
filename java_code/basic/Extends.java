package basic;

// 부모의 생성자에서 초기화 하는게 바람직하다
// 기본생성자 내부의 super()은 항상 최상위에 위치

class parents {
    private String str;
    public void med(){System.out.println("str : " + str);}
    parents(String a){
        this.str = a;
    }
}

class child extends parents{
    child(String a) {
        //부모의 기본생성자를 호출하여 부모의 private로 선언된 변수를 초기화
        super(a);
    }
    public void tell(){
        System.out.println("child....");
    }
}

public class Extends {

    public static void main(String[] args) {
        child obj = new child("hello....");
        obj.med();

        //업캐스팅
        parents obj_1 = new child("i dont no");
        obj_1.med();

        //불가능
        //obj_1.tell();

        //다운캐스팅
        ((child)obj_1).tell();
    }
}
