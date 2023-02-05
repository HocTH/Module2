public class Student {
    private String name;
    private static int quantity;
    public Student( String name){
        this.name = name;
        quantity++;
    }
    public String getName(){
        return this.name;
    };
    public static int getQuantity(){
        return quantity;
    };

    public static void main(String[] args) {
        Student hoc =  new Student("hoc");
        Student tinh = new Student("Tinh");
        System.out.println("Quantity of student: "+ getQuantity());
    }
}
