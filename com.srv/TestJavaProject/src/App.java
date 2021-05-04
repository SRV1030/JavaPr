import java.util.Scanner;
import testers.fibo;



public class App {
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        fibo ob = new fibo(); 
       long n= sc.nextLong(); 
        System.out.println(ob.findLastDigit(n)); 
        
    } 
}
