/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import Business.VaccineManufacturer.VaccineManufacturer;
import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class VaccineProduct {
    private String name;
    private int id;
    private static int count = 1;
    private VaccineType type;

    public VaccineProduct() {
        id = count;
        count++;
    }
    
    public enum VaccineType{
        Pfizer("Pfizer"),
        Moderna("Moderna"),
        JohnsonNJohnson("JohnsonNJohnson");
        
        private String value;
        private VaccineType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        

        @Override
        public String toString() {
            return value;
        }
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VaccineType getType() {
        return type;
    }

    public void setType(VaccineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
}
