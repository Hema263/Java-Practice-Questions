import java.util.Scanner;

public class divisibleby3and5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        if (a%3==0  && a%5==0 ) {
           System.out.println(a+" is divisible by 3 and 5"); 
        }
        else{
            System.out.println(a+" is not divisible 3 and 5");
        }
        
    }
}
