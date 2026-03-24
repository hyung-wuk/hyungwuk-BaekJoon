

import java.util.Scanner;

public class example10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];

        for (int index = 1; index <= N; index++) {
            arr[index]=index;
        } //각 바구니 마다 순서 부여 1~N번까지

        for(int l = 1; l <= M; l++){ //M번 역순을 실행
            int i = sc.nextInt(); //i부터
            int j = sc.nextInt(); //j까지

            int line = j;

            for(int k = i; k <= j; k++){
                int save = arr[k];
                arr[k] = arr[line];
                arr[line] = save;
                line--;
                if(k==line){//N이 홀수
                    break;
                }
                if((line-k) == 1){ //N이 짝수
                    break;
                }
            }
        }

        for(int index = 1; index <= N; index++){
            System.out.print(arr[index]+" ");
        }
    }
}
