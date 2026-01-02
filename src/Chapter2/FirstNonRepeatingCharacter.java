package Chapter2;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    void main() {
        String str = "swissh";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non Repeating Character: "+ch);
                break;
            }
        }
    }
}
