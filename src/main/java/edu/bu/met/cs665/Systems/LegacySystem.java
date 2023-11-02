package edu.bu.met.cs665.Systems;

public class LegacySystem implements CustomerData_USB {
    // Implementation of the printCustomer method from CustomerData_USB interface
    public void printCustomer(int customerId) {
        // Prints a message indicating customer data printing from the Legacy System
        System.out.println("Printing customer data from Legacy System for ID: " + customerId);
    }

    // Implementation of the getCustomer_USB method from CustomerData_USB interface
    public void getCustomer_USB(int customerId) {
        // Prints a message indicating customer data retrieval from the Legacy System
        System.out.println("Retrieving customer data from Legacy System for ID: " + customerId);
    }
}
