/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public void removeWorkRequest(WorkRequest br){
        workRequestList.remove(br);
    }
    
    
    public void addWorkRequest(AlertShortage al) {
//        if (!workRequestList.contains(book)) //Add only if the WR doesnt exist
            workRequestList.add(al);
    }

    public void addWorkRequest(WorkRequest book) {
//        if (!workRequestList.contains(book)) //Add only if the WR doesnt exist
            workRequestList.add(book);
    }
}