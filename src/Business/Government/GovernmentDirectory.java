/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class GovernmentDirectory {
    private ArrayList<Government> government = new ArrayList<>(1);
    
    public GovernmentDirectory(){
        government = new ArrayList();
    }

    public ArrayList<Government> getGovernment() {
        return government;
    }
    
    public Government createGovernment(String govEmpName, UserAccount ua, String cntry){
        Government gov = new Government();
        gov.setGovEmpName(govEmpName);
        gov.setUserAccount(ua);
        gov.setCountry(cntry);
        government.add(gov);
        return gov;
    }

    public void deleteGovernment(Government g) {
        government.remove(g);
    }
    
}
