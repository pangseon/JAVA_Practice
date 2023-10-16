import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        System.out.println(a);

        switch (a){
            case 1:
                System.out.println("합격입니다");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("불합격입니다.");
                break;
        }

    }
}
