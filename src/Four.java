import java.util.*;
public class Four
{

    public void runit()
    {
        // String regex="\\d+";
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();

        if(input.matches("[a-zA-Z]+"))
        {

                if(input.charAt(0)=='a'||input.charAt(0)=='e'||input.charAt(0)=='i'||
                input.charAt(0)=='o'||input.charAt(0)=='u')
                {
                    System.out.println("VOWEL");
                
                }
                else
                {
                    System.out.println("consonent");
                    
                }
               

        }
        else
        {
            System.out.println("this string have any number ");
            
        }
        // Pattern pattern = Pattern.compile(regex);
        // System.out.println(pattern.matcher("1").matches());
        // System.out.println(pattern.matcher("12345").matches());
        // System.out.println(pattern.matcher("123456789").matches());

    }
}





