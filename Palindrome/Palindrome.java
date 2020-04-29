import java.util.Scanner;
public class Palindrome{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String s;
        System.out.println("Enter the word :");
        s=obj.nextLine();
        String output="";
        int length=s.length();
        if(s.matches("[a-zA-Z]*$")){
            for(int i=length-1;i>=0;i--){
                output=output+s.charAt(i);
            }
        }else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(s.equalsIgnoreCase(output)){
            System.out.println(s +" is a Palindrome");
        }else{
            System.out.println(s+" is not a Palindrome");
        }
    }
}