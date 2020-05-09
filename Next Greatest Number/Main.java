import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
          Scanner obj=new Scanner(System.in);
          int i=0;
          String s;
          s=obj.next();
          char out[]=s.toCharArray();
          for(i=s.length()-1;i>0;i--){
              if(out[i]>out[i-1]){
                  break;
              }}
            if(i==0){
                  System.out.println(s);
              }
            else{
                  char x=out[i-1];
                  int min=i;
                  for(int j=i;j<s.length();j++)
                if(out[j]>x && out[j]<out[min])
                    min =j;
                    char temp=out[min];
                    out[min]=out[i-1];
                    out[i-1]=temp;
                  Arrays.sort(out,i,s.length());
                  for(char c:out)
                      System.out.print(c);
              }
    }     
    }
