package other;

// 자동 리소스 닫기
class FileInputStream implements AutoCloseable {
    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + "파일을 열었습니다");
    }

    public void close() throws Exception {
        System.out.println(file + "를 닫습니다");
    }
}

class re_test {
    public void med1() {
        try {
            med2();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 미존재");
            System.out.println(e);
        } finally {
            System.out.println("end...");
        }
    }

    public void med2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}

//사용자 정의 예외
//Xerror이라는 예외를 정의
class Xerror extends Exception{
    public Xerror(){};
    public Xerror(String message){super(message);}
}

public class C8 {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("end..");
        }

        // 멀티캐치
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("first err_________ " + e);
        } catch (Exception e) {
            System.out.println(e + "__멀티캐치");
        } finally {
            System.out.println("end..");
        }

        // 자동 리소스 닫기
        try (FileInputStream fis = new FileInputStream("file txt")) {
            fis.read();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("캐치 실행");
        } finally {
            System.out.println("end..");
        }

        //예외 떠넘기기
        re_test obj1 = new re_test();
        obj1.med1();

        



    }
}
