
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class Copyfile {
 
	public static void main(String[] args) throws Exception{
        File f= new File("D:/Java/data.txt"); 
        Scanner sc= new Scanner(f);
			
			FileWriter fw = new FileWriter("D:/Java/output.txt", true);
			String s;
            while(sc.hasNext()){
               s=sc.next();           
                fw.write(s); 
				fw.flush();
            }
            System.out.println("file copied");
            sc.close();
			fw.close();
		}
	}
