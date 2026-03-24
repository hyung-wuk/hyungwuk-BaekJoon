import java.util.Scanner;

public class example1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (0<= N && N<=99){
            if (N<10){
                N=N*10;
            }
            int num1 = N/10;
            int num2 = N%10;
            int num3 = num1+num2;
            int cycle = 0;

            while (true){
                num1 = num2;
                num2 = num3%10;
                num3 = num1+num2;
                cycle++;

                if((num1*10 + num2)==N){
                    break;
                }

            }

            System.out.println(cycle);
        }
        else{
            return;
        }
    }
}
