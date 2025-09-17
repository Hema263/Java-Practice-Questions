import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        boolean Pnum=true;
        if(num<=1){
            Pnum=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                     Pnum=false;
                     break;
                }
            }
        }
        if(Pnum){
            System.out.println(num+" is a Prime Number");
        }
        else{
             System.out.println(num+" is not a Prime Number");
        }
    }
}
