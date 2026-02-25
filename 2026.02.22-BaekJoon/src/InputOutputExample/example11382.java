package InputOutputExample;

import java.util.Scanner;

public class example11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] num = n.split(" ");

        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int num3 = Integer.parseInt(num[2]);

        System.out.println(num1+num2+num3);
    }
}
