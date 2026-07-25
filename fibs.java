import java.util.*;
public class fibs{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num= sc.nextInt();
        int a =0;
        int b = 1;
        for(int i =0 ; i<num;i++)
        {
            System.out.print(a+" ");
            int temp = a+b;
             a = b;
             b = temp ;
        }
        
    }
}