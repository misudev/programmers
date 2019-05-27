

import java.util.PriorityQueue;

public class MoreHot {

    public int solution(int[] scoville, int K){
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 처음에 초기화
        for(int i : scoville){
            pq.add(i);
        }

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        // 조건 : K보다 크게 할 수 없을 때는 -1
        while(true){
            if (pq.size() < 2 && pq.peek() < K) {
                result = -1;
                break;
            }
            if(pq.peek()>=K){
                break;
            }
            n1 = pq.poll();
            n2 = pq.poll();
            n3 = n1 + n2 * 2;
            pq.add(n3);
            result++;
        }

        return result;
    }

    public static void main(String[] args){

    }
}


