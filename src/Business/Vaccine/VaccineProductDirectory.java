/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import Business.Vaccine.VaccineProduct.VaccineType;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rikinparekh
 */
public class VaccineProductDirectory {
    private ArrayList<VaccineProduct> vaccineProductList;
    
    public VaccineProductDirectory(){
        vaccineProductList = new ArrayList();
    }

    public VaccineProductDirectory(VaccineProductDirectory vaccDirectory) {
        
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
        
//        Iterator<VaccineProduct> itr = vaccineProductList.iterator();
//            while(itr.hasNext()){
//                if(vacc.equals(itr.next())){
//                    vaccineProductList.remove(vacc);
//                }
//            }
            for(int i = 0; i < vaccineProductList.size(); i++){
                if(vacc.equals(vaccineProductList.get(i))){
                    vaccineProductList.remove(vacc);
                }
            }

        }

        

    @Override
    public String toString() {
        return String.valueOf(vaccineProductList.size());
    }
    
    
    
    
}
