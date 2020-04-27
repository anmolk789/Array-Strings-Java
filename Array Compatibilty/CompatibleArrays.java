import java.util.Scanner;
public class CompatibleArrays{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the size for First array:");
        n1=obj.nextInt();
        obj.nextLine();
        if(n1<1){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int a1[]=new int[n1];
        System.out.println("Enter the elements for First array:");
        for(int i=0;i<a1.length;i++){
            a1[i]=obj.nextInt();
            obj.nextLine();
        }
        System.out.println("Enter the size for Second array:");
        n2=obj.nextInt();
        obj.nextLine();
        if(n2<1){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int a2[]=new int[n2];
        int count=0;
        System.out.println("Enter the elements for Second array:");
        for(int j=0;j<a2.length;j++){
          a2[j]=obj.nextInt();
          obj.nextLine();
        }
        if(n1!=n2){
            System.out.println("Arrays are Not Compatible");
            System.exit(0);
        }
        for(int k=0;k<a1.length;k++){
            if(a1[k]>=a2[k]){
                count++;
            }}
        if(count==a1.length){
            System.out.println("Arrays are Compatible");
        }else{
            System.out.println("Arrays are Not Compatible");
        }
    }
}