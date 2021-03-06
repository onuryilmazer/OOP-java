package week1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Week1Tests {
    @Test
    public void testFibonacci() {
        assertEquals(0, Week1.fibonacci(0));
        assertEquals(1, Week1.fibonacci(1));
        assertEquals(1, Week1.fibonacci(2));
        assertEquals(2, Week1.fibonacci(3));

        assertEquals(8, Week1.fibonacci(6));
    }

    @Test
    public void testProst() {
        assertEquals(0, Week1.prost(0));
        assertEquals(0, Week1.prost(1));
        assertEquals(1, Week1.prost(2));
        assertEquals(3, Week1.prost(3));
        assertEquals(6, Week1.prost(4));
        assertEquals(10, Week1.prost(5));
    }
}