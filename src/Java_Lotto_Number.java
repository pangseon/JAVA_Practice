public class Java_Lotto_Number {
    public static void main(String[]  args){
        int [] num = new int [45];
        for(int i = 0; i<num.length;i++ ){
            // 45개의 번호가 배열안에 생성되었다
            num[i]=i+1;
        }
        int change=0;
        int j = 0;

        for (int i = 0;i<7;i++){
          j=(int)(Math.random()*45);
          // num[i]의 값을 change에 저장한다.
          change = num[i];
          // num[j]의 값을 num[i]에 저장한다. j의 값은 0이다.
          num[i]=num[j];
          // 위에서 할당받았던 num[i]의 값을 num[j]에 저장한다.
          num[j]=change;
        }
        for (int i = 0; i<7;i++){
            System.out.println(num[i]);
        }
    }

}
