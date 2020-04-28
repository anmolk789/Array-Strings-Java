import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String s;
        String n="";
        int index=0;
        s=obj.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                n=n+ch;
                s=s.replace(ch,' ');
            }
        }
        char a[]=n.toCharArray();
        Arrays.sort(a);
        for(int i=a.length;i>0;i--){
            System.out.print(a[i-1]);
        }
        }
    }

