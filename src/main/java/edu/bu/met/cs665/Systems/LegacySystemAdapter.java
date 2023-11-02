package edu.bu.met.cs665.Systems;

public class LegacySystemAdapter implements CustomerData_HTTPS {
    private CustomerData_USB legacySystem;

    // Constructor to initialize the adapter with a Legacy System instance
    public LegacySystemAdapter(CustomerData_USB legacySystem) {
        this.legacySystem = legacySystem;
    }

    // Implementation of the printCustomer method from CustomerData_HTTPS interface
    public void printCustomer(int customerId) {
        // Delegates the printing operation to the Legacy System
        legacySystem.printCustomer(customerId);
    }

    // Implementation of the getCustomer_HTTPS method from CustomerData_HTTPS interface
    public void getCustomer_HTTPS(int customerId) {
        // Delegates the HTTPS retrieval operation to the Legacy System
        legacySystem.getCustomer_USB(customerId);
    }
}
