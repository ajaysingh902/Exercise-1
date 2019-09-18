import java.util.*;
/**
 * counter
 */
// public class counter {


// }

public class exercise {
   

    public static int count(int num)
    {
        if(num==0)
        {
            return num;
        }
        else
        {
            return 1+count(num/10);
        }
    }

    public void runit()
{   
    int pal=0;
    int even=0;
    int sum=0;
    int sumans=0;

    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    // counter cout=new coutner();

    // int b=scn.next.Int();
    
    int x=count(a);
    // while (i>=0) {
        
    // }
    
    int[] array=new int[x];
    
    for(int i=0;i<x;i++)
    {   if(a<10)
        {
            array[i]=a;
        }
        else
        {
        array[i]=a%10;
        
        a=a/10;
        }
    }
    
    for(int j=0;j<x/2;j++)
    {
        if(array[j]!=array[x-j-1])
        {
            pal=1;
        }
    }
    System.out.println(x);
    for(int j=0;j<x;j++)
    {
        if(array[j]%2==0)
        {
            sum+=array[j];
        }
    }
    // for(int j=0;j<x;j++)
    // {
    //     sum +=array[j];
    // }
    if(sum>25)
    {
        sumans=1;
    }
    if(sumans==1)
    {
        System.out.println("sum is greater than 25"+sum);
    }
    else
    {
        System.out.println("sum is less than 25"+sum);
    }
    if(pal==0)
    {
        System.out.println("it is plaindrome");
    }
    else
    {
        System.out.println("it is not palindrome");
    }
   
    
    // System.out.println("pal"+pal+"even"+even+"sumans"+sumans);

}
}