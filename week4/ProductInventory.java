package week4;

public class ProductInventory {
    static class Product{
    private String code;
    private String name;
    private double unitprice;
    private int quantity;
    private static int productCount=0;
    public Product(String code,String name,double unitprice){
        this(code,name,unitprice,0);
    }
    public Product(String code,String name,double unitprice,int quantity){
        if(code==null|| code.isBlank()|| name==null|| name.isBlank()){
            throw new IllegalArgumentException("Code and name cannot be blank");

        }
        if(unitprice<=0){
            throw new IllegalArgumentException("unit price cannot be blank");
        }
        if(quantity<0){
            throw new IllegalArgumentException("unit price cannot be -ve");
        }
        this.code=code;
        this.name=name;
        this.unitprice=unitprice;
        this.quantity=quantity;
        productCount++;
    }

    public void restock(int amount){
        if (amount<=0){
            throw new IllegalArgumentException("amount cannot be negative");
        }
        quantity=quantity+amount;
    }

    public boolean sell(int amount)
    {
         if (amount<=0 || amount>quantity){
        return false;
        }
    
        quantity-=amount;
        return true;
    }

    public double getInventoryValue()
    {
        return unitprice*quantity;  
    }

    public static int getproductCount()
    {
        return productCount;
    }
    
    @Override
    public String toString()
    {
       return "Product{" +
                "code='" + code + '\'' +", name='" + name + '\'' +", unitPrice=" + unitprice +", quantity=" + quantity +'}';
    }

public static void main(String Args[]){
Product p1=new Product("P101","Laptop",55000,5);
Product p2=new Product("P102","Keyboarc",65000,5);
  p2.restock(15);
System.out.println(p1);
System.out.println(p2);
System.out.println("laptop inventory value:"+p1.getInventoryValue());
System.out.println("Keyboard inventory value:"+p2.getInventoryValue());
System.out.println("total products created:"+getproductCount());
  
    }
}
}
