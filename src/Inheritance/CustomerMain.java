package Inheritance;

import Inheritance.CustomerManager;

import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        List<Customer> customers = customerManager.getAll();

        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstname() + " " + customer.getLastname());
        }
        System.out.println("**********************************");
        //Add
        Customer newCustomer = new Customer(3, "Ebru", "Bayraktar", "ebru@gmail.com", "abc", "3433344343", "İstanbul");
        customerManager.add(newCustomer);
        System.out.println("Customer Added");
        System.out.println("**********************************");
        //Update
        Customer updatedCustomer = new Customer(1, "Melodi", "Bayraktar", "melodi@hotmail.com", "123123", "54534324", "Muğla");
        customerManager.update(updatedCustomer);
        System.out.println("Customer Updated");
        System.out.println("**********************************");
        //Delete
        customerManager.delete(3);
        System.out.println("Customer Deleted:");
        System.out.println("**********************************");
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstname() + " " + customer.getLastname());
        }
    }
}
