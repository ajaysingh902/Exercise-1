import java.util.*;
public class ten
{
    public void runit() {
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        System.out.print(text);
        int a=scan.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=a;j<text.length();j++)
            {
                System.out.print(text.charAt(j));
            }
        }
    
    }
}
