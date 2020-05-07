import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        int sum=0;
        int index=0;
        n=obj.nextInt();
        obj.nextLine();
        if(n<3){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
            obj.nextLine();
        }
        for(int i=0;i<n-2;i++){
            if(sum<Math.abs(arr[i]-arr[i+2])){
                sum=Math.abs(arr[i]-arr[i+2]);
                if(arr[i]<arr[i+2]){
                    index=i;
                }else{
                    index=i+2;
                }
            }
        }
        System.out.println(index);
    }
}