package Conditional;

import java.util.Scanner;

public class example1330 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1 =  str.split(" ");

        int A=Integer.parseInt(str1[0]);
        int B=Integer.parseInt(str1[1]);

        if (A>B){
            System.out.println(">");
        }else if (A==B){
            System.out.println("==");
        }else if(A<B){
            System.out.println("<");
        }
    }
}
