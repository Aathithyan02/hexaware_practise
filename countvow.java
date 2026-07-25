import java.util.*;
public class countvow {
    public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
    String lcase = a.toLowerCase();
    int count =0;
    for(int i =0; i<a.length();i++){
        char ch = lcase.charAt(i);
        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            count++;
        }
    }
System.out.print(count);

        

    }

}