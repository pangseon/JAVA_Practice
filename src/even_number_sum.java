import java.util.Scanner;

public class even_number_sum {
    public static void main(String[]args){
        int answer = 0;
        int arr[] = new int[1000];
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        for (int i = 0; i<1000;i++){
            arr[i]=i*2;
        }
        for(int i = 0; i<arr.length;i++){
            answer = answer + arr[i];
            if(in==arr[i]){
                System.out.println(answer);
                break;
            }
        }
    }
}
