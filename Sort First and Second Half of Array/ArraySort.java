import java.util.Scanner;
import java.util.Arrays;
public class ArraySort{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of an array:");
        n=obj.nextInt();
        obj.nextLine();
        if(n<=0){
            System.out.println("Array size should be greater than 0");
            System.exit(0);
        }
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
             arr[i]=obj.nextInt();
             obj.nextLine();
        }
        int len=arr.length;
        int firstpart=0;
        int lastpart=0;
        if(len%2==0){
            firstpart=len/2;
            lastpart=len/2;
        }else{
            firstpart=(len+1)/2;
            lastpart=(len-1)/2;
        }
        int arr1[]=new int[firstpart];
        int arr2[]=new int[lastpart];
        for(int i=0;i<firstpart;i++){
            arr1[i]=arr[i];
        }
        int p=0;
        for(int i=firstpart;i<arr.length;i++){
            arr2[p++]=arr[i];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res2[]=new int[lastpart];
        int z=0;
        System.out.println();
        for(int i=arr2.length-1;i>=0;i--){
            res2[z++]=arr2[i];
        }
        int output[]=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            System.out.println();
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(res2[i]);
            System.out.println();
        }
    }
}