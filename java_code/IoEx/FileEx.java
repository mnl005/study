package java_code.IoEx;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileEx {
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            char text = (char) is.read();
            System.out.println(text);
        } catch (Exception e) {
        }

        try {
            InputStream is = System.in;
            byte[] datas = new byte[100];
            int num = is.read(datas);
            String name = new String(datas, 0, num - 2);

            System.out.println(num - 2);
            System.out.println(name);
        } catch (Exception e) {
        }

        try {
            OutputStream os = System.out;
            byte b = 97;
            os.write(b);
            os.flush();
        } catch (Exception e) {
        }

        try {
            OutputStream os = System.out;
            String str = "asdf";
            byte[] byby = str.getBytes();
            os.write(byby);
            os.flush();
        } catch (Exception e) {
        }

        try {
            Console console = System.console();
            String data = console.readLine();
            System.out.println(data);
        } catch (Exception e) {
        }

        try {
            File dir = new File("C:/github_study/java_code/IoEx/m2");
            File file = new File("C:/github_study/java_code/IoEx/m2/test.txt");
            System.out.println(dir.exists());
            System.out.println(file.exists());
            //있는지 확인
        } catch (Exception e) {
        }

        try {
            File file = new File("C:/github_study/java_code/IoEx/test.txt");
            System.out.println(file.getPath());
            //경로추적
        } catch (Exception e) {
        }

        try {
            File dir1 = new File("C:/github_study/java_code/IoEx/m2/mm");
            dir1.mkdirs();
            File file1 = new File("C:/github_study/java_code/IoEx/m2/test1.txt");
            file1.createNewFile();
            //만들기
        } catch (Exception e) {
        }

        try {
            File file = new File("C:/github_study/java_code/IoEx/test.txt");
            FileInputStream fis = new FileInputStream(file);

            int num;
            byte[] readbyte = new byte[100];

            while ((num = fis.read(readbyte)) != -1) {
                System.out.write(readbyte);
            }

            fis.close();
        } catch (Exception e) {
        }

        try {
            File file = new File("C:/github_study/java_code/IoEx/test.txt");
            FileOutputStream fos = new FileOutputStream(file);

            byte data = (byte) 97;
            fos.write(data);
            fos.flush();
            fos.close();
        } catch (Exception e) {
        }

        try {
            File file = new File("C:/github_study/java_code/IoEx/test.txt");
            File file1 = new File("C:/github_study/java_code/IoEx/test1.txt");
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file1);

            int num;
            byte[] read = new byte[100];
            while ((num = fis.read(read)) != -1) {
                fos.write(read, 0, num);
            }
        } catch (Exception e) {
        }
    }
}
