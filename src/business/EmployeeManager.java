package business;

import dataaccess.EmployeeServices;
import domain.Employee;

/**
 *
 * @author Phuc Hong Le
 */
public class EmployeeManager {
    
    //fields
    private EmployeeServices empSrvc;
    private int nextId;
    
    public EmployeeManager(){
        empSrvc = new EmployeeServices();
        nextId = empSrvc.LAST_ID + 1;
    }
    
    public void hire(Employee[] newEmployees){
        for (Employee e: newEmployees) {
            e.setEmployeeId(nextId++);
            empSrvc.hire(e);
        }
    }
    
    public Employee[] layOff(int count){
        Employee[] emps = new Employee[count];
        for (int i = 0; i < count; i++) {
            emps[i] = empSrvc.layoff();
        }
        return emps;
    }
    
    public Employee promoteNext(){
        return empSrvc.promote();
    }
    
    public boolean remove(Employee e){
        return empSrvc.release(e);
    }
    
}
