/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct;
import Business.Vaccine.VaccineProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class Government {
    private String govEmpName;
    private String country;
    private VaccineProductDirectory govVaccineInventory = new VaccineProductDirectory();
    private UserAccount userAccount;
    
    public Government(){
        userAccount = new UserAccount();
    }

    public String getGovEmpName() {
        return govEmpName;
    }

    public void setGovEmpName(String govEmpName) {
        this.govEmpName = govEmpName;
    }

    public VaccineProductDirectory getGovVaccineInventory() {
        return govVaccineInventory;
    }

    public void setGovVaccineInventory(VaccineProductDirectory govVaccineInventory) {
        this.govVaccineInventory = govVaccineInventory;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    
    
    
    public void createVaccineBulkOrder(){
        
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    

    @Override
    public String toString() {
        return String.valueOf(userAccount);
    }
    
    
    
    
}
