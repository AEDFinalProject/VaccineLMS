/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct.VaccineType;
import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList = new ArrayList();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }
    
    public Hospital createHospital(String name, String empName, String address, UserAccount ua, String type){
        Hospital hospital = new Hospital();
        hospital.setHospitalName(name);
        hospital.setAddress(address);
        hospital.setHospEmpName(empName);
        hospital.setUserAccount(ua);
        hospital.setType(VaccineType.valueOf(type));
        hospitalList.add(hospital);
        return hospital;
    }

    public void deleteHospital(Hospital h) {
        hospitalList.remove(h);
    }
    
}
