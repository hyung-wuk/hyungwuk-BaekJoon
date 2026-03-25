import java.util.Scanner;

public class example2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int reverse_n1 = reverse(n1);
        int reverse_n2 = reverse(n2);

        if (reverse_n1 > reverse_n2) {
            System.out.println(reverse_n1);
        }
        else if (reverse_n1 < reverse_n2) {
            System.out.println(reverse_n2);
        }

    }

    public static int reverse(int n) {
        String nstring = Integer.toString(n);
        String numarray[] = new String[3];
        String reverse_array[] = new String[3];

        numarray = nstring.split("");

        reverse_array[0] = numarray[2];
        reverse_array[1] = numarray[1];
        reverse_array[2] = numarray[0];

        int result = Integer.parseInt(reverse_array[0])*100 + Integer.parseInt(reverse_array[1])*10 +  Integer.parseInt(reverse_array[2]);
        return result;
    }
}
