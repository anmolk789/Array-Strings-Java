import java.util.Scanner;
import java.util.Arrays;
public class Authority{
    public static void main (String[] args) {
        String n,f;
        Scanner obj=new Scanner(System.in);
        System.out.println("Inmate's name:");
        n=obj.nextLine();
        System.out.println("Inmate's father's name:");
        f=obj.nextLine();
        n=n.toUpperCase();
        f=f.toUpperCase();
        boolean t=false;
        String g=n.concat(" ").concat(f);
        for(int i=0;i<g.length();i++){
            if(Character.isLetter(g.charAt(i))==true || g.charAt(i)==' ' ){
                t=true;
                
            }else{
                System.out.println("Invalid name");
                System.exit(0);
            }
        }
        System.out.println(g);
    }
}