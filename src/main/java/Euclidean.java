public class Euclidean {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int min = Math.min(n , m);
        int max = Math.max(n, m);

        int r = -1;
        int tmp = 0;

        while(r == 0){
            tmp = min % r;
            min = r;
            r = tmp;
        }
        answer[0] = min;
        int r1 = n/min;
        int r2 = m/min;
        answer[1] = min * r1 * r2;
        return answer;
    }
}
