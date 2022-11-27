import java.io.*;
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n % 2 == 0) {
            return powercal(x, n);
        } else {
            return x * powercal(x, n - 1);
        }
    }

    public static int powercal(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        int ans = power(x, n / 2);
        return ans * ans;
    }

}