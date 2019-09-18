import java.util.*;

public class nine {
    public void runit() {
        Scanner scan = new Scanner(System.in);
        StringBuffer bfr=new StringBuffer();
        bfr.append(scan.nextLine());
        for(int i=bfr.length()-1;i>=0;i--)
        {
            System.out.print(bfr.charAt(i));
        }
    }

}