import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println(num +" Even");
        }
        else{
            System.out.println(num +" Odd");
        }
    }
}
