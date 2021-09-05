package ua.intita.qa.first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        Patient[] patients = new Patient[5];
//        patients[0] = new Patient(1, "Denis", "Babin", "Vinnytsia", 11111111, 10, "allergy");
//        patients[1] = new Patient(2, "Grigorii", "Gudz", "Kyiv", 2222222, 5, "cough");
//        patients[2] = new Patient(3, "Fedir", "Mur", "Kyiv", 3333555, 15, "plaskostopie");
//        patients[3] = new Patient(4, "Anna", "Maria", "Odesa", 4444444, 1, "zdorova");
//        patients[4] = new Patient(5, "Vitalii", "Tihon", "Odesa", 4445555, 25, "allergy");

        String filePath = "C:\\javaProjects\\IntitaJava\\src\\ua\\intita\\qa\\first\\patientBlock.txt";
        String[] dataBlock = readData(filePath);
        Patient[] patients = new Patient[dataBlock.length];

        for (int i = 0; i < dataBlock.length; i++) {
           patients[i] = buildPatient(dataBlock[i]);
        }

        System.out.println(Arrays.toString(patients));

        Hospital cityHospital = new Hospital();

        Patient[] res = cityHospital.searchBetweenProfileNumbers(patients, 10, 20);
        System.out.println(Arrays.toString(res));
        System.out.println("");
        res = cityHospital.searchByDiagnosis(patients, "allergy");
        System.out.println(Arrays.toString(res));
    }

    private static Patient buildPatient(String data) {
        String[] arr = data.split(" ");
        return new Patient(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6]);
    }

    public static String[] readData(String filePath) throws IOException {

        FileReader inputStream = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(inputStream);
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
        return content.toString().split(System.lineSeparator());
    }
}

