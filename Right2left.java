import java.util.Scanner;

public class Right2left {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int reverse=n;
        int dig,rev=0;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("Reverse:"+" "+ rev+" ");
        
    }
    
}
