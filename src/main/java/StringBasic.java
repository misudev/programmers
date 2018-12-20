import java.util.regex.Pattern;

public class StringBasic {
    public static void main(String[] args){
        String str1 = "a1234";
        String str2 = "1234";
        String str3 = "123456";

        System.out.println(solution(str1));
        System.out.println(solution(str2));
        System.out.println(solution(str3));
    }
    // solution
    public static boolean solution(String s) {
        // 두가지 정규표현식으로 비교한다.
        String regExp1 = "\\d{4}";
        String regExp2 = "\\d{6}";

        if(s.length()== 4 || s.length() == 6){
            return Pattern.matches(regExp1, s)? true : Pattern.matches(regExp2, s);
        }

        return false;
    }
}

