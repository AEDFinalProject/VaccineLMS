/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProductDirectory;

/**
 *
 * @author rikinparekh
 */
public class Hospital {
    private String hospitalName;
    private String hospEmpName;
    private int hospitalID;
    private VaccineProductDirectory vaccineDirectory = new VaccineProductDirectory();
    private String address;
    private UserAccount userAccount;
    private static int count = 1;

//    public Hospital(String hospitalName, String hospitalID) {
//        this.hospitalName = hospitalName;
//        this.hospitalID = hospitalID;
//    }
    
    public Hospital(){
        hospitalID = count;
        count++;
        userAccount = new UserAccount();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public VaccineProductDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineProductDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    
    
    @Override
    public String toString() {
        return hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }

    public String getHospEmpName() {
        return hospEmpName;
    }

    public void setHospEmpName(String hospEmpName) {
        this.hospEmpName = hospEmpName;
    }

    

    

    
    
    
    
    
}
