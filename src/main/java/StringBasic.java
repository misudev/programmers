import java.util.regex.Pattern;

public class StringBasic {
    public StringBasic() {
    }

    public static void main(String[] args) {
        String str1 = "a1234";
        String str2 = "1234";
        String str3 = "123456";
        System.out.println(solution(str1));
        System.out.println(solution(str2));
        System.out.println(solution(str3));
    }

    public static boolean solution(String s) {
        String regExp1 = "\\d{4}";
        String regExp2 = "\\d{6}";
        if (s.length() != 4 && s.length() != 6) {
            return false;
        } else {
            return Pattern.matches(regExp1, s) ? true : Pattern.matches(regExp2, s);
        }
    }
}
