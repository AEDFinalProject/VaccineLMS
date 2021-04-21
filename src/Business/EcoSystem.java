/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Patient.PatientDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.Distributor.DistributorDirectory;
import Business.Government.GovernmentDirectory;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.VaccineProductDirectory;
import Business.VaccineManufacturer.VaccineManufacturerDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private PatientDirectory customerDirectory;
    
    private PatientDirectory patientDirectory = new PatientDirectory();
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private VaccineProductDirectory globalVaccineDirectory = new VaccineProductDirectory();
    private GovernmentDirectory government = new GovernmentDirectory();
    private DistributorDirectory distributorDirectory;
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;

    public EcoSystem(HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory) {
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
    }
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
    }

    
    public DistributorDirectory getDistributorDirectory() {
        return distributorDirectory;
    }

    public VaccineManufacturerDirectory getVaccineManufacturerDirectory() {
        return vaccineManufacturerDirectory;
    }
    
    

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }    
  
    

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
    
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return government;
    }
}
