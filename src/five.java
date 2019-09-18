import java.util.*;
public class five
{

    public void runit()
    {   int sum=0;
        Scanner scan=new Scanner(System.in);
        // String input=scan.nextLine();
        int number=scan.nextInt();
        scan.nextLine();
        // System.out.println("hello darkness");
        String[] num=new String[number];
        // System.out.println();
        
        
        for(int i=0;i<number;i++)
        {
            num[i]=scan.nextLine();
            String input=num[i];
            if(!input.matches("\\d+"))
            {
                System.out.println("please type only number ");
            }
            // System.out.println();
        }
        
        for(int i=0;i<number;i++)
        {
            sum = sum+Integer.parseInt(num[i]);
            System.out.println("hello"+num[i]);
        }
        
        System.out.println(sum);

    }
}