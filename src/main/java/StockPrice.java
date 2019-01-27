public class StockPrice {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length -1] = 0;
        for(int i = 0; i < prices.length -1; i++){
            answer[i] = 1;
            for(int j = i+1; j < prices.length -1; j++){
                if(prices[i]>prices[j]){
                    break;
                }else{
                    answer[i]++;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args){
        for(int i : solution(new int[]{498,501,470,489})){
            System.out.println(i);
        }
    }
}
