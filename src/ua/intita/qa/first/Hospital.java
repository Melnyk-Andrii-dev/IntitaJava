package ua.intita.qa.first;

import java.util.ArrayList;

public class Hospital {

    public Patient[] searchByDiagnosis(Patient[] patients, String diagnosis){
        if(patients == null || diagnosis.length()==0){
            System.out.println("Error! Invalid parameters");
            return null;
        }
        ArrayList<Patient> foundPatients = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.diagnosis.equals(diagnosis)){
                foundPatients.add(patient);
            }
        }
        return foundPatients.toArray(new Patient[0]);
    }

    public Patient[] searchBetweenProfileNumbers(Patient[] patients, int from, int to){
        if(patients == null || from>to){
            System.out.println("ERROR, incorrect parameters");
            return null;
        }
        ArrayList<Patient> foundPatients = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.profileNumber>=from && patient.profileNumber<=to){
                foundPatients.add(patient);
            }
        }
        return foundPatients.toArray(new Patient[0]);
    }
}
