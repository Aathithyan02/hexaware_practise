import java.util.*;
public class removdup{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
    
        }   
        Set<Integer> n = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            n.add(arr[i]);
        }
        for(int ele :n)
        {
           System.out.println(ele);
        }
      
    }
}