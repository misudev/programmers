public class StringCountPY {
    public StringCountPY() {
    }

    public static void main(String[] args) {
        System.out.println(solution("pPyYPY"));
        System.out.println(solution("pPY"));
    }

    public static boolean solution(String s) {
        int length = s.length();
        int countP = 0;
        int countY = 0;

        for(int i = 0; i < length; ++i) {
            char c = Character.toUpperCase(s.charAt(i));
            if (c == 'P') {
                ++countP;
            } else if (c == 'Y') {
                ++countY;
            }
        }

        return countP == countY;
    }
}