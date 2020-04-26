import java.util.Scanner;
public class Test{
    public static void calculateAverage(int[] age){
        int total=0;
        float avg;
        for(int j=0;j<age.length;j++){
            total=total+age[j];
        }
        int l=age.length;
        avg=(float)total/l;
        System.out.println("The average age is "+String.format("%.2f",avg));
    }
    
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter total no.of employees:");
        n=obj.nextInt();
        obj.nextLine();
        if(n<2){
            System.out.println("Please enter a valid employee count");
            System.exit(0);
        }
        int a[]=new int[n];
        System.out.println("Enter the age for "+n+" employees:");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
            obj.nextLine();
            if(a[i]>40 || a[i]<28){
                System.out.println("Invalid age encountered!");
                System.exit(0);
            }
        }
        calculateAverage(a);
}}