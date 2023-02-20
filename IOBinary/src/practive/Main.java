package practive;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
   private static  void copyFileUsingStream(File source, File dest){
       FileInputStream is = null;
       FileOutputStream os = null;
       try{
           is = new FileInputStream(source);
           byte[] buffer = new byte[1024];
           int lenght = -1;
           while ((lenght = is.read(buffer)) !=-1){
               os.write(buffer,0,lenght);
           }
           is.close();
           os.close();
       }catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter source file:");
        String sourcePath = scanner.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
