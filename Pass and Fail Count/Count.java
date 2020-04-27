import java.util.Scanner;
public class Count{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the no of subjects:");
        n=obj.nextInt();
        int a[]=new int[20];
        if(n<=0){
            System.out.println("Invalid input range");
            System.exit(0);
        }
        int pass=0;
        int fail=0;
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
            obj.nextLine();
            if(a[i]<50){
                fail++;
            }if(a[i]>=50){
                pass++;
            }
        }
        if(pass==n){
            System.out.println("Ram passed in all subjects");
            System.exit(0);
        }else if(fail==n){
            System.out.println("Ram failed in all subjects");
        }else{
            System.out.println("Ram passed in "+pass +" subjects and failed in "+fail+" subjects");
        }
        
    }
}