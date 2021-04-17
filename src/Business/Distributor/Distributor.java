/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distributor;

/**
 *
 * @author rikinparekh
 */
public class Distributor {
    private String ditributorName;
    private int distributorID;
    private static int count = 110;
    
    public Distributor(){
        distributorID = count;
        count++;
    }

    public String getDitributorName() {
        return ditributorName;
    }

    public void setDitributorName(String ditributorName) {
        this.ditributorName = ditributorName;
    }

    public int getDistributorID() {
        return distributorID;
    }

    public void setDistributorID(int distributorID) {
        this.distributorID = distributorID;
    }

    @Override
    public String toString() {
        return ditributorName;
    }
    
    
    
}
