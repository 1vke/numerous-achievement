package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConversionOf1() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("I", rnc.convert(1));
    }
    @Test
    public void testConversionOf5() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("V", rnc.convert(5));
    }
    @Test
    public void testConversionOf10() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("X", rnc.convert(10));
    }
    @Test
    public void testConversionOf50() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("L", rnc.convert(50));
    }
    @Test
    public void testConversionOf100() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("C", rnc.convert(100));
    }
    @Test
    public void testConversionOf500() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("D", rnc.convert(500));
    }
    @Test
    public void testConversionOf1000() {
        RomanNumeralConverter rnc = new RomanNumeralConverter();

        Assertions.assertEquals("M", rnc.convert(1000));
    }
}
