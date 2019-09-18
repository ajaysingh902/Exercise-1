import java.util.*;

public class seven
{   public static int count(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else
        {
            return 1+count(num/10);
        }
    }
    public void runit(){
        int sum =0;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int x=count(num);
        int[] array=new int[x];
        for(int i=0;i<x;i++)
        {
            array[i]=num%10;
            num=num/10;
        }
        Arrays.sort(array);
        for(int i=x-1;i>=0;i--)
        {   if(array[i]%2==0)
            {
                sum=sum+array[i];
            }
            System.out.println(array[i]);
        }
        if(sum>15)
        {
            System.out.println("sum of even number"+sum);
            System.out.println("TRUE");
            
        }
        else
        {
            System.out.println("sum of even number"+sum);
            System.out.println("FALSE");
        }
        
    }
}