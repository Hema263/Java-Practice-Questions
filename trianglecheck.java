import java.util.Scanner;

public class trianglecheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a==b && a==c && b==c){
            System.out.println("Equilateral Triangle");
        }
        else if(  a==c && b!=c || a==b && b!=c || a!=c && a==b ){
            System.out.println("Isosceles Triangle");
        }
        else if(a!=b && b!=c && c!=a){
            System.out.println("Scalene Triangle");
        }
    }
}
