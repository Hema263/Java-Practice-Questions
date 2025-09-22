import java.util.Scanner;

public class spyNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        int product=1;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num=num/10;
        }
        if(sum==product){
            System.out.println(temp+" is a spy number");
        }
        else{
            System.out.println(temp+" is not a spy number");
        }
    }
}
