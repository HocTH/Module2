package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String path, List<String> list, boolean append){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for ( String string:list) {
                writer.write(string);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> readFile(String path){
        List<String> list =  new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line =null;
            while ((line = reader.readLine())!= null){
                if (line.trim().equals("")){
                    continue;
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public 

}
