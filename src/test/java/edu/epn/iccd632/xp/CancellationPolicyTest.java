package edu.epn.iccd632.xp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/** HU-02: cancelación de una reserva por su titular. */
class CancellationPolicyTest {
    @Test
    void onlyTheOwnerCanCancelAReservedSlot() {
        CancellationPolicy policy = new CancellationPolicy();
        Map<String, String> ownerBySlot = new HashMap<>();
        ownerBySlot.put("A", "E01");

        assertTrue(policy.cancel(ownerBySlot, "E01", "A"));
        assertFalse(ownerBySlot.containsKey("A"));
    }

    @Test
    void secondStudentCannotCancelAnUnreservedSlot() {
        CancellationPolicy policy = new CancellationPolicy();
        Map<String, String> ownerBySlot = new HashMap<>();
        ownerBySlot.put("A", "E01");

        assertTrue(policy.cancel(ownerBySlot, "E01", "A"));
        assertTrue(policy.cancel(ownerBySlot, "E02", "A"));
        assertTrue(ownerBySlot.isEmpty());
    }
}
