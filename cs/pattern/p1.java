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

// 팩토리 패턴 :

public class p1{

    // 싱글톤
    static class Singleton{
        private static class singleInstanceHolder{
            private static final Singleton INSTANCE = new Singleton();
        }
        public static Singleton getInstance(){
            return singleInstanceHolder.INSTANCE;
        }
    }

    public static void main(String[] args){

        // 싱글톤
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println("a : " + a.hashCode() + ", b : " + b.hashCode());
        System.out.println("a == b : " + (a == b));

    }
}