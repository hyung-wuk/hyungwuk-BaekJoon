

import java.io.*;

public class example15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());; // 아래 처럼 반복문에서 T를 사용하려면 maub 메소드 지역변수로 선언을 해야한다.
        // 예외처리를 꼭 해주어야한다
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            // 버퍼리더는 스캐너처럼 입력하면 자동으로 끊어서 입력해주지 않아 스플릿으로 꼭 나누어줘야한다
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bw.write(Integer.toString(A+B) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
