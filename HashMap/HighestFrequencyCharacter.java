
import java.util.*;

public class HighestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), 1);
            } else {
                int temp = hm.get(str.charAt(i));
                hm.put(str.charAt(i), temp + 1);
            }
        }
        // System.out.println(hm);
        int mf = Integer.MIN_VALUE;
        char mfc = 'a';
        for (char ch : hm.keySet()) {
            if (hm.get(ch) > mf) {
                mf = hm.get(ch);
                mfc = ch;
            }
        }
        System.out.println(mfc);
    }

}