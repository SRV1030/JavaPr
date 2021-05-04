package files;
class Compr{

    int sum(int a,int b){
        return a+b;
    }
    int sum2(int a,int b){
        return a+b;
    }
    float sum2(float a,float b){
        return a+b;
    }
    
}
public class Adder extends Compr {
    public static void main(String[] args) {
        Adder A=new Adder();
        System.out.println(A.sum(4, 5));
        System.out.println(A.sum2(43, 5));
        System.out.println(A.sum2(4.01f, 5.02f));
        
    }
}
