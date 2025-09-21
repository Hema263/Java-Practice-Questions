import java.util.Scanner;

public class left2right {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
           System.out.print(str.charAt(i)+" ");  
        }
        

    }
}
