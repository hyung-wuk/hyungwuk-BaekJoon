package InputOutputExample;

import java.util.Scanner;

public class example2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int firstLine = a*(b%10);
        int SecondLine = (a*((b%100)-(b%10) ))/10;
        int thirdLine = (a*(b/100));
        int result = firstLine + SecondLine*10 + thirdLine*100;

        System.out.println(firstLine);
        System.out.println(SecondLine);
        System.out.println(thirdLine);
        System.out.println(result);

    }

}
