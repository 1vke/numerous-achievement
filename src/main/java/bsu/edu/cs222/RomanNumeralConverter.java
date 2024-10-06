package bsu.edu.cs222;

public class RomanNumeralConverter {
    public String convert(int value) {
        StringBuilder output = new StringBuilder();
        int number = value;

        String[] romanNumerals = {"M", "D", "C", "L", "X", "V", "I"};
        int[] romanNumeralValues = {1000, 500, 100, 50, 10, 5, 1};

        for (int i = 0; i < romanNumerals.length; i++) {
            while (number >= romanNumeralValues[i]) {
                number -= romanNumeralValues[i];
                output.append(romanNumerals[i]);
            }
        }

        return output.toString();
    }
}
