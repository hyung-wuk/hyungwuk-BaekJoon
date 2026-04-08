import java.util.Scanner;

public class example1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] wordarr = new String[N];

        for(int i = 0; i < N; i++){
            wordarr[i] = sc.nextLine();
        } //입력

        boolean[] checker = new boolean[N];
        for(int i = 0; i < N; i++){
            checker[i] = false;
        }//체커 생성

        for(int i = 0; i < N; i++){
            checker[i] = groupWord(wordarr[i]);
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            if(checker[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean groupWord(String word){
        String[] _word =word.split("");
        boolean check = true;
        String[] arr = new String[_word.length];
        for(int i = 0; i < arr.length; i++){
            arr[i]="";
        }

        for(int i = 0; i < _word.length; i++){
            if (i==0){
                arr[i] = _word[i];
            }
            if(i!=0 && !_word[i].equals(_word[i-1]) && in(_word[i], arr)){
                check = false;
            }//판정 순서 중요
            if(i!=0 && !_word[i].equals(_word[i-1])){
                arr[i] = _word[i];
            }//이미 전에 나왔는지 먼저 확인, 그리고나서 기록
        }
        return check;
    }

    static boolean in (String s, String[] arr){
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(s)){
                result = true;
            }
        }
        return result;
    }
}
