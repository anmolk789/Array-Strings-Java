import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:");
        n=obj.nextInt();
        obj.nextLine();
        if(n>0){
        int a[]=new int[n];
        int num=0;
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
            obj.nextLine();
            if(a[i]<10 && a[i]%2==1){
                num=num*10+a[i];
            }}
            if(num==0){
                System.out.println("Single digit odd number is not found in the array");
            }else{
        System.out.println(num);
            }
}
        else{
            System.out.println("Invalid array size");
        }
    
            
    }
}