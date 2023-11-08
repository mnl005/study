package basic;

// 다형성 : 같은 상위 클래스 변수에 서로다른 하위 클래스로 객체를 생성
// 같은 부모 공유하는 서로다른 클래스를 묶어사용가능
class par {
    public void med(){
        System.out.println("par...");
    }
}
class ch1 extends  par{
    @Override
    public void med(){
        System.out.println("ch1...");
    }
    public void ch1_med(){
        System.out.println("ch1 med!");
    }
}
class ch2 extends  par{
    @Override
    public void med(){
        System.out.println("ch2...");
    }
    public void ch2_med(){
        System.out.println("ch2 med!");
    }
}
public class Polymorphism {
    public static void view1(ch1 ob){
        ob.med();
    }
    public static void view1(ch2 ob){
        ob.med();
    }

    public static void view2(par ob){
        if(ob instanceof  ch1){
            ((ch1) ob).ch1_med();
        }
        if(ob instanceof  ch2){
            ((ch2) ob).ch2_med();
        }
    }
    public static void main(String[] args){

        //같은 부모 다른 기능
        par obj1 = new ch1();
        par obj2 = new ch2();
        obj1.med();
        obj2.med();

        //오버로딩된 메소드 사용
        ch1 obj3 = new ch1();
        view1(obj3);
        ch1 obj4 = new ch1();
        view1(obj4);

        //다형성 인수(하나의 타입으로 여러가지 타입을 받을 수 있다
        par obj5 = new par();
        view2(obj1);
        view2(obj2);
        view2(obj3);
        view2(obj4);
        view2(obj5);

        //다형성 배열
        par[] arr_obj = new par[3];
        arr_obj[0] = new par();
        arr_obj[1] = new ch1();
        arr_obj[2] = new ch2();
        arr_obj[0].med();
        view2(arr_obj[1]);
        view2(arr_obj[2]);
    }
}
