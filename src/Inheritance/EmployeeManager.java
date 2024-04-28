package Inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee1  =new Employee(1,"Melodi", "Bayraktar", "melodi@gmail.com", "abc","Yazılım");
        Employee employee2 = new Employee(2,"Beste", "Bayraktar", "melodi@gmail.com", "abc","İnsan Kaynakları");
        employees.add(employee1);
        employees.add(employee2);
    }

    //Add
    public void add(Employee employee) {
        employees.add(employee);
    }

    //Delete
    public void delete(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }


    //Update
    public void update(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == updatedEmployee.getId()) {
                employee.setFirstname(updatedEmployee.getFirstname());
                employee.setLastname(updatedEmployee.getLastname());
                employee.setEmail(updatedEmployee.getEmail());
                employee.setPassword(updatedEmployee.getPassword());
                employee.setDepartment(updatedEmployee.getDepartment());
                return;
            }
        }
    }


    //GetAll
    public List<Employee> getAll() {
        return employees;
    }

    //GetById
    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
