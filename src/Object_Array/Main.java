package Object_Array;

class A2{
    // 인스턴스 변수
    int a=3;
    int b;

    static int po = 123;

    public A2(int q,int w){
        this.a=q;
        this.b=w;
    }



    // 클래스 변수
    static int c =12;
    static int d =13;


    static int add (int a, int b) {
        return a*b;
    }
    int add(){
        return a+b;
    }
    int asd(int a, int b){
        System.out.println(a);
        this.a=a;
        this.b=b;
        return 0;
    }
    int qwer(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        return 0;
    }
}

public class Main {
    public static void main(String[] args){

        A2 a = new A2(1,2);
        A2 b = new A2(2,3);
        A2 c= new A2(3,4);
        System.out.println("--------------------"+c.a);
        b.asd(23,56);
        b.qwer();
        System.out.println(a.qwer());
        System.out.println(a.asd(1,2));
        System.out.println(a.qwer());

    }

}
