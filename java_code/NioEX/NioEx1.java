package java_code.NioEX;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class NioEx1 {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("C:/github_study/java_code/IoEx/t.java");
            System.out.println(path.getFileName());
            System.out.println(path.getParent().getFileName());
            System.out.println(path.getNameCount());
        } catch (Exception e) {
        }

        try {
            FileSystem fileSystem = FileSystems.getDefault();
            for (FileStore store : fileSystem.getFileStores()) {
                System.out.println(store.name());
                System.out.println(store.type());
                System.out.println(store.getTotalSpace());
                System.out.println(store.getUsableSpace());
                System.out.println(fileSystem.getSeparator());
            }

            for (Path path : fileSystem.getRootDirectories()) {
                System.out.println(path.toString());
            }
        } catch (Exception e) {
        }

        try {
            Path path = Paths.get("C:/github_study/java_code/IoEx/t.java");
            System.out.println(Files.isDirectory(path));
            System.out.println(Files.isRegularFile(path));
            System.out.println(Files.getLastModifiedTime(path));
            System.out.println(Files.size(path));
            System.out.println(Files.getOwner(path));
            System.out.println(Files.isHidden(path));
            System.out.println(Files.isReadable(path));
            System.out.println(Files.isWritable(path));
        } catch (Exception e) {
        }

        try {
            Path path1 = Paths.get("C:/github_study/java_code/IoEx/t.txt");
            Path path2 = Paths.get("C:/github_study/java_code/IoEx/m3");

            if (Files.notExists(path1)) {
                Files.createFile(path1);
            }

            if (Files.notExists(path2)) {
                Files.createDirectories(path2);
            }
        } catch (Exception e) {
        }

        ByteBuffer direct1 = ByteBuffer.allocateDirect(100);
        ByteBuffer nondirect = ByteBuffer.allocate(100);

        System.out.println(direct1.capacity());
        System.out.println(nondirect.capacity());
        System.out.println(ByteOrder.nativeOrder());
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
        System.out.println(nondirect);

        ByteBuffer direct = ByteBuffer.allocateDirect(7);
        System.out.println(direct);

        direct.put((byte) 10);
        direct.put((byte) 11);
        System.out.println(direct);

        direct.put((byte) 12);
        direct.put((byte) 13);
        direct.put((byte) 14);
        System.out.println(direct);

        direct.flip();
        System.out.println("플립____");
        System.out.println(direct);

        direct.get(new byte[3]);
        System.out.println("겟____");
        System.out.println(direct);

        direct.mark();
        System.out.println("마킹____");

        direct.get(new byte[2]);
        System.out.println("겟____");
        System.out.println(direct);

        direct.reset();
        System.out.println("리셋____");
        System.out.println(direct);

        direct.rewind();
        System.out.println("리와인드____");
        System.out.println(direct);

        direct.clear();
        System.out.println("클리어____");
        System.out.println(direct);

        ByteBuffer direct2 = ByteBuffer.allocateDirect(7);
        System.out.println(direct2);

        direct2.put((byte) 10);
        direct2.put((byte) 11);
        System.out.println(direct2);

        direct2.flip();

        direct2.compact();
        System.out.println(direct2);

        Charset charset = Charset.forName("UTF-8");
        String data = "hihi";
        ByteBuffer byteBuffer2 = charset.encode(data);
        System.out.println(byteBuffer2);
        data = charset.decode(byteBuffer2).toString();
        System.out.println(data);

        int[] intdata = { 10, 20 };
        IntBuffer intbuf = IntBuffer.wrap(intdata);
        ByteBuffer bytebuf = ByteBuffer.allocate(intbuf.capacity() * 4);
        for (int i = 0; i < intbuf.capacity(); i++) {
            bytebuf.putInt(intbuf.get(i));
        }
        bytebuf.flip();

        ByteBuffer readbyte = bytebuf;
        IntBuffer readint = readbyte.asIntBuffer();
        int[] readdata = new int[readint.capacity()];
        readint.get(readdata);
        System.out.println(Arrays.toString(readdata));
    }
}
