package practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFile(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while( (line =br.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong: " +sum);
        } catch (Exception e){
            System.out.println("File khong ton tai or noi co loi");
        }
    }
    public void writeFile(String path){
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(path));
             br.write("12333");
            br.close();
        } catch (Exception e){
            System.out.println("File khong ton tai or noi co loi");
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
//        readFileExample.readFile("abc.txt");
        readFileExample.writeFile("abc.txt");
    }
}
