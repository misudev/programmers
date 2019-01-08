public class ReverseNumber {
    public int[] solution(long n) {
        String number = Long.toString(n);
        int length = number.length();
        int[] answer = new int[length];
        int index = 0;
        for(int i= length-1 ; i >= 0 ; i--){
            answer[index++] = number.charAt(i) - '0';
        }
        return answer;
    }
}