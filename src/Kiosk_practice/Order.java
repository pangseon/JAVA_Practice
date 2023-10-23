package Kiosk_practice;

import javax.swing.text.html.Option;

public class Order extends Menu{

    private int number;

    private String name;
    private double price;
    Order[] orders;
    public Order(){
        super(1);
        this.orders = new Order[10];

    }
    public Order(String name, double price){
        this.name = name;
        this.price = price;
        this.number = 1;
    }
    public void addBasket(Menu m){

    }
    public void purchase(){

    }
    public void cancel(){

    }
    public void addOption(Menu m){
        System.out.println(m.menus[m.number].number);
        m.number++;
        System.out.println(m.number);

    }
}
