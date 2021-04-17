package Business;

import Business.Customer.Patient;
import Business.Employee.Employee;
import Business.Hospital.Hospital;
import Business.Role.CustomerRole;
import Business.Role.HospitalRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
////        Patient customer = system.getCustomerDirectory().createCustomer("Rikin");
////        
////        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("rikin", "parekh", customer, new CustomerRole());
//        
//        Hospital hosp = system.getHospitalDirectory().createHospital("Kokilaben Hospital", "Andheri");
//        
//        UserAccount usrAcc = system.getUserAccountDirectory().createUserAccount("kok", "ilaben", hosp, new HospitalRole());
//        
        return system;
    }
    
}
