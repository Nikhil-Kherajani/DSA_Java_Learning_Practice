import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n, num, k);
    }

    public static void solve(int n, int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < k) {
                pq.add(arr[i]);
            } else {
                if (pq.peek() < arr[i]) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        // since output strictly needed in reverse order
        ArrayList<Integer> list = new ArrayList<>();
        while (pq.size() > 0) {
            list.add(pq.remove());
        }

    }
}