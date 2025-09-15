import java.util.Scanner;

public class pos_neg_zero {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0){
            System.out.println(n+" is Positive");
        }
        else if(n<0){
            System.out.println(n+" is Negative");
        }
        else{
            System.out.println(n+" is zero");
        }
    }
    
}
