package practive;

import java.util.*;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name= " + name + " ,age " + age + " ,address " + address;
    }

    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getAge() > o2.getAge()) {
                return -1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return 1;
            }
        }


        public static void main(String[] args) {
//            Student student1 = new Student("Hoc", 18, "Binh An");
//            Student student2 = new Student("Tinh", 20, "Loc Thuy");
//            Student student3 = new Student("Huy", 21, "Nghe An");
//            Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
//            studentMap.put(1, student1);
//            studentMap.put(2, student2);
//            studentMap.put(3, student3);
//            for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
//                System.out.println(student.toString());
//            }
//            System.out.println(".............set");
//            Set<Student> studentSet = new HashSet<Student>();
//            studentSet.add(student1);
//            studentSet.add(student2);
//            studentSet.add(student3);
//            for (Student student : studentSet
//            ) {
//                System.out.println(student.toString());
//            }
            Student student = new Student("Kien", 30, "HT");
            Student student1 = new Student("Nam", 26, "HN");
            Student student2 = new Student("Anh", 38, "HT" );
            Student student3 = new Student("Tung", 38, "HT" );

            List<Student> lists = new ArrayList<Student>();
            lists.add(student);
            lists.add(student1);
            lists.add(student2);
            lists.add(student3);
            Collections.sort(lists);
            for(Student st : lists){
                System.out.println(st.toString());
            }

            AgeComparator ageComparator = new AgeComparator();
            Collections.sort(lists,ageComparator);
            System.out.println("So sanh theo tuoi:");
            for(Student st : lists){
                System.out.println(st.toString());
            }

        }


    }
}
