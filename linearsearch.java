import java.util.*;
public class linearsearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] =sc.nextInt();
        }
        int target = sc.nextInt();
        int index =-1;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==target)
            {
                index =j;
                break;
            }
        }
       if(index!=-1){
        System.out.println(index+"found");}
    else{
        System.out.println(index+"not found");}
    }
}