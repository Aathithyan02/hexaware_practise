import java.util.*;
public class emma {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(((a+b)==10)&&((c-d)==3))
        {
           System.out.println(a*b*c*d);
        }
        else
        {
            System.out.println("Not Satisfied");
        }

    }

}
