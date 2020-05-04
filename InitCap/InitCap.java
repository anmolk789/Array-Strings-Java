import java.util.Scanner;
public class InitCap{
     public static void main (String[] args) {
         Scanner obj=new Scanner(System.in);
         String s;
         System.out.println("Enter the String:");
         s=obj.nextLine();
         String n="";
         int count=0;
         String p[]=s.split(" ");
         for(int i=0;i<p.length;i++){
             if(Character.toUpperCase(p[i].charAt(0))==p[i].charAt(0)){
                 count++;
             }}
        if(count==p.length){
            System.out.println("First character of each word is already in uppercase");
            System.exit(0);
        }
        for(int i=0;i<p.length;i++){
             char arr[]=p[i].toCharArray();
             for(int j=0;j<arr.length;j++){
                 if(j==0){
                 char ch=Character.toUpperCase(arr[j]);
                 n=n+ch;
             }else{
                 n=n+arr[j];
             }
             
         }
         n=n.concat(" ");
     }
     System.out.println(n);
}
}