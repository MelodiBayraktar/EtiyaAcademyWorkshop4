package Inheritance;

import Inheritance.EmployeeManager;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        List<Employee> employees = employeeManager.getAll();

        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstname() + " " + employee.getLastname() + ", Department: " + employee.getDepartment());
        }
        System.out.println("**********************************");
        //Add
        Employee newEmployee = new Employee(3, "Ebru", "Bayraktar", "ebru@gmail.com", "123321", " ");
        employeeManager.add(newEmployee);
        System.out.println(" Employee Added:");
        System.out.println("ID: " + newEmployee.getId() + ", Name: " + newEmployee.getFirstname() + " " + newEmployee.getLastname()+ ", Department: " + newEmployee.getDepartment() );
        System.out.println("**********************************");
        //Update
        Employee updatedEmployee = new Employee(1, "Melodi", "Bayraktar", "melodi@hotmail.com", "1213211", "Qa");
        employeeManager.update(updatedEmployee);
        System.out.println("Employee Updated:");
        System.out.println("**********************************");
        //Delete
        employeeManager.delete(3);
        System.out.println("Employee Deleted:");
        System.out.println("**********************************");
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstname() + " " + employee.getLastname()+ ", Department: " + employee.getDepartment());
        }
    }
}
