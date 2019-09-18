import java.util.*;
public class ques2
{
    public void runit()
    {
        Scanner scan=new Scanner(System.in);
        int a;
        a=scan.nextInt();
        if(a%2==0&&a<30&&a>20)
        {
            System.out.println("TOM");
        }
        if(a%2!=0&&a<30&&a>20)
        {
            System.out.println("Jerry");
        }
    }
}
