package AccessModifier;

public class Student {
    private String name;
    private String classes;

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John","A0922I1");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
