import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String [] test = {"Hoc","tinh","Sen"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\New Text Document.txt"));
            writer.write("Writing a file.\n");
            writer.write("Writing a file.\n");
            for (String name: test) {
                writer.write(name+"\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
