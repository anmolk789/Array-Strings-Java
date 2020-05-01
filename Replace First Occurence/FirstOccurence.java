import java.util.Scanner;
import java.util.Arrays;
public class FirstOccurence{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String s;
        System.out.println("Enter the string:");
        s=obj.nextLine();
        char search;
        System.out.println("Enter the character to be searched:");
        search=obj.next().charAt(0);
        int index=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(search==s.charAt(i)){
                index=i;
                count++;
                break;
            }
        }
        
        char replace;
        System.out.println("Enter the character to replace:");
        replace=obj.next().charAt(0);
        if(count==0){
            System.out.println("character not found");
            System.exit(0);
        }
        char ch[]=s.toCharArray();
        ch [index]=replace;
        String output="";
        for(int i=0;i<ch.length;i++){
            output=output+ch[i];
        }
        System.out.println(output);
    }
}