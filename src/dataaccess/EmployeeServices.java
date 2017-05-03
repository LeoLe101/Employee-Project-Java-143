package dataaccess;

import domain.Employee;
import java.util.LinkedList;

/**
 *
 * @author Phuc Hong Le
 */
public class EmployeeServices {
    
    //fields
    private LinkedList<Employee> list;
    private final int Last_ID;
    //private IDataAccess = new DataAccess
    
    public EmployeeServices(){
        list = dataSore.retrieveEmployeeList();
    }
    
    public void hire(Employee e){
        list.addFirst(e);
    }
    
    public Employee layoff(){
        Employee e = list.poll();
        
        return
    }
    
    public Employee promote(){
        
    }
    
    public boolean release(Employee e){
        boolean removed = list.remove(e);
        if (removed) {
            
        }
        return true;
    }
    
}
