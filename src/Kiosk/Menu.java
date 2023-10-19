package Kiosk;

public class Menu {

        // menu[0] => burger , menu[1] = ice
        // burger, info
        // 인스턴스 각 개체마다 고유의 값을 특징
        // burger_product
        // int number = 0 ;
        // method => number 9;
        // m[0].product , m[1].product , m[2], m[3]
        // String[] a = new String [10]
        // m[0] => burger ,
        // menu name, info, number
        // m[0] -> burger
        // product[0] shack
        // product[1] chese
        // m[0] -> burger
        product[] products;
        String name;
        String info;
        int number;
        Menu[] menus;
        public Menu(String menu_name,String menu_info){
                this.name = menu_name;
                this.info = menu_info;
                this.number=0;
                this.products= new product[10];
        }
        public Menu(){
                this.number=0;
                this.menus = new Menu[10];
        }
        public void addMenu(String menu_name, String menu_info){
                menus[number] = new Menu(menu_name,menu_info);
                System.out.println(menus[number].name+menus[number].info);
                this.number++;
                System.out.println(number);
        }
        public void addProduct(String menu_name, String product_name,String product_info, double price){
                for (int i=0; i<this.number; i++){
                        if(menu_name == menus[i].name){
                                menus[i].products[menus[i].number] = new product(product_name,product_info,price);
                                menus[i].number++;
                        }
                }
        }
}
