package Conditional;

import java.util.Scanner;

public class example2525 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String[] num=str.split(" ");
        int A=Integer.parseInt(num[0]);
        int B=Integer.parseInt(num[1]);

        int C=sc.nextInt();
        int C1=C/60;
        int C2=C%60;

        A=A+C1;
        B=B+C2;
        if (B > 59) {
            A = A + 1;
            B = B - 60;
        }

        if (A > 23) {
            A = A - 24;
        }

        System.out.println(A + " " + B);

//        int total = A * 60 + B + C;
//
//        total %= 1440;
//
//        A = total / 60;
//        B = total % 60;
//
//        System.out.println(A + " " + B); //시간문제는 무조건 분으로 변환해서 처리!!!


//        if (B>59){
//            A=A+1;
//            B=B-60;
//            if (A>23){
//                A=0;
//                System.out.println(A+" "+B);
//                return;
//            }
//            System.out.println(A+" "+B);
//            return;
//        }else if (A>23){
//            A=A-24;
//            B=B-60;
//            if (B<0){
//                B=60+B;
//                System.out.println(A+" "+B);
//                return;
//            }
//            System.out.println(A+" "+B);
//            return;
//        }
//        System.out.println(A+" "+B); // 내 처참한 오답...


    }
}
