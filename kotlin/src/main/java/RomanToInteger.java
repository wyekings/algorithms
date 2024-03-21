public class RomanToInteger {

    public int romanToInt(String s) {
        int sum = 0;
        int previous = 0;
        int current;
        for (int i = s.length() - 1; i >= 0; i--) {
            current = charToInt(s.charAt(i));
            if (current < previous) {
                sum -= current;
            } else {
                sum += current;
            }
            previous = current;
        }
        return sum;
    }

    private int charToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
