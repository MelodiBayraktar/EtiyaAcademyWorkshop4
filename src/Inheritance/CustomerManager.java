package Inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        customers = new ArrayList<>();
        Customer customer1 = new Customer(1,"Melodi", "Bayraktar", "melodi@gmail.com", "abc","444333222","İstanbul");
        Customer customer2 = new Customer(2,"Beste", "Bayraktar", "melodi@gmail.com", "abc","444333222","İstanbul");
        customers.add(customer1);
        customers.add(customer2);
    }
    //Add
    public void add(Customer customer) {
        customers.add(customer);
    }

    //Delete
    public void delete(int id) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    //Update
    public void update(Customer updatedCustomer) {
        for (Customer customer : customers) {
            if (customer.getId() == updatedCustomer.getId()) {
                customer.setFirstname(updatedCustomer.getFirstname());
                customer.setLastname(updatedCustomer.getLastname());
                customer.setEmail(updatedCustomer.getEmail());
                customer.setPassword(updatedCustomer.getPassword());
                customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
                customer.setAddress(updatedCustomer.getAddress());
                return;
            }
        }
    }

    //GetAll
    public List<Customer> getAll() {
        return customers;
    }

    //GetById
    public Customer getById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
