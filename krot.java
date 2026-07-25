import java.util.*;
public class krot{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr []= new int[size];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0;i<k;i++)
        {
            int temp = arr[0];
            for(int j = 0;j<size-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[size-1]= temp;

        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
}