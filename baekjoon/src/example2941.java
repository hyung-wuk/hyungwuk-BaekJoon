import java.util.Scanner;

public class example2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String[] cAlphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

//        String str = sc.nextLine();
//        String[] strArr = str.split("");
//        String[] cAlArr = new String[str.length()];
//        for(int i=0;i<strArr.length;i++){
//            cAlArr[i] = " ";
//        }
//
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i].equals("c") && strArr[i+1].equals("=")) {
//                cAlArr[i] = "c=";
//            }//c=
//            else if (strArr[i].equals("c") && strArr[i+1].equals("-")) {
//                cAlArr[i] = "c-";
//            }//c-
//            else if (strArr[i].equals("d") && strArr[i+1].equals("z") && strArr[i+2].equals("=")) {
//                cAlArr[i] = "dz=";
//            }//dz=
//            else if (strArr[i].equals("d") && strArr[i+1].equals("-")) {
//                cAlArr[i] = "d-";
//            }//d-
//            else if (strArr[i].equals("l") && strArr[i+1].equals("j")) {
//                cAlArr[i] = "lj";
//            }//lj
//            else if (strArr[i].equals("n") && strArr[i+1].equals("j")) {
//                cAlArr[i] = "nj";
//            }//nj
//            else if (strArr[i].equals("s") && strArr[i+1].equals("=")) {
//                cAlArr[i] = "s=";
//            }//s=
//            else if (!strArr[i-1].equals("d") && strArr[i].equals("z") && strArr[i+1].equals("=")) {
//                cAlArr[i] = "z=";
//            }//z=
//            else if (strArr[i].equals("=") && !strArr[i-1].equals("c") && !strArr[i-1].equals("z") && !strArr[i-1].equals("s")){
//                cAlArr[i] = "=";
//            }
//            else if (strArr[i].equals("-") && !strArr[i-1].equals("c") && !strArr[i-1].equals("d")){
//                cAlArr[i] = "=";
//            }
//            else if (strArr[i].equals("j") && !strArr[i-1].equals("n") && !strArr[i-1].equals("l")){
//                cAlArr[i] = "j";
//            }
//            else{
//                cAlArr[i] = strArr[i];
//            }
//
//            if (i == strArr.length - 1) {
//                if (strArr[i].equals("c") && strArr[i+1].equals("=")) {
//                    cAlArr[i] = "c=";
//                }//c=
//                else if (strArr[i].equals("c") && strArr[i+1].equals("-")) {
//                    cAlArr[i] = "c-";
//                }//c-
//                else if (strArr[i].equals("d") && strArr[i+1].equals("z") && strArr[i+2].equals("=")) {
//                    cAlArr[i] = "dz=";
//                }//dz=
//                else if (strArr[i].equals("d") && strArr[i+1].equals("-")) {
//                    cAlArr[i] = "d-";
//                }//d-
//                else if (strArr[i].equals("l") && strArr[i+1].equals("j")) {
//                    cAlArr[i] = "lj";
//                }//lj
//                else if (strArr[i].equals("n") && strArr[i+1].equals("j")) {
//                    cAlArr[i] = "nj";
//                }//nj
//                else if (strArr[i].equals("s") && strArr[i+1].equals("=")) {
//                    cAlArr[i] = "s=";
//                }//s=
//                else if (!strArr[i-1].equals("d") && strArr[i].equals("z") && strArr[i+1].equals("=")) {
//                    cAlArr[i] = "z=";
//                }//z=
//                else if (strArr[i].equals("=") && !strArr[i-1].equals("c") && !strArr[i-1].equals("z") && !strArr[i-1].equals("s")){
//                    cAlArr[i] = "=";
//                }
//                else if (strArr[i].equals("-") && !strArr[i-1].equals("c") && !strArr[i-1].equals("d")){
//                    cAlArr[i] = "=";
//                }
//                else if (strArr[i].equals("j") && !strArr[i-1].equals("n") && !strArr[i-1].equals("l")){
//                    cAlArr[i] = "j";
//                }
//                else{
//                    cAlArr[i] = strArr[i];
//                }
//                break;
//            }
//        }
//
//        for (int i = strArr.length - 1; i >= 0; i--) {
//            System.out.println(cAlArr[i]);
//        }
    }
}
