import java.util.*;
public class Main{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x =a,y=b;
    while (b!=0)
      {
        int temp = b;
        b = a%b;
        a=temp;
      }
    int hcf = a;
    System.out.println(hcf);
    int lcm = Math.abs(x*y)/hcf;
    System.out.println(lcm);
  }
}

  
