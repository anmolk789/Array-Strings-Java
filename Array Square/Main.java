import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        obj.nextLine();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<a.length;i++){
            int sum=0;
            int total=0;
            for(int j=0;j<a.length;j++){
                sum=sum+a[j]*a[j];
            }
            total=sum-a[i]*a[i];
            b[i]=total;
            
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}