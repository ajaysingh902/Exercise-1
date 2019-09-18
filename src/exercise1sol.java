import java.util.Scanner;

public class exercise1sol {
    public static void main(String[] args)

    {
//        eight classeight=new eight();
//        classeight.runit();
        exercise classone=new exercise();
//        classone.runit();
        ques2 classtwo=new ques2();
//        classtwo.runit();
        Three classthree=new Three();
//        classthree.runit();
        Four classfour=new Four();
//        classfour.runit();
        five classfive=new five();
//        classfive.runit();
        six classsix=new six();
//        classsix.runit();
        seven classseven=new seven();
//        classseven.runit();
        eight classeight=new eight();
//        classeight.runit();
        nine classnine=new nine();
//        classnine.runit();
        ten classten=new ten();
//        classten.runit();
        System.out.println("which question do you want to play");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        switch (x){
            case 1:
                classone.runit();
                break;
            case 2:
                classtwo.runit();
                break;
            case 3:
                classthree.runit();
                break;
            case 4:
                classfour.runit();
                break;
            case 5:
                classfive.runit();
                break;
            case 6:
                classsix.runit();
                break;
            case 7:
                classseven.runit();
                break;
            case 8:
                classeight.runit();
                break;
            case 9:
                classnine.runit();
                break;
            case 10:
                classten.runit();
                break;
            default:
                System.out.println("the questions are between 0-10");
                break;
        }






    }
}
