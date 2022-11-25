import java.io.*;
import java.util.*;

public class Gce {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            hm.put(a1[i], 1);
        }
        for (int i = 0; i < n2; i++) {
            if (hm.get(a2[i]) != null && hm.get(a2[i]) == 1) {
                hm.put(a2[i], 0);
                System.out.println(a2[i]);
            }
        }
    }

}