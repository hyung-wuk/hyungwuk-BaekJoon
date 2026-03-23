import java.util.Scanner;

public class example8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[][] strs = new String[T][];

        for (int i = 0; i < T; i++) {
            String[] ox = sc.next().split("");
            strs[i] = ox;
        }

        for (int i = 0; i < T; i++) {
            int totalscore = 0;
            int score = 0;
            for (int j = 0; j<strs[i].length;j++){
                if (strs[i][j].equals("O")){
                    score++;
                    totalscore += score;
                }
                else if (strs[i][j].equals("X")){
                    score = 0;
                }
            }
            System.out.println(totalscore);
        }
    }
}
