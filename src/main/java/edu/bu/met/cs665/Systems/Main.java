/**
 * Name: TianFu Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/01/2023
 * File Name: Main.java
 * Description: The `Main` class serves as the entry point for the program. It demonstrates the implementation of an adapter pattern to integrate a Legacy System with a modern HTTPS-based system. Through the creation of instances and method calls, it showcases the successful adaptation and interaction between the two systems.
 */

package edu.bu.met.cs665.Systems;

/**
 * This is the Main class.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Legacy System
        CustomerData_USB legacySystem = new LegacySystem();

        // Create an adapter for the Legacy System
        CustomerData_HTTPS adapter = new LegacySystemAdapter(legacySystem);

        // Test the adapter
        adapter.printCustomer(123);
        adapter.getCustomer_HTTPS(456);
    }
}

