
package files;
public class Comp{

    int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int a=5;
        Comp b=new Comp();
        System.out.println(b.fact(a));

    }
}