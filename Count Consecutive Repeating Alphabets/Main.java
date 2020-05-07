import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        String s;
        Scanner obj=new Scanner(System.in);
        s=obj.nextLine();
        int index=0;int i=0;
        char ch[]=s.toCharArray();
        while(i<ch.length){
            int j=i;
            while(j<ch.length && ch[j]==ch[i]){
                j++;
            }
            ch[index++]=ch[i];
            if(j-i>1){
                String res=j-i+"";
                for(char c:res.toCharArray()){
                    ch[index++]=c;
                }
            }        
        i=j;
    }
    String output="";
    for(int k=0;k<index;k++){
        output=output+ch[k];
    }
    System.out.println(output);
}}
