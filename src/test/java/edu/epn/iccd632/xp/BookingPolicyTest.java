package edu.epn.iccd632.xp;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class BookingPolicyTest {
    @Test
    void validBookingReturnsTrueAndMakesSlotUnavailable() {
        Reservations reservations = new Reservations();

        assertTrue(reservations.isAvailable("A"));
        assertTrue(reservations.book("E01", "A"));
        assertFalse(reservations.isAvailable("A"));
    }

    @Test
    void secondBookingReturnsFalseAndPreservesFirstOwner() {
        Map<String, String> ownerBySlot = new HashMap<>();
        BookingPolicy policy = new BookingPolicy();
        assertTrue(policy.book(ownerBySlot, "E01", "A"));

        boolean secondBooking = policy.book(ownerBySlot, "E02", "A");

        assertAll(
                () -> assertFalse(secondBooking),
                () -> assertEquals("E01", ownerBySlot.get("A"))
        );
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"X", " ", "a"})
    void invalidSlotReturnsFalseWithoutCreatingBooking(String slot) {
        Map<String, String> ownerBySlot = new HashMap<>();

        assertFalse(new BookingPolicy().book(ownerBySlot, "E01", slot));
        assertTrue(ownerBySlot.isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void invalidStudentReturnsFalseAndLeavesSlotAvailable(String studentId) {
        Reservations reservations = new Reservations();

        assertFalse(reservations.book(studentId, "A"));
        assertTrue(reservations.isAvailable("A"));
    }
}