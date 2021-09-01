package ua.intita.qa.first;

public class Patient {
    int id;
    String firstName;
    String lastName;
    String address;
    int phone;
    int profileNumber;
    String diagnosis;

    public Patient(int id, String firstName, String lastName, String address, int phone, int profileNumber, String diagnosis) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.profileNumber = profileNumber;
        this.diagnosis = diagnosis;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", profileNumber=" + profileNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
