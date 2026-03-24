

import java.util.Scanner;

public class example5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[30];

        for (int i = 0; i < 28; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            int min = n[i];
            int bucket;
            for (int j = i + 1; j < n.length; j++) {
                if (n[j] < min) {
                   bucket = min;
                   min = n[j];
                   n[j] = bucket;
                   n[i] = min;
                }
            }
        } // 입력된 수들 작은수에서 큰수로 정렬


        int[] num = new int[2];
        for (int i = 0; i < n.length; i++) {
            if (i==n.length-1){
                break;
            }

            if (num[0]==0) {
                if (n[i + 1] - n[i] == 2) {
                    num[0] = (n[i] + n[i + 1]) / 2;
                }
            }
            if (num[0]!=0){
                if (n[i+1]-n[i] == 2){
                    num[1] = (n[i]+n[i+1])/2;
                }
            }

        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
