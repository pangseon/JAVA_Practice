package Kiosk_practice;

public class Product extends  Menu{


    public Product(){

    }


    public Product(String product_name, String product_info, double product_price) {
        super();
        super.name = product_name;
        super.info = product_info;
        super.price = product_price;
    }
    public void printProduct(){
        System.out.println(this.name+"|"+this.price+"|"+this.info);
    }
}
