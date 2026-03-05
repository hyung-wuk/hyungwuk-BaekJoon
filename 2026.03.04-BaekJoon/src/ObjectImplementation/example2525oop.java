package ObjectImplementation;

import java.util.Scanner;

public class example2525oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int A = Integer.parseInt(n[0]);
        int B = Integer.parseInt(n[1]);

        int C = sc.nextInt();

        oven o = new oven();
        o.setoven(A,B,C);
        int h = o.geth();
        int m = o.getm();

        System.out.println(h + " " + m);

    }
}
class oven {
    int A;
    int B;
    int C;

    public void setoven (int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }


    public int geth(){
        int sum = A * 60 + B + C;
        int h = sum / 60;
        if (h%24==0){
            int h1 = 0;
            return h1;
        }
        return h;
    }

    public int getm(){
        int sum = A * 60 + B + C;
        int m = sum%60;
        return m;
    }

}
