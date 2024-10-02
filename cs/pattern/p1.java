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

// 프록시 패턴 : 대상 객체에 접근전 접근에 대한 흐름을 가로채 해당 접근을 필터링이나 수정하는 역할하는 계층의 패턴
//... 객체의 속성,변환 등을 보완하며 보안,데이터검증,캐싱,로깅 등에 사용
// 프록시 서버 : 서버와 클라이언트 사이에서 클라이언트가 자신을 통해 다른 네트워크 서비스에 간접 접속하게 해주는 시스템 또는 프로그램
// 프록시 서버 캐싱 : 캐시 안에 정보 담고 캐시 내부 정보 요구시 원격 서버에 요청하지 않고 캐시 내부 데이터 활용해 트래픽 감소
// nginx : 비동기 이벤트 기반의 구조와 다수의 연결을 효과적으로 처리하는 웹서버, Node.js 서버의 앞단의 프록시 서버로 활용
// 버퍼 오버플로우 : 데이터 저장되는 메모리 공간인 버퍼를 벗어나 사용되면 안되는 영역에 데이터가 덮어씌워져 주소,값 바꾸는 공격이 발생
// giz 압축 : 데이터 전송량 줄이나 압축 해제시 서버의 cpu오베해드를 고려해 압축 유무를 결정해야 한다
// CloudFlare : 웹서버 앞단에 두어 DDOS 방어나 HTTPS구축에 활용
//.. 시스템을 통해 오는 트래픽 차단, 큰 네트워크 용량과 캐싱 전략으로 DDOS막고 이러한 공격에 대한 방화벽 대시보드 제공
// CDN : 각 사용자가 인터넷에 접속하는 곳과 가까운 곳에서 콘텐츠를 캐싱 및 배포하는 서버 네트워크, 콘텐츠 다운로드 시간 줄임
// CORS : 서버가 웹 브라우저 리소스 로드시 다른 오리진 통한 로드를 막는 HTTP 헤더 기반 메커니즘
// 오리진 : 프로토콜, 호스트이름, 포트의 조합

// 이터레이터 패턴 : 이터레이터 사용하여 컬랙션의 요소에 접근, 자료형 구조에 상관없이 이터레이터라는 하나의 인터페이스로 순회가능

// MVC 패턴 : 모델, 뷰, 컨트롤러로 이루어진 디자인 패턴, 구성요소별 역할분리해 재사용성과 확작성이 용이
// 모델 : 애플리케이션의 데이터베이스, 상수, 변수
// 뷰 : 사용자 인터페이스 요소, 화면에 표시되는 정보만 가진다
// 컨트롤러 : 하나 이상의 모델과 하나 이상의 뷰를 잇는다, 이벤트관리등 메인로직 담당, 모델과뷰의 생명주기 관리, 모델과뷰 변경시 각 구성요소의 내용 알림

// MVP 패턴 : MVC 의 C가 프레젠터로, 뷰와 프레젠터는 일대일 관계임으로 MVC보다 강하게 결합
// MVVM : MVC의 C가 뷰 모델로 바뀜, 뷰모델은 뷰를 더 추상화하며 커맨드와 데이터 바인딩을 가짐, UI를 별도의 코드 수정 없이 재사용
// 데이터 바인딩 : 화면에 보이는 데이터와 웹 브라우저의 메모리 데이터를 일치, 뷰모델 변경시 뷰가 변경

// 프로그래밍 패러다임 : 프로그래밍의 관점을 부여하는 개발 방법론
// 프로그래밍 패러다임 분류 : 선언형 -> 함수형 , 명령형 -> 객체지향형, 명령형 -> 절차지향형

// 선언형 프로그래밍 : 무엇을 풀어내는지에 집중한 패러다임, 프로그램은 함수로 이루어졌다
// 함수형 프로그래밍 : 상태 값을 지니지 않는 함수 값들의 연속으로
// 순수 함수 : 매개변수 에만 영형을 받는 함수 다른 전역 변수등이 함수의 출력에 영향을 주지 않아야 한다
// 고차함수 : 함수가 함수를 값처럼 매개변수로 받아 로직생성이 가능한 함수
// 일급객체 : 고차함수를 쓰기위한 언어의 조건, 변수나 메서드에 함수할당 가능, 함수 내부에 함수를 매개변수로 담기 가능, 함수가 함수를 반환 가능

// 객체지향 프로그래밍 : 객체들의 집합으로 프로그램의 상호작용을 표현, 데이터를 객체로 취급해 객체 내부에 선언된 메서드를 활용
// 추상화 : 복잡한 시스템의 핵심 개념 또는 기능을 간추려내는 것
// 캡슐화 : 객체의 속성과 메서드를 하나로 묶고 일부를 외부에 감추어 은닉
// 상속성 : 상위 클래스의 특성을 하위 클래스가 이어받아 재상용 또는 추가나 확장, 코드의 재사용 측면이나 계층적 관계 생성 유지보수 측면에서 중요
// 다형성 : 하나의 메서드나 클래스가 다향한 방법으로 동작하는 것, 오버로딩과 오버라이딩
// 오버로딩 : 매서드타입, 매개변수유형이나 개수 등을 달리한 이름이 같은 매서드를 여려개 두는것, 컴파일중 발생하는 정적 다형성
// 오버라이딩 : 상위 클래스로부터 상속받은 메서드를 하위 클래스에서 재정의 하는것, 런타임중 발생하는 동적 다형성

// 객체지향 설계원칙 : SOLID(단일책임.개방폐쇄원칙.리스코드치환원칙.인터페이스분리원칙.의존역전원칙)
// 단일책임 원칙 : 모든 클래스는 하나의 책임만 가져야 한다
// 개방폐쇄 원칙 : 유지보수 고려한 코드의 확장이 원할해야 한다, 수정시 닫혀 있어야 한다, 기존 코드의 변경 줄이고 확장이 편해야 한다
// 리스코프 치환 원칙 : 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀수 있어야 한다
//... 클래스 상속에 의한 계층관계에 있는 부모 객체에 자식 객체를 넣어도 작동해야 한다
// 인터페이스 분리 원칙 : 하나의 일반적인 인터페이스보다 구체적인 여러개의 인터페이스를 만들어야 한다
// 의존역전 원칙 : 잘 변하지 않는 추상화된 인터페이스나 상위 클래스를 두어 변화에 영향받지 않게 하는 원치ㄱ
//... 상위계층의 하위 계층 변화에 대한 구현으로부터의 독립

// 절차형 프로그래밍 : 로직이 수행되야 할 연속적 계상 과정으로 이로어짐, 모듈화 어렵고 유지보수성 낮다



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