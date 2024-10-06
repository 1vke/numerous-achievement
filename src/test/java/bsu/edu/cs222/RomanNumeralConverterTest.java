package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConversionOf1() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("I", rnc.convert(1));
    }
}
