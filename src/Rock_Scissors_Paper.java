import java.util.Scanner;

public class Rock_Scissors_Paper {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int com =(int)(Math.random()*3)+1;
        int user = sc.nextInt();
        switch (user-com){
            case -1: case 2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
            case 1: case -2:
                System.out.println("당신이 졌습니다.");
        }





    }
}
