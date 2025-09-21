import java.util.Scanner;

public class perfectSq {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=(int)Math.sqrt(n);
            if(a*a==n){
                System.out.println(n+" is a Perfect Square");
            }
            else{
                System.out.println(n+" is not a Perfect Square");
            }
        }
    }

