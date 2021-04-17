/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

import java.util.ArrayList;

/**
 *
 * @author rikinparekh
 */
public class DistributorDirectory {
    private ArrayList<Distributor> distributorList;
    
    public DistributorDirectory(){
        distributorList = new ArrayList();
    }

    public ArrayList<Distributor> getDistributorList() {
        return distributorList;
    }
    
    public Distributor createDistributor(String name){
        Distributor distributor = new Distributor();
        distributor.setDitributorName(name);
        distributorList.add(distributor);
        return distributor;
    }
    
}
