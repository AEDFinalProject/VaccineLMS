/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createPatient(String name, String id, UserAccount ua, String vaccineReq){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setId(Integer.parseInt(id));
        patient.setVaccineType(vaccineReq);
        patient.setUa(ua);
        patientList.add(patient);
        return patient;
    }

    public void deletePatient(Patient p) {
        patientList.remove(p);
    }
    
}
