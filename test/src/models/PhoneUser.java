package models;

public class PhoneUser extends Phone {
    public PhoneUser(int id, String phoneNumber, String group, String nameUser, String sex, String address, String birthDay, String email) {
        super(id, phoneNumber, group, nameUser, sex, address, birthDay, email);
    }

    public PhoneUser() {
    }

    @Override
    public String toString() {
        return "PhoneUser{} " + super.toString();
    }

    @Override
    public String getInformationToCSV() {
        return      getId() +
                "," + getPhoneNumber() +
                "," + getGroup() +
                "," + getNameUser() +
                "," + getSex() +
                "," + getAddress() +
                "," + getBirthDay() +
                "," + getEmail();
    }
}
