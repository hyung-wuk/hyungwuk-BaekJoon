import java.util.Scanner;

public class example2941_review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split("");
        int cnt = 0;
        for (int i = 0; i <strArr.length; i++) {
            if (i+1 < strArr.length && strArr[i].equals("c") && strArr[i+1].equals("=")) {
                i = i+1;
                cnt++;
            }//c=
            else if (i+1 < strArr.length && strArr[i].equals("c") && strArr[i+1].equals("-")) {
                i = i+1;
                cnt++;
            }//c-
            else if (i+2 < strArr.length && strArr[i].equals("d") && strArr[i+1].equals("z") && strArr[i+2].equals("=")) {
                i = i+2;
                cnt++;
            }//dz=
            else if (i+1 < strArr.length && strArr[i].equals("d") && strArr[i+1].equals("-")) {
                i = i+1;
                cnt++;
            }//d-
            else if (i+1 < strArr.length && strArr[i].equals("l") && strArr[i+1].equals("j")) {
                i = i+1;
                cnt++;
            }//lj
            else if (i+1 < strArr.length && strArr[i].equals("n") && strArr[i+1].equals("j")) {
                i = i+1;
                cnt++;
            }//nj
            else if (i+1 < strArr.length && strArr[i].equals("s") && strArr[i+1].equals("=")) {
                i = i+1;
                cnt++;
            }//s=
            else if (i+1 < strArr.length && strArr[i].equals("z") && strArr[i+1].equals("=")) {
                i = i+1;
                cnt++;
            }
            else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
