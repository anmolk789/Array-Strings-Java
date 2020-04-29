import java.util.Scanner;
public class Course{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter no of course:");
        n=obj.nextInt();
        if(n<=0){
            System.out.println("Invalid Range"); 
            System.exit(0);
        }
        System.out.println("Enter course names:");
        String s[]=new String[n];
        for(int i=0;i<s.length;i++){
            s[i]=obj.next();
        }
        System.out.println("Enter the course to be searched:");
        String find;
        find=obj.next();
        for(int j=0;j<s.length;j++){
            if(find.equals(s[j])){
                System.out.println(find+" course is available");
                System.exit(0);
            }
        }
        System.out.println(find+" course is not available");
    }
}