package models;

public class Employee extends Person{
    private String employeeCode;
    private String qualification;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String employeeCode, String qualification, String position, Double salary) {
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String birthday, boolean sex, String IdentityCard, String phoneNumber, String email, String employeeCode, String qualification, String position, Double salary) {
        super(name, birthday, sex, IdentityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", birthday=" + getBirthday() +
                ", sex=" + isSex() +
                ", CMND=" + getIdentityCard() +
                ", phoneNumber=" + getPhoneNumber()  +
                ", email=" + getEmail() +
                ", employeeCode=" + getEmployeeCode() +
                ", qualification=" + getQualification() +
                ", position=" + getPosition() +
                ", salary='" + getSalary() +
                '}';
    }
    public String getInforToCSV(){
        return getName() +
                "," + getBirthday() +
                "," + isSex() +
                "," + getIdentityCard() +
                "," + getPhoneNumber()  +
                "," + getEmail() +
                "," + getEmployeeCode()+
                "," + getQualification() +
                "," + getPosition() +
                "," + getSalary();
    }
}
