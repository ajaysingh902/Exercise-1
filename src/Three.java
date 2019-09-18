import java.util.*;
public class Three
{
    public void runit(){
    
        Scanner scan=new Scanner(System.in);
        int a;
        a=scan.nextInt();
        for(int i=1;i<=a;i++)
        {   
            for(int j=1;j<=i;j++)
            {
            System.out.print(i);
            }
        }
    }

}