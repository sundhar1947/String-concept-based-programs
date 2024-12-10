public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int[] romanValues = new int[256];
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;
        int total = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int current = romanValues[s.charAt(i)];
            if (i + 1 < length && current < romanValues[s.charAt(i + 1)]) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
}

