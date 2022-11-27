import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(a, 0, x));
    }

    public static int firstIndex(int[] a, int idx, int x) {
        if (idx == a.length - 1) {
            if (a[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }

        if (a[idx] == x) {
            return idx;
        } else {
            return firstIndex(a, idx + 1, x);
        }
    }

}