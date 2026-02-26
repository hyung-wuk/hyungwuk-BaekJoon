package loopexample;

import java.util.Scanner;

public class example10950 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T =sc.nextInt();
        sc.nextLine(); //<- 남은 엔터 제거

        int i = 1;
        while(i<=T){
            String str=sc.nextLine();
            String[] strArr=str.split(" ");
            int n=Integer.parseInt(strArr[0]);
            int n1=Integer.parseInt(strArr[1]);
            System.out.println(n+n1);
            i++;
        }
    }
}
