import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String s;
        s=obj.nextLine();
        String ch[]=new String[s.length()];
        ch=s.split(" ");
        String result[]=new String[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i].length()>i+1){
                result[i]=ch[i].substring(0,i+1)+ch[i].substring(i+1).toUpperCase();
            }else{
                result[i]=ch[i];
            }
        }
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
        
        
    }
}