/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import Business.Vaccine.VaccineProduct.VaccineType;
import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class VaccineProductDirectory {
    private ArrayList<VaccineProduct> vaccineProductList;
    
    public VaccineProductDirectory(){
        vaccineProductList = new ArrayList();
    }

    public ArrayList<VaccineProduct> getVaccineProductList() {
        return vaccineProductList;
    }
    
    public VaccineProduct createVaccineProduct(VaccineType type){
        VaccineProduct vaccine = new VaccineProduct();
        vaccine.setType(type);
        vaccineProductList.add(vaccine);
        return vaccine;
    }
    
    public VaccineProduct findVaccineProduct(int id){
        for(VaccineProduct v : this.vaccineProductList){
            if(v.getId() == id){
                return v;
            }
        }
        return null;
    }
    
    public void removeVaccineProduct(VaccineProduct vacc){
        for(VaccineProduct v : vaccineProductList){
            if(v.equals(vacc)){
                vaccineProductList.remove(v);
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(vaccineProductList.size());
    }
    
    
    
    
}
