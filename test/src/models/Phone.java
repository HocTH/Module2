package models;

public abstract class Phone {
    private int id;
    private String phoneNumber;
    private String group;
    private String nameUser;
    private String sex;
    private String address;
    private String birthDay;
    private String email;

    public Phone(int id, String phoneNumber, String group, String nameUser, String sex, String address, String birthDay, String email) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.nameUser = nameUser;
        this.sex = sex;
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber +
                ", group='" + group +
                ", nameUser='" + nameUser +
                ", sex='" + sex +
                ", address='" + address +
                ", birthDay='" + birthDay +
                ", email='" + email +
                '}';
    }
    public abstract String getInformationToCSV();
}
