package UniqueWords;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Uniquwords{
    public static void main(String[] args) throws FileNotFoundException{
        File f= new File("D:/Java/UniqueWords/data.txt"); 
        Scanner sc= new Scanner(f);
        Set<String> hs=new HashSet<String>();  
        while(sc.hasNext()){
            String s=sc.next();           
            // System.out.println(s);
           hs.add(s);
        }
        System.out.println(hs.size());
        sc.close();
    }

    
}
