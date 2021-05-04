package files;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class Node{
    char c;
    int data;
    Node left;
    Node right;
}



class Comp implements Comparator<Node>{
    public int compare(Node a,Node b){
        return a.data-b.data;
    }
}

public class Huffman158
{   static String[] o=new String[123];
    public static void printCode(Node root, String s)
    {
 
        if (root.left== null && root.right== null && (Character.isLetter(root.c) || root.c==' ')) {
            o[(int)root.c]=s;
            // System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String s= sc.nextLine();
	    int a[]=new int[123];
	    int n=0,z=0;
	    for(int i=0;i<s.length();i++) a[(int)s.charAt(i)]++;
	    for(int i=0;i<123;i++) if(a[i]!=0) n++;
	    char[] charArray=new char[n];
	    int[] charfreq=new int[n];
	    for(int i=0;i<123;i++){
	        if(a[i]!=0){
	            charArray[z]=(char) i;
	            charfreq[z]=a[i];
	           // System.out.println(charArray[z] + " " + charfreq[z]);
	            z++;
	        }
	    }
	    
        PriorityQueue<Node> q=new PriorityQueue<Node>(n, new Comp());
        for(int i=0;i<n;i++){
            Node temp=new Node();
            temp.c=charArray[i];
            temp.data=charfreq[i];
            temp.left=null;
            temp.right=null;
            // System.out.println(temp.c + " " + temp.data);
            q.add(temp);
        }
        Node head=null;
        while(q.size()>1){
            Node x=q.peek();
            q.poll();
            Node y=q.peek();
            q.poll();
            Node f=new Node();
            f.c='-';
            f.data=x.data+y.data;
            f.left=x;
            f.right=y;
            head=f;
            q.add(f);
        }
        printCode(head, "");
        String sx="";
        for(int i=0;i<s.length();i++)sx+=o[(int)s.charAt(i)];
        System.out.println(sx);
	}
}
