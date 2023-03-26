package ro.sda.advanced._4_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    private List<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String customerName, double initialAmount) {
        if (customers.contains(new Customer(customerName, initialAmount))) {
            throw new RuntimeException("Client already exist");
        }
        customers.add(new Customer(customerName, initialAmount));
    }

    public void addCustomerTransaction(String customerName, double amount) {
        //initial amount doesnt matter because in Customer class we have implemented equals and hashcode
        //which check only if the customer names are equal
        Customer search = new Customer(customerName, 0);
        if (customers.contains(search)) {
            Customer found = customers.get(customers.indexOf(search));
            found.addTransaction(amount);
        } else {
            throw new RuntimeException("Customer doesnt exist... ");
        }
    }
}
