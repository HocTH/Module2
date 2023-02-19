package bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndWriteCSV {
    public static void main(String[] args) {
        try {
            File file = new File("src/bt2/file3.csv");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                printCountry(parseCsv(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại!");
        }
    }
    public static List<String> parseCsv(String line){
        List<String> strings = new ArrayList<>();
        if (line!=null){
            String[] splitArr = line.split(",");
            for (int i = 0; i < splitArr.length ; i++) {
                strings.add(splitArr[i]);
            }
        }
        return strings;
    }
    private static void printCountry(List<String> country){
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
