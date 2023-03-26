package ro.sda.advanced._4_ArrayList;
// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bank ing = new Bank("ING Bank");
        ing.addBranch("Piata Victoriei");
        ing.addBranch("Piata Unirii");

        ing.addCustomer("Piata Victoriei", "Catalin", 10.2);
        ing.addCustomer("Piata Victoriei", "Mihai", 20.1);
        ing.addCustomer("Piata Unirii", "Andrei", 100);
        ing.addCustomer("Piata Unirii", "Ana", 50);
        ing.addCustomer("Piata Unirii", "Andrei", 50);

        ing.addCustomerTransaction("Piata Victoriei", "Mihai", 34);
        ing.addCustomerTransaction("Piata Unirii", "Mihai", 200);
        ing.addCustomerTransaction("Piata Unirii", "Andrei", 40);
        ing.addCustomerTransaction("Piata Unirii", "Ana", 40);

        ing.listAllCustomers("Piata Unirii", true);
        ing.listAllCustomers("Piata Victoriei", true);
    }

}
