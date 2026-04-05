import java.util.Scanner;

public class example1157_review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].toUpperCase();
        }// 대문자로 변환

        int[] count = new int[26];
        for (int i = 0; i < str.length; i++) {
            count[str[i].charAt(0)-'A']++;
        }//알파벳별로 나온거 개수 새기

        int max = -1; //max를 count[0]으로 정해놓으면 a가 맥스일 때 ?가 나옴
        char result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char)(i + 'A');
            }
            else if (max == count[i]){
                result = '?';
            }
        }

        System.out.println(result);

    }
}
