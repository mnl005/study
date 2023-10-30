package basic;

// 자바의 타입은 기본 타입(정수 타입, 실수 타입, 논리 타입) 과 참조 타입(배열,열거,클래스, 인터 페이스)
// 참조 타입은 번지를 통해 객체를 참조
// 메소드 영역은 클래스 들을 읽어 이것을 모든 스레드 가 공유 한다
// 힙 영역은 객체와 배열이 생성 되는 영역 이며 다른 영역 에서 참조 하고 참조 하지 않는 객체는 쓰레기 수집기 가 자동 으로 제거 한다
// JVM 스택 영역은 메소드 호출시 프레임 을 push,pop 한다

import java.util.Arrays;
import java.util.Random;

class test_object{
    public String name;
    public String date;
    public void med(){
        System.out.println("name : " + name);
        System.out.println("date : " + date);
    }
}


public class object {

    public int a = 0;
    static int b = 1;
    int c = 2;



    public static void main(String[] args){

        //객체
        object obj1 = new object();
        System.out.println("a : " + obj1.a);
        System.out.println("b : " + b);
        System.out.println("c : " + obj1.c);

        //배열
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for(int i : arr1){
            System.out.println(i);
        }
        System.out.println("배열 a의 길이 : " + arr1.length);
        String[] arr2 = {"a","b","c"};
        System.out.println("arr2[2] : " + arr2[2]);

        //객체배열
        test_object[] obj_arr = new test_object[2];
        obj_arr[0] = new test_object();
        obj_arr[1] = new test_object();
        obj_arr[0].name = "first";
        obj_arr[0].date = "now";
        obj_arr[1].name = "second";
        obj_arr[1].date = "now...?";
        obj_arr[0].med();
        obj_arr[1].med();

        //랜덤픽셀이미지
        int[][] image = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = random.nextInt(2);
            }
        }
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }

    }
}
