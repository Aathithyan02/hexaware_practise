import java.util.*;
public class desc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] =sc.nextInt();

        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
