import java.util.*;
public class Numerology{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String[][] set1={{"A","B","C","D","E","F","G","H","I","J","K","L","M"},
                            {"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}};
        int[][] set2={{1,2,3,4,5,8,3,5,1,1,2,3,4},
                    {5,7,8,1,2,3,4,6,6,6,5,1,7}};
        String s;
        System.out.println("Enter your name:");
        s=obj.next();
        int j,k;
        int sum=0,count=0;
        for(int i=0;i<s.length();i++){
            String check=String.valueOf(s.charAt(i));
            if(Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i)) || check.equals(" ")){
                count++;
                break;
            }
            for(j=0;j<2;j++){
                for(k=0;k<13;k++){
                    if(check.equals(set1[j][k])){
                        sum += set2[j][k];
                    }
                }
            }
            
        }
        if(count==1){
            System.out.println("Invalid name");
            System.exit(0);
        }else{
            System.out.println("Your numerology no is:"+sum);
        }
}}