package dataaccess;

import domain.Employee;
import java.util.LinkedList;

/**
 * This is the interface that will be used by other method in the project
 * 
 * @author Phuc Hong Le
 */
public interface IDataAccess {
    
    boolean saveEmployeeList(LinkedList<Employee> list);
    
    LinkedList<Employee> retrieveEmployeeList();
}
