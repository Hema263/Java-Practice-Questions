import java.util.Scanner;

public class maxandmin {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    
    if(a>b){
        System.out.print("Max="+ a);
    }
    else{
        System.out.println("Max="+ b);
    }
    
    if(a<b){
        System.out.println("Min=" + a );
    }
    else{
        System.out.println("Min="+ b);
    }
    
  }   
}
