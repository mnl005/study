package basic;

import java.util.Scanner;

public class methods {

    public static void fun1(){
        System.out.println("...");
    }
    public static  void fun1(int[] a) {
       for(int i : a){
           System.out.println(i);
       }
    }

    public static void main(String[] args) {

        //오버로딩된 메소드 사용
        int[] arr = {1,2,3};
        fun1(arr);
        fun1();
    }
}
