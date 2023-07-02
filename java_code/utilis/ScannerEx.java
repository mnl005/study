package java_code.utilis;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ScannerEx {
    public static void main(String[] args) {

        //scanner
        Scanner objq = new Scanner(System.in);
        String data = objq.nextLine();
        System.out.println("this data is : " + data);

        //localdate
        LocalDate obj = LocalDate.now();
        LocalTime obj1 = LocalTime.now();
        LocalDateTime obj2 = LocalDateTime.now();
        DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj2.format(obj3));

        

        
    }
}
