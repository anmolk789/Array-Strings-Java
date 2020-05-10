import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        int i;
        int min=10000000;
        n=obj.nextInt();
        int discount[]=new int[n];
        int arr[]=new int[n];
        String name[]=new String[n];
        for(i=0;i<n;i++){
            name[i]=obj.next();
        }
        for(i=0;i<n;i++){
            String out[]=name[i].split(",");
            discount[i]=(Integer.valueOf(out[2])*Integer.valueOf(out[1])/100);
            if(min>discount[i]){
                min=discount[i];
            }
        }
        int p=0;
        for(i=0;i<n;i++){
            if(discount[i]==min){
                arr[p++]=i;
            }
        }
        arr=Arrays.copyOf(arr,p);
        for(i=0;i<arr.length;i++){
            String out[]=name[arr[i]].split(",");
            if(i==arr.length-1){
                System.out.print(out[0]);
            }else{
                System.out.print(out[0]+",");
            }
        }
    }
}