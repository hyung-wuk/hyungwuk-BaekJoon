

//import java.util.Scanner;
//
//public class example2675 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for (int i = 1; i <= T; i++) {
//            int R = sc.nextInt();
//            sc.nextLine(); //공백 제거
//            String S = sc.nextLine();
//            String[] arr = S.split("");
//
//            for (int j = 0; j <arr.length; j++) {
//                for (int k = 0; k < R; k++) {
//                    System.out.print(arr[j]);
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}

import java.util.Scanner;

public class example2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
