class Caesar {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        char tmp;
        int tmpNum = 0;
        for(int i=0 ;i < sb.length(); i++){
            tmp = sb.charAt(i);
            if(tmp == ' '){
                continue;
            }else if('a'<= tmp && tmp <='z'){
                if ((tmp + n)>'z'){
                    tmpNum = n - ('z' - tmp ) - 1;
                    tmp = (char)( 'a' + tmpNum );
                }else{
                    tmp = (char)( tmp + n );
                }
            }else{
                if ((tmp + n)>'Z'){
                    tmpNum = n- ('Z' - tmp) - 1;
                    tmp = (char)( 'A' + tmpNum );
                }else{
                    tmp = (char)( tmp + n );
                }
            }
            sb.setCharAt(i,tmp);
        }
        return sb.toString();
    }

    public static String solution2(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        char tmp;
        for(int i=0 ;i < sb.length(); i++){
            tmp = sb.charAt(i);
            if(Character.isLowerCase(tmp)){
                tmp = (char) (((tmp - 'a' + n) % 26) + 'a');
            }else if(Character.isUpperCase(tmp)){
                tmp = (char) (((tmp - 'A' + n) % 26) + 'A');
            }
            sb.setCharAt(i,tmp);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println( solution2("a B z", 4));
        System.out.println(	solution2("z", 1));


    }
}
