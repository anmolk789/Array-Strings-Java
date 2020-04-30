import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
         String s;
         s=obj.nextLine();
         String n="";
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch!=' '){
                 n=n+ch;
                 s=s.replace(ch,' ');
            }
        }
       // System.out.println(n);
        int len=n.length();
        int firstpart=0;
        int lastpart=0;
        if(len%2==0){
            firstpart=len/2;
            lastpart=len/2;
        }else{
            firstpart=(len+1)/2;
            lastpart=(len-1)/2;
        }
        //System.out.println(firstpart);
        //System.out.println(lastpart);
        char res[]=n.toCharArray();
        char res1[]=new char[firstpart];
        char res2[]=new char[lastpart];
        for(int i=0;i<firstpart;i++){
            res1[i]=res[i];
        }
        int p=0;
        for(int j=firstpart;j<res.length;j++){
            res2[p]=res[j];
            p++;
    
        }
        Arrays.sort(res1);
        Arrays.sort(res2);
        String first="";
        String last="";
        for(int i=res1.length-1;i>=0;i--){
            first=first+res1[i];
        }
        for(int i=0;i<res2.length;i++){
            last=last+res2[i];
        }
        System.out.println(first+last);    
    } 
}
