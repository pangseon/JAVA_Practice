package Kiosk;

import java.util.Scanner;

public class order extends Menu{


    order[] orders;

    String name;
    int number;
    double price;

    public order(){
        super(1);
        this.orders = new order[10];
    }
    public order(String product_name, double product_price){
        this.name = product_name;
        this.price = product_price;
        this.number=1;
    }
    public void onboard(Menu m){
        System.out.println(m.menus[number].products[number].name);
    }
    public void add_Basket(Menu m){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        m.products_onboard(a);
        System.out.println("추가하실 상품 번호를 입력하세요");
        int choice_product = sc.nextInt();
        orders[number] = new order(m.menus[a-1].products[choice_product-1].name,m.menus[a-1].products[choice_product-1].price);
        this.number++;
    }


    public void order_onboard(int a){
        for (int i = 0 ; i<number;i++){
            if(orders[0].name == null){
                orders[0].name = "empty";
                orders[0].price = 0.0;
            }
            else
                System.out.println(orders[i].name+" |  "+orders[i].price);
        }
    }
    public void purchase(Menu m){

    }
}

