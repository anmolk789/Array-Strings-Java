import java.util.Scanner;
public class Shop{
    private String shopName;
    private String shopAddress;
    private String[] products;
    
    public Shop(String s,String t,String[] x){
        this.shopName=s;
        this.shopAddress=t;
        this.products=x;
    }
    public void setShopName(String a){
        this.shopName=a;
    }
    public void setShopAddress(String b){
        this.shopAddress=b;
    }
    public void setProducts(String[] c){
        this.products=c;
    }
    public String getShopName(){
        return this.shopName;
    }
    public String getShopAddress(){
        return this.shopAddress;
    }
    public String[] getProducts(){
        return this.products;
    }
    public boolean checkProductAvailability(String productname){
        boolean b=false;
        for(int i=0;i<getProducts().length;i++){
            if(productname.equalsIgnoreCase(products[i])){
                b=true;
            }
        }
        return b;
    }public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        String a,b;
        System.out.println("Enter the shopname:");
        a=obj.nextLine();
        System.out.println("Enter the address");
        b=obj.nextLine();
        int n;
        System.out.println("Enter number of products:");
        n=obj.nextInt();
        obj.nextLine();
        if(n<=0){
            System.exit(0);
        }
        String k[]=new String[n];
        for(int i=0;i<k.length;i++){
            k[i]=obj.nextLine();
        }
        Shop ss=new Shop(a,b,k);
        System.out.println("Enter the product to be searched:");
        String l=obj.nextLine();
        boolean tt=true;
        tt=ss.checkProductAvailability(l);
        if(tt){
            System.out.println("Product is available at "+ss.getShopName()+","+ ss.getShopAddress()+".");
        }else{
            System.out.println("Product is not available at "+ss.getShopName()+","+ ss.getShopAddress()+".");
        }
    }
}