package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void op() {
        Assertions.assertEquals(9, new Sample().op(Sample.Operation.ADD, 7, 2));
        assertEquals(21, new Sample().op(Sample.Operation.MULT, 7, 3));
    }

    @Test
    void fact() {
        assertEquals(6, new Sample().fact(3));
        assertThrows(IllegalArgumentException.class,() -> new Sample().fact(-1));

    }

}
