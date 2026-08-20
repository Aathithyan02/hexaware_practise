import java.util.*;
public class noofdiv {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count += 1; // e.g., 6 * 6 = 36 (only count 6 once)
                } else {
                    count += 2; // e.g., 2 and 18 for 36 (count both)
                }
            }
        }

        System.out.println("Number of divisors: " + count);
        sc.close();
    }
}