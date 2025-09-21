import java.util.Scanner;

public class SumOfOddEvenNum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sumEven=sumEven+i;
            }
                
            else{
                sumOdd=sumOdd+i;
            }
            
        }
            System.out.print(sumEven);
            System.out.print(" "+sumOdd);
    }
}
