import java.util.Scanner;

public class alpnumsplchcheck{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("Alphabets");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Numbers");
        }
        else {
            System.out.println("Special Characters");
        }
       
    }
}