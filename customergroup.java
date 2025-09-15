import java.util.Scanner;
public class customergroup {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        int gender=scan.nextInt();
        if(age<25 && gender==1){
            System.out.println("Group 1");
        }
        else if(age<25 && gender==2){
            System.out.println("Group 2");
        }
        else if(age>25 && age<45 && gender==1){
            System.out.println("Group 3");
        }
        else if(age>25 && age<45 && gender==2){
            System.out.println("Group 4");
        }
        else if(age>45 && gender==1 || gender==2){
            System.out.println("Group 5");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
