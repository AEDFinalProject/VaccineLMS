/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct.VaccineType;
import Business.Vaccine.VaccineProductDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author rikinparekh
 */
public class Hospital {
    private String hospitalName;
    private String hospEmpName;
    private int hospitalID;
    private WorkQueue workQueue;
    private VaccineProductDirectory vaccineDirectory;
    private String address;
    private UserAccount userAccount;
    private static int count = 1;
    VaccineType type;
    private int numberOfVaccines;
    
    public Hospital(){
        hospitalID = count;
        count++;
        userAccount = new UserAccount();
        vaccineDirectory  = new VaccineProductDirectory();
        workQueue = new WorkQueue();
    }

    public VaccineType getType() {
        return type;
    }

    public void setType(VaccineType type) {
        this.type = type;
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

    public int getNumberOfVaccines() {
        return vaccineDirectory.getVaccineProductList().size();
    }

    public void setNumberOfVaccines(int numberOfVaccines) {
        this.numberOfVaccines = numberOfVaccines;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
    
}
