package Conditional;

import java.util.Scanner;

public class example2884 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] num=str.split(" ");
        int H=Integer.parseInt(num[0]);
        int M=Integer.parseInt(num[1]);

        if (M>=45){
            M=M-45;
            System.out.println(H +" "+ M);
        }
        else if (M<45){
            M = 60+(M-45);
            H = H-1;
            if (H<0){
                H= 24+H;
                System.out.println(H +" "+ M);
                return ;
            }
            System.out.println(H +" "+ M);

        }
    }
}
