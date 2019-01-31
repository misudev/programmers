import java.util.Arrays;
// 시간초과 인듯....
public class MySort {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

        char[] charArr = new char[strings.length];

        for(int i = 0; i < strings.length; i++){
            charArr[i] = strings[i].charAt(n);
        }

        for (int i = 1; i < strings.length; i++) {

            // 기준
            char c = charArr[i];
            String s = strings[i];
            // 비교할 대상
            int index = i - 1;

            while (index >= 0 && c < charArr[index]) {
            // 비교대상이 큰 경우 오른쪽으로 밀어냄
                strings[index + 1] = strings[index];
                index--;
            }
        // 기준값 저장
            strings[index + 1] = s;
        }
        return strings;
    }
    public static void main(String[] args){
        String[] arr = new String[]{"sun", "bed", "car"};
        String[] arr2 = new String[]{"abce", "abcd", "cdx"};
        String[] answer = solution(arr, 1);
        String[] answer2 = solution(arr2, 2);
        for(String s : answer)
            System.out.println(s);
        System.out.println("=========");
        for(String s : answer2)
            System.out.println(s);
    }
}
