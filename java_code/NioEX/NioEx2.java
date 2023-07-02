package java_code.NioEX;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class NioEx2 {
    public static void main(String[] args) {

        // 쓰기
        try {
            FileChannel fileChannel = FileChannel.open(
                    Paths.get("C:/github_study/java_code/NioEX/t.txt"),
                    StandardOpenOption.CREATE, // 파일이 없다면 만듬
                    StandardOpenOption.WRITE // 쓴다
            );

            String data = "asddfgdfdf";
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode(data);

            fileChannel.write(byteBuffer);
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 출력
        try {
            FileChannel fileChannel = FileChannel.open(
                    Paths.get("C:/github_study/java_code/NioEX/t.txt"),
                    StandardOpenOption.READ
            );

            String data = "";
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
            int count;
            while (true) {
                count = fileChannel.read(byteBuffer);
                if (count == -1) {
                    break;
                }
                byteBuffer.flip();
                data += charset.decode(byteBuffer).toString();
                byteBuffer.clear();
            }
            System.out.println(data);
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 복사
        try {
            FileChannel fileChannel1 = FileChannel.open(
                    Paths.get("C:/github_study/java_code/NioEX/tt.txt"),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE
            );

            FileChannel fileChannel2 = FileChannel.open(
                    Paths.get("C:/github_study/java_code/NioEX/t.txt"),
                    StandardOpenOption.READ
            );

            ByteBuffer buffer = ByteBuffer.allocateDirect(100);
            int count;
            while (true) {
                buffer.clear();
                count = fileChannel2.read(buffer);
                if (count == -1) {
                    break;
                }
                buffer.flip();
                fileChannel1.write(buffer);
            }
            fileChannel1.close();
            fileChannel2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 복사
        try {
            Path from = Paths.get("C:/github_study/java_code/NioEX/t.txt");
            Path to = Paths.get("C:/github_study/java_code/NioEX/tt.txt");
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
