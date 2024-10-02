package pattern;

// 라이브러리 : 공통으로 사용가능한 특정 기능들의 모듈화, 폴더명 파일명 규칙없다
// 프레임워크 : 공통으로 사용가능한 특정 기능들의 모듈화, 폴더명 파일명 규칙있어 엄격
// 디자인패턴 : 프로그램 설계시 발생한 문제들을 객체 간 상호작용 관계 이용해 해결하도록 만든 규약

// 싱글톤 패턴 : 하나의 클래스에 하나의 인스턴트만, 데이터베이스 연결 모듈에 사용
//... 싱글톤은 단위 테스트시 미리 생성된 하나의 인스턴스 기반으로 구현됨으로 독립적인 인스턴스 만들기 어렵다
//... 이러한 모듈간 강한 결합을 의존성 주입을 통해 해결

// 의존성 : 변경된 객체에 대해 의존성 가진 다른 객체도 변경해야만 한다는것
// 의존성 주입(DI) : 의존성 관계 가진 객체 사이에 의존성 주입자를 통해 간접적으로 주입
//... 상위모듈은 하위모듈의 어떤것도 가져오지 않고, 둘다 추상화에 의존하고, 추상화는 세부사항에 의존하지 않는다

// 팩토리 패턴 : 객체를 사용하는 코드에서 객체 생성 부분을 분리해 추상화된 상위클래스와 하위클래스로 분리

// 전략 패턴 : 객체의 행위 변경시 직접 수정 하지 않고 컨텍스트 내의 캡슐화된 알고리즘을 상호교체하는 것
// 컨텍스트 : 상황,맥락,문맥을 의미하며 어떤 작업 완료시 필요한 모든 관련정보
//... ex) 쇼핑 카트에 물건 담아 두가지 전략인 두 종류의 카드로 결제할때

// 옵저버 패턴 : 주체가 어떤 객체의 상태 변화 관찰중 상태 변화시 메서드 등을 통해 옵저버 목록의 옵저버들에게 변화를 알려주는 디자인 패턴


import java.util.ArrayList;
import java.util.List;

public class p1{

    // 싱글톤 패턴________________________________________________________________
    static class Singleton{
        private static class singleInstanceHolder{
            private static final Singleton INSTANCE = new Singleton();
        }
        public static Singleton getInstance(){
            return singleInstanceHolder.INSTANCE;
        }
    }

    // 팩토리 패턴________________________________________________________________
    enum PersonType{
        person1,person2
    }
    static abstract class Person{
        protected String name;
        public String getName(){
            return name;
        }
    }
    static class person1 extends Person{
        public person1(){
            name = "person1";
        }
    }
    static class person2 extends Person{
        public person2(){
            name = "person2";
        }
    }
    static class PersonFactory{
        public static Person createPerson(PersonType type) throws IllegalAccessException {
            return switch (type) {
                case person1 -> new person1();
                case person2 -> new person2();
                default -> throw new IllegalAccessException("no match type : " + type);
            };
        }
    }

    // 전략 패턴________________________________________________________________
    // 리스트에 -> 해야할 운동 집어넣고 -> 서로다른 장소(전략) 으로 실행한다
    interface Action{
        public void do_it();
    }
    static class run implements Action{
        String where;
        run(String where){
            this.where = where;
        }
        @Override
        public void do_it(){
            System.out.println(where + "에서 빠르게 뛰는중..");
            System.out.println("심박수가 매우 상승합니다..");
        }
    }

    static class work implements Action{
        String where;
        work(String where){
            this.where = where;
        }
        @Override
        public void do_it(){
            System.out.println(where + "에서 천천히 뛰는중..");
            System.out.println("심박수가 천천히 상승합니다..");
        }
    }

    static class exercise {
        private String name;
        private String time;
        public exercise(String name,String time){
            this.name = name;
            this.time = time;
        }
        public String getName(){
            return name;
        }
        public String getTime(){
            return time;
        }
    }

    static class To_Do_List{
        List<exercise> list = new ArrayList<exercise>();

        public void add(exercise ex){
            this.list.add(ex);
        }

        public void execution(List<exercise> ex, Action ac){
            for(exercise e : ex){
                System.out.println(e.getName() + "를 " + e.getTime() + " 동안 실행합니다");
                ac.do_it();
            }

        }

    }

    // 옵저버 패턴
    // 유저 목록 생성 후 -> 한 유저가 글을 올리면 -> 다른 모든 유저에게 알림이 간다
    static class User{
        User(String name){
            this.name = name;
        }
        private String name;
        public String getName(){
            return name;
        }
    }
    static class User_list{
        List<User>list = new ArrayList<>();
        public void add(User user){
            System.out.println(user.getName() + " 님이 가입했습니다");
            list.add(user);
        }
        public void update(User user){
            for(User u : list){
                System.out.println(user.getName() + " 님이 게시글을 올렸습니다  " + u.getName() + " 님 확인해보세요");
            }
        }
    }

    public static void main(String[] args) throws Exception {

        // 싱글톤 패턴________________________________________________________________
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println("a : " + a.hashCode() + ", b : " + b.hashCode());
        System.out.println("a == b : " + (a == b));

        // 팩토리 패턴________________________________________________________________
        Person person = PersonFactory.createPerson(PersonType.person1);
        System.out.println(person.getName());

        // 전략 패턴________________________________________________________________
        To_Do_List to_do = new To_Do_List();
        to_do.add(new exercise("다이어트 목적으로","1시간"));
        to_do.add(new exercise("근력향상 목적으로","2시간"));
        run run = new run("한강");
        to_do.execution(to_do.list,run);
        work work = new work("동네 뒷산");
        to_do.execution(to_do.list,work);

        // 옵저버 패턴________________________________________________________________
        User user1 = new User("강낭콩");
        User user2 = new User("다람쥐");
        User user3 = new User("국밥");
        User_list user_list = new User_list();
        user_list.add(user1);
        user_list.add(user2);
        user_list.add(user3);
        user_list.update(user1);
        user_list.update(user3);



    }
}