package exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteAndRead {
    public List<String> readFile(String pathFile) {

        List<String> strings = new ArrayList<>();
        try {
            String line = "";
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }

    public void writeFile(String pathFile, List<String> strings) {
        boolean appendOp = true;
        int option = 0;
        File file = new File(pathFile);
        if (file.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n File da ton tai");
            System.out.println(" \n File da ton tai" +
                    "\n 1.Giữ lại dữ liệu cũ, ghi nối tiếp." +
                    "\n 2.Ghi đè dữ liệu file cũ." +
                    "\n 3. Thoát chương trình.");
            try {
                option = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException err) {
                option = 1;
                System.out.println("Lua chon 1 duoc mac dinh.");
            }
        }
        switch (option) {
            case 2:
                appendOp = false;
                break;
            case 3:
                return;
        }
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, appendOp));
            if (option == 1) {
                bufferedWriter.newLine();
            }
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            System.out.println("Ghi thanh cong");
            bufferedWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File khong ton tai");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        WriteAndRead hoc = new WriteAndRead();
        List<String> list = hoc.readFile("D:\\A0922I1-LEPHUOCHOC\\module2\\IOText\\src\\exercise1\\hoc1.txt");
        if(list.size()>0){
            hoc.writeFile("src/exercise1/hoc2.txt", list);
        }else {
            System.out.println("File trong");
        }

    }
}

