import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;


        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = romanToInt.get(s.charAt(i));


            if (i < n - 1 && currentVal < romanToInt.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
