

import java.util.Scanner;

public class example5597_correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] check = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            check[num] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
}
