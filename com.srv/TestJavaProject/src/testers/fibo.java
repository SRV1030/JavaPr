package testers;

public class fibo{     
    void fib(int f[]){ 
        
        f[0] = 0; 
        f[1] = 1; 
        for (int i = 2; i <= 59; i++) 
            f[i] = (f[i - 1] + f[i - 2]) % 10; 
    } 
    public int findLastDigit(long n) 
    { 
        int f[] = new int[60]; 
        fib(f); 
        int index = (int)(n % 60L);  
        return f[index]; 
    }  
    
} 

