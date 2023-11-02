package edu.bu.met.cs665;


import org.junit.Test;

import edu.bu.met.cs665.Systems.CustomerData_HTTPS;
import edu.bu.met.cs665.Systems.CustomerData_USB;
import edu.bu.met.cs665.Systems.LegacySystemAdapter;
import static org.mockito.Mockito.*;

public class AdapterTest {

    @Test
    public void testAdapter() {
        // Create a mock instance of the Legacy System
        CustomerData_USB legacySystem = mock(CustomerData_USB.class);

        // Create an adapter for the Legacy System
        CustomerData_HTTPS adapter = new LegacySystemAdapter(legacySystem);

        // Test the adapter
        adapter.printCustomer(123);
        adapter.getCustomer_HTTPS(456);

        // Verify that the methods of the legacy system were called
        verify(legacySystem).printCustomer(123);
        verify(legacySystem).getCustomer_USB(456);
    }

    public static void main(String[] args) {
        AdapterTest test = new AdapterTest();
        test.testAdapter();
    }
}