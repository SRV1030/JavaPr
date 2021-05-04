package files;
class Outer{
    int a;
    int b;
    float c;
    static String s;
    public Outer(){
        a=5;
    }
    public Outer(int y, int x){
        a=y;
        b=x;
    }
    public Outer(int a,int b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    static{
        s="same for all";
    }
    class Inner{
        void display(){
            System.out.println(a+" "+b+" "+c+" "+s);
        }
    }
}




public class StaticConstructorDemo{
    public static void main(String[] args){
        Outer obj1= new Outer();
        Outer obj2=new Outer(2,3,4.4f);
        Outer.Inner objInner= obj1.new Inner();// to use inner class
        Outer.Inner obj3Inner=obj2.new Inner();
        objInner.display();
        obj3Inner.display();        
    }
}