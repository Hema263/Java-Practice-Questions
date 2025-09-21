import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(n%sum==0){
            System.out.println(n+ " is a Harshad Number");
        }
        else{
            System.out.println(n +" is not a harshad Number");
        }
        
    }
}
