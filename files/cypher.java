
package files;
import java.util.Scanner;

public class cypher{
    String decoder(String s1){
        int l=s1.length();
        String s2="";
        for(int i=0;i<l;i++){
            if(Character.isUpperCase(s1.charAt(i))){
                char ch=(char)(s1.charAt(i)-3);
                if(ch<'A') s2+=(char) (ch-'A'+'Z'+1);
                else s2+=ch;
            }else{
                char ch=(char)(s1.charAt(i)-3);
                if(ch<'a') s2+=(char) (ch-'a'+'z'+1);
                else s2+=ch;
            }
        }
        return s2;
    }



    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        cypher ob=new cypher();
        String s1= s.nextLine();
        System.out.println(ob.decoder(s1));

    }
}