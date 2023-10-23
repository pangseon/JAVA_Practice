package Kiosk_practice;

public class Menu {
    public String name;
    public double price;

    public String info;

    int number;

    public Menu[] menus;

    public Product[] products;

    Order order;

    public Menu(){
        this.number = 0;
        this.menus = new Menu[10];
        this.order = new Order();
    }

    public Menu(String menu_name, String menu_info){
        this.name = menu_name;
        this.info = menu_info;
        this.products = new Product[10];
        this.number = 0;
    }

    public Menu(int i) {
        this.number = 0;
    }

    public void addMenu(String menu_name, String menu_info){
        System.out.println(this.number);
        menus[number] = new Menu(menu_name,menu_info);
        this.number++;
        // https://southernwindblog.tistory.com/16 추후에 배열 밀기를 활용하여

    }

    public void addProduct(String menu_name,String product_name, String product_info, double product_price){
            for(int i =0; i<this.number; i++){
                if (menus[i].name == menu_name){
                    menus[i].products[menus[i].number] = new Product(product_name,product_info,product_price);

                }
        }
    }

    public void onboard(){
        System.out.println(number);
    }
}
