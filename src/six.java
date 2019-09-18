import java.util.*;
public class six
{
    public void runit()
    {   Scanner scan=new Scanner(System.in); 
        String hello=scan.nextLine();
        if(hello.matches("[a-z]+"))
        {
            System.out.println("this contains lowercase");
        }
        // else
        // {
        //     System.out.println("if is not getting called");
        // }
        if(hello.matches("[A-Z]+"))
        {
            System.out.println("this contains capital");
        }
        if(hello.matches("\\d+"))
        {
            System.out.println("this contains number");
        }
        //other digits is left
        //  Pattern pattern = Pattern.compile(hello);
        // System.out.println(pattern.matcher("1").matches());
        // System.out.println(pattern.matcher("12345").matches());
        // System.out.println(pattern.matcher("123456789").matches());
    }
}
