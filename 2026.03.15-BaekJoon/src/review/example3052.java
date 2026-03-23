package review;

import java.util.Scanner;

public class example3052 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            n[i]=sc.nextInt() % 42;
        } //입력값을 42로 나눈 나머지를 배열n에다가 순서대로 저장

        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max=n[i];
            }
        }//나머지들중 최댓값을 찾음

        boolean[] b = new boolean[max+1]; //나머지의 최댓값보다 길이가 1큰 불린 배열 생성 만약 나머지의 최댓값이 10이면 배열의 길이가 11인 불린 배열을 만드는 거임 그러면 인덱스가 0~10까지 잇음!!
        for (int i = 0; i < n.length; i++) {
            b[n[i]]=true;
        }//나머지 값과 똑같은 불린 배열의 인덱스값을 true로 설정

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                count++;
            }
        } //불린 배열들중 true인 것들의 갯수 새기
        System.out.println(count);

    }

}
