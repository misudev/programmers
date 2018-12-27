class PrimeNumber {
    public int solution(int n) {
        boolean [] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        int tmp = 0 , answer = 0;
        for(int i = 2; i<=n; i++){
            if(arr[i]){
                continue;
            }else{
                tmp = n/i;
                for(int j = 2; j<= tmp; j++){
                    arr[j*i] = true;
                }
            }
        }
        for(boolean b : arr){
            if(!b) answer ++;
        }
        return answer;
    }
}

