package edu.bu.met.cs665;

import org.junit.Test;
import edu.bu.met.cs665.Systems.CustomerData_USB;
import edu.bu.met.cs665.Systems.LegacySystemAdapter;

import static org.mockito.Mockito.*;

public class LegacySystemAdapterTest {

    @Test
    public void testPrintCustomer() {
        CustomerData_USB legacySystem = mock(CustomerData_USB.class);
        LegacySystemAdapter adapter = new LegacySystemAdapter(legacySystem);

        // Mock the behavior of printCustomer to simulate printing
        doNothing().when(legacySystem).printCustomer(123);

        // Test the adapter
        adapter.printCustomer(123);

        // Verify that the printCustomer method was called with the correct argument
        verify(legacySystem).printCustomer(123);
    }

    @Test
    public void testGetCustomer_HTTPS() {
        CustomerData_USB legacySystem = mock(CustomerData_USB.class);
        LegacySystemAdapter adapter = new LegacySystemAdapter(legacySystem);

        // Mock the behavior of getCustomer_USB to simulate retrieval
        doNothing().when(legacySystem).getCustomer_USB(456);

        // Test the adapter
        adapter.getCustomer_HTTPS(456);

        // Verify that the getCustomer_USB method was called with the correct argument
        verify(legacySystem).getCustomer_USB(456);
    }
}
