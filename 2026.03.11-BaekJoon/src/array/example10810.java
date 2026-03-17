package array;

import java.util.Scanner;

public class example10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //바구니의 개수
        int M = sc.nextInt(); // 실행 횟수
        int[] arr = new int[N+1];

        for (int index = 1; index <= N; index++) {
            arr[index] = 0;
        }//모든 바구니의 개수를 맨처음에 0으로 만들기

        for(int l = 1; l <= M; l++) {
            int i = sc.nextInt(); //i번부터
            int j = sc.nextInt(); //j번까지
            int k = sc.nextInt(); //k번이 적힌 공

            for (int m = i; m <= j; m++) { //i번부터 j번까지
                arr[m] += k; //k번이 적힌 공을 넣는다
                if(arr[m] != 0){ // 이미 바구니안에 공이 있으면
                    arr[m] = k; //공을 빼고 새로 공을 넣는다
                }
            }

        }

        for (int index = 1; index <= N; index++) {
            System.out.println(arr[index]);
        }

    }
}
