package Object_Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int arr[] = new int[10];
        for(int i = 0;i<arr.length-1;i++){
            for (int j =0; j<arr.length-1-i;j++){
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}
