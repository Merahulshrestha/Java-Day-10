import java.util.Scanner;
public class App {
    // WAP  to reverse any number
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse: ");
        int num = sc.nextInt();
        while(num>0){
            rev = (rev*10) + num %10;
            num = num/10;
        } 

        System.out.print("REversed number: " + rev);

    }
}
