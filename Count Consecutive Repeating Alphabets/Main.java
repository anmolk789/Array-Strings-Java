import java.util.Scanner;
class Main{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        String nw="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            nw=nw+ch;
            s=s.replace(ch,' ');
            
        }
        int l=nw.length();
        char temp;
        char[] arr=nw.toCharArray();
        int n;
        if(l%2==0){
            n=l/2;
        }
        else{
            n=(l+1)/2;
        }
        for(int k=0;k<l;k++)
        {
            if(k<n)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[k]>arr[j])//for descending order
                    {
                        temp=arr[k];
                        arr[k]=arr[j];
                        arr[j]=temp;
                    }
                    
                }
            }
            else{
                for(int j=n;j<l;j++)
                {
                    if(arr[k]<arr[j])
                    {
                        temp=arr[k];
                        arr[k]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        
        System.out.println(arr);
    }
}