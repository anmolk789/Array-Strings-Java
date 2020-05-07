import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        String s;
        Scanner obj=new Scanner(System.in);
        s=obj.nextLine();
        String a[]=s.split(" ");
        int b[]=new int[a.length];
        int max=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            b[i]=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i].equals(a[j])){
                    b[i]++;
                    count++;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(max<b[i]){
                max=b[i];
                
            }
        }
        if(count==0){
            System.out.println("No repetition of words");
        }else{
            for(int i=0;i<b.length;i++){
                if(b[i]==max){
                    System.out.println(a[i]);
                }
            }
        }
    }
}