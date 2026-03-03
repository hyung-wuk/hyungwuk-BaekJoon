package poortypeexample.loop;

import java.util.Scanner;

public class example25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalprice = sc.nextInt();
        int count = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int inputP =  sc.nextInt();
            int inputC = sc.nextInt();
            sum += inputP * inputC;
        }

        if (totalprice == sum) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
