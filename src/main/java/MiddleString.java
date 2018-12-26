class MiddleString {
    public static String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0){
            answer += s.charAt(length/2-1);
            answer += s.charAt(length/2);
        } else {
            answer += s.charAt(length/2);
        }
        return answer;
    }

    public static String solution2(String s){
        int length = s.length();
        System.out.println((length-1)/2);
        System.out.println(length /2);
        return s != null ? s.substring((length - 1)/2 , length/2 + 1) : "";
    }

    public static void main(String[] args){
        System.out.println(solution2("abcde"));
        System.out.println(solution2("abcd"));
    }
}