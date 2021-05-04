package files;
import java.util.Scanner;

public class Fibo{     
    void fib(int f[]){ 
        
        f[0] = 0; 
        f[1] = 1; 
        for (int i = 2; i <= 59; i++) 
            f[i] = (f[i - 1] + f[i - 2]) % 10; 
    } 
    int findLastDigit(long n) 
    { 
        int f[] = new int[60]; 
        fib(f); 
        int index = (int)(n % 60L);  
        return f[index]; 
    }  
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
       Fibo ob = new Fibo(); 
       long n= s.nextLong(); 
        System.out.println(ob.findLastDigit(n)); 
        
    } 
} 
