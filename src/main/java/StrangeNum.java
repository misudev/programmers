public class StrangeNum {
    public static String solution(String s) {
        String answer = "";
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 32)
                count = 0;
            else{
                if(count%2 == 0){
                    sb.replace(i, i+1, sb.substring(i,i+1).toUpperCase());
                }else{
                    sb.replace(i,i+1, sb.substring(i,i+1).toLowerCase());
                }
                count++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(solution("try hello world"));
    }
}
