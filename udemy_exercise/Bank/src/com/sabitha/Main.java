package com.sabitha;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        if (bank.addBranch("Irving")) {
            System.out.println("Irving branch created");
        }

        bank.addCustomer("Irving", "Sherlock", 200);
        bank.addCustomer("Irving", "John", 175);
        bank.addCustomer("Irving", "Moriarty", 500);

        bank.addBranch("Frisco");
        bank.addCustomer("Frisco", "Joan", 500);

        bank.addCustomerTransaction("Irving", "Shelock", 50);
        bank.addCustomerTransaction("Irving", "Sherlock", 80);
        bank.addCustomerTransaction("Irving", "John", 100);

        bank.listCustomers("Irving", true);
        bank.listCustomers("Frisco", true);

        bank.addBranch("Addison");

        if (!bank.addCustomer("Addison", "Walter", 5)) {
            System.out.println("Error Addison branch does not exist");
        }

        if (!bank.addBranch("Irving")) {
            System.out.println("Irving branch already exists");
        }

        if (!bank.addCustomerTransaction("Irving", "Brenda", 500)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Irving", "Sherlock", 200)) {
            System.out.println("Customer Sherlock already exists");
        }
    }
}

