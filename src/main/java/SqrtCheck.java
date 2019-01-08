public class SqrtCheck {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long sqrtLong = (long)sqrt;
        if(sqrt - sqrtLong != 0){
            return -1;
        }

        return (sqrtLong+1)*(sqrtLong+1);
    }
}