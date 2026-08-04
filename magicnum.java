import java.util.*;
public class magicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 9) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            num = sum;
        }
        if (num == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
    }

}
