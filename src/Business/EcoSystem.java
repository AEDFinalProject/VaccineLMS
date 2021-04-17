/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.PatientDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Distributor.DistributorDirectory;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Restaurant.RestaurantDirectory;
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
    private RestaurantDirectory restaurantDirectory;
    private PatientDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    
    private PatientDirectory patientDirectory = new PatientDirectory();
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private DistributorDirectory distributorDirectory;
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;

    public EcoSystem(HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory) {
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
//        this.distributorDirectory = distributorDirectory;
//        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    
    

    public EcoSystem(RestaurantDirectory restaurantDirectory, PatientDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {
        
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
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
       // networkList=new ArrayList<Network>();
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

    

    
//    public void createAndAddHospital(String name, String address) {
//        Hospital hospital = new Hospital();
//        hospital.setHospitalName(name);
//        hospital.setAddress(address);
//        hospitalDirectory.add(hospital);
//    }
    
    
    
    
    

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }
}
