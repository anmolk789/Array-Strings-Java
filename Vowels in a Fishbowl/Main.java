import java.util.*;
public class Main{
    public static void main (String[] args) {
        String words[][]=new String[5][5];
        Scanner obj=new Scanner(System.in);
        int vowelcount[][]=new int[5][5];
        int i=0;
        int j=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                words[i][j]=obj.next();
            }
        }
        int count=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                for(int k=0;k<words[i][j].length();k++){
                    char ch=words[i][j].charAt(k);
                    char chh=Character.toLowerCase(ch);
                    if(chh=='a' || chh=='e' || chh=='i' || chh=='o' || chh=='u'){
                        count++;
                    }
            }vowelcount[i][j]=count;
            count=0;
        }
    }
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            int n=vowelcount[i][j];
            if(n>5){
                vowelcount[i][j]=8;
            }else if(n==5){
                vowelcount[i][j]=6;
            }else if(n==4){
                vowelcount[i][j]=4;
            }else if(n==3){
                vowelcount[i][j]=3;
            }else if(n==2){
                vowelcount[i][j]=1;
            }
            else if(n==1){
                 vowelcount[i][j]=0;
            }else{}  
            }
        }
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            System.out.print(vowelcount[i][j]+"\t");
        }
        System.out.println();
    }
    int sum=0;
    int arr[]=new int[5];
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            sum=sum+vowelcount[i][j];
        }
        arr[i]=sum;
        sum=0;
    }
    for(i=0;i<5;i++){
        System.out.println((i+1)+"\t"+arr[i]);
    }
    int max=0;
    int index=0;
    String print="";
    for(i=0;i<5;i++){
        if(max<arr[i] && arr[i]!=0){
            max=arr[i];
            
        }
    }for(i=0;i<5;i++){
        if(max==arr[i] && arr[i]!=0){
            print=print+"student "+String.valueOf((i+1))+" ";
        }
    }
    if(max==0){
        System.out.println("No one has got any points");
        System.exit(0);
    }else
    System.out.println("The winner is "+print+"with points "+max);
    }
}