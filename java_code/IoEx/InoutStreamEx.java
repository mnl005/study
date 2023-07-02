package java_code.IoEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class InoutStreamEx {
    public static void main(String[] args) {
        System.setProperty("user.dir", "C:/github_study/java_code/IoEx");
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        String inputFilePath = currentDirectory + "/test.txt";
        String outputFilePath = currentDirectory + "/test.txt";

        // 인풋스트림
        try {
            InputStream is = new FileInputStream(inputFilePath);
            int data;
            while ((data = is.read()) != -1) {
                System.out.println(data);
                System.out.println((char) data);
            }
            is.close(); // 마무리
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 아웃풋스트림
        try {
            OutputStream os = new FileOutputStream(outputFilePath);
            byte[] data = "abcdeee".getBytes();
            for (int i = 0; i < data.length; i++) {
                os.write(data[i]);
            }
            os.close(); // 마무리
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Reader reader = new FileReader("C:/github_study/java_code/IoEx/test.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println(data);
            }
        } catch (Exception e) {
        }

        try (Writer writer = new FileWriter("C:/github_study/java_code/IoEx/test.txt")) {
            writer.write("this is try...");
        } catch (Exception e) {
        }

    }
}
