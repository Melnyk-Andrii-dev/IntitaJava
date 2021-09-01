package ua.intita.qa.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient(1, "Denis", "Babin", "Vinnytsia", 11111111,  10, "allergy");
        patients[1] = new Patient(2, "Grigorii", "Gudz", "Kyiv", 2222222,  5, "cough");
        patients[2] = new Patient(3, "Fedir", "Mur", "Kyiv", 3333555,  15, "plaskostopie");
        patients[3] = new Patient(4, "Anna", "Maria", "Odesa", 4444444,  1, "zdorova");
        patients[4] = new Patient(5, "Vitalii", "Tihon", "Odesa", 4445555,  25, "allergy");

        Hospital cityHospital = new Hospital();
        Patient[] res = cityHospital.searchBetweenProfileNumbers(patients, 10, 20);
        System.out.println(Arrays.toString(res));
        System.out.println("");
        res = cityHospital.searchByDiagnosis(patients, "allergy");
        System.out.println(Arrays.toString(res));


    }
}
