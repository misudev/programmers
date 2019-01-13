import java.util.Stack;

public class StackStick {
    public static int solution(String arrangement) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        char before = arrangement.charAt(0);
        char now;
        for(int i =1; i < arrangement.length(); i++){
            now = arrangement.charAt(i);
            if(now == '(' && before == '('){
                st.add('(');
            }else if(now == ')'){
                if(before== '('){
                    if(st.size()!= 0){
                        answer += st.size();
                    }
                }else if(before == ')'){
                    answer += 1;
                    st.pop();
                }
            }
            before = now;
        }
        return answer;

    }
    public static void main(String[] args){
        System.out.println(solution("((()()(())))"));
    }
}

