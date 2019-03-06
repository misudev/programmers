import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class PhoneNumList {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if(len1 == len2)
                    return 0;
                else
                    return len1 > len2 ? 1 : -1;
            }
        });

        outerloop:
        for(int i = 0 ; i < phone_book.length-1; i++){
            String start = phone_book[i];
            for(int j = i+1; j < phone_book.length; j++ ){
                if(checkPhoneNum(start, phone_book[j])){
                    answer = false;
                    break outerloop;
                }
            }
        }
        return answer;
    }

    public static boolean checkPhoneNum(String str1, String str2){
        String subString = str2.substring(0, str1.length());
        if(str1.equals(subString))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String[] arr1 = {"119", "97674223", "1195524421"};
        String[] arr2 = {"12","88","1235","567"};
        String[] arr3 = {"123","456","789"};
        System.out.println(solution(arr2));
    }
}
