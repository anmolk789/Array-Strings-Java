import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        boolean counter=true;
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            if(counter){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            counter=!counter;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}