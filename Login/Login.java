import java.util.Scanner;
public class Login{
    private String userName;
    private String password;
    
    public Login(String a,String b){
        this.userName=a;
        this.password=b;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean validate(){
        if(getUserName().equals("john")&&getPassword().equals("123abc")){
            return true;
        }
        else
            return false;
        
    }
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String name,pass;
        System.out.println("Enter the username:");
        name=obj.nextLine();
        System.out.println("Enter the password:");
        pass=obj.nextLine();
        Login l=new Login(name,pass);
        boolean res=true;
        res=l.validate();
        if(res){
            System.out.println("Valid user");
        }else
            System.out.println("Invalid user");
        }
}