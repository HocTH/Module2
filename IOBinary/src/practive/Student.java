package practive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Studen{"+"id= "+ this.getId()
                +" ,name= "+ this.getName()+" ,address= "+ this.getAddress()+"}";
    }
    public static void writeToFile(String path, List<Student> list){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Student> readToFile(String path){
        List<Student> list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream(path));
            list = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
//        list.add(new Student(1,"tinh","hue"));
//        list.add(new Student(2,"hoc","hue"));
//        list.add(new Student(3,"huy","Ha noi"));
//        list.add(new Student(4,"hoai","HCM"));
//        writeToFile("src/practive/data.txt",list);
        List<Student> FileDataStudents = readToFile("src/practive/data.txt");
        for (Student student: FileDataStudents) {
            System.out.println(student);
        }
    }
}
