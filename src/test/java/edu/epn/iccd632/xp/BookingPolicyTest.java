package edu.epn.iccd632.xp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Los estudiantes deben redactar aquí sus pruebas JUnit para HU-01.
 * Escriban primero una prueba que falle (RED), luego la implementación (GREEN).
 */
class BookingPolicyTest {
    @Test
    void validBookingReturnsTrueAndMakesSlotUnavailable() {
        Reservations reservations = new Reservations();

        assertTrue(reservations.isAvailable("A"));
        assertTrue(reservations.book("E01", "A"));
        assertFalse(reservations.isAvailable("A"));
    }
}
