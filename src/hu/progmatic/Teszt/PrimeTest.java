package hu.progmatic.Teszt;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

        @org.junit.jupiter.api.Test
        void isPrime() {
            assertFalse(Prime.isPrime(1));
            assertFalse(Prime.isPrime(4));
            assertFalse(Prime.isPrime(12));
            assertFalse(Prime.isPrime(200));


            assertTrue(Prime.isPrime(7));
            assertTrue(Prime.isPrime(199));
            assertTrue(Prime.isPrime(149));
            assertTrue(Prime.isPrime(53));
        }
    }

