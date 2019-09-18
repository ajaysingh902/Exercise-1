import java.util.*;

public class eight {
    public void runit() {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int target=10;
        if(num>target)
        {
            System.out.println("taget is less than this number");

        }
        else if (num<target)
        {
System.out.println("taget is morethan this number");
            
        }
        else
        {
            System.out.println("this is the right number");
        }
    }
    
}