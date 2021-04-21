/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct;
import Business.Vaccine.VaccineProduct.VaccineType;

/**
 *
 * @author rikinparekh
 */
public class BookingRequest extends WorkRequest{

    
    VaccineType type;
    public BookingRequest() {
        
        
    }

    public void setVaccineType(VaccineProduct.VaccineType type) {
        this.type = type;
    }

    @Override
    public void setReceiver(UserAccount receiver) {
        super.setReceiver(receiver); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserAccount getReceiver() {
        return super.getReceiver(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSender(UserAccount sender) {
        super.setSender(sender); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserAccount getSender() {
        return super.getSender(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
