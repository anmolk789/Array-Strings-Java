import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int n1,n2;
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        obj.nextLine();
        int a1[]=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=obj.nextInt();
            obj.nextLine();
            if(a1[i]<0){
                System.out.println("No Negative Elements");
                System.exit(0);
            }
        }
        n2=obj.nextInt();
        obj.nextLine();
        int a2[]=new int[n2];
        if(n1!=n2){
            System.out.println("Invalid array size");
            System.exit(0);
        }
         else {  for(int j=0;j<a2.length;j++){
                a2[j]=obj.nextInt();
                obj.nextLine();
                if(a2[j]<0){
                    System.out.println("No Negative Elements");
                    System.exit(0);
                }
            }
        }
        int b1[]=new int [100];
        int b2[]=new int [100];
        int count=0;
        for(int k=0;k<n1;k++){
            for(int l=0;l<n2;l++){
                if(a1[k]==a2[l]){
                    b1[count]=k+1;
                    b2[count]=l+1;
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("No matching scores");
        }else{
        for(int p=0;p<count;p++){
            System.out.print("("+b1[p]+","+b2[p]+")");
        }}
    }
}