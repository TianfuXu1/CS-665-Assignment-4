package edu.bu.met.cs665;
import org.junit.Test;
import edu.bu.met.cs665.Systems.LegacySystem;
import static org.mockito.Mockito.*;

public class LegacySystemTest {

    @Test
    public void testPrintCustomer() {
        LegacySystem legacySystem = mock(LegacySystem.class);

        // Test the printCustomer method
        legacySystem.printCustomer(123);

        // Verify that the printCustomer method was called with the correct argument
        verify(legacySystem).printCustomer(123);
    }

    @Test
    public void testGetCustomer_USB() {
        LegacySystem legacySystem = mock(LegacySystem.class);

        // Test the getCustomer_USB method
        legacySystem.getCustomer_USB(456);

        // Verify that the getCustomer_USB method was called with the correct argument
        verify(legacySystem).getCustomer_USB(456);
    }
}
