import java.util.Scanner;

public class example1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String[] wordarr;
        wordarr = new String[word.length()];
        wordarr = word.split("");
        wordarr = toUppercaseArray(wordarr);

        countAlphabet(wordarr);
    }

    public static String[] toUppercaseArray(String[] wordarr){
        for (int i = 0; i < wordarr.length; i++) {
            if (wordarr[i].equals(wordarr[i].toLowerCase())){
                wordarr[i] = wordarr[i].toUpperCase();
            }
        }//대문자로 변환

        return wordarr;
    }

    public static void countAlphabet(String[] wordarr){
        int[] cntarr = new int[wordarr.length];

        String[] repo;
        repo = new String[wordarr.length];
        for (int i = 0; i < wordarr.length; i++) {
            repo[i] = " ";
        }//레포의 null값을 위해 공백 채우기

        String[] maxAlphabetarr = new String[wordarr.length];

        for (int i = 0; i < wordarr.length; i++) {
            if (i == wordarr.length-1){
                break;
            }//오버플로우를 방지하기 위함
            if (in(wordarr[i],repo)){
                i++;
            }//만약 인덱스의 알파벳이 레포안에 이미 있다면 다음인덱스로 넘어가기
            for (int j = i+1; j < wordarr.length; j++) {
                if (wordarr[i].equals(wordarr[j])){
                    cntarr[i]++;
                }
            }
            repo[i] = wordarr[i];
        }

        int max=0;
        for (int i = 0; i < cntarr.length; i++) {
            if (cntarr[i]>max){
                max=cntarr[i];
            }
        }

        for (int i = 0; i < cntarr.length; i++) {
            if (cntarr[i]==max){
                maxAlphabetarr[i]=repo[i];
            }
        }

        if(maxAlphabetarr[1]!=null){
            System.out.println("?");
        }
        else{
            System.out.println(maxAlphabetarr[0]);
        }

    }

    public static boolean in (String w, String[] repo){
        boolean result = false;
        for (int i = 0; i < repo.length; i++) {
            if (repo[i].equals(w)){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }
}
