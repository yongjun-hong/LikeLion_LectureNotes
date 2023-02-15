package 문자열;

public class upper_lower_case {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "ABCDE";
        String c = "abcde";
        a = a.toUpperCase();
        if (a.equals(b)) {
            System.out.println("a와 b는 똑같아!" + a + b);
        }
        if (a.equalsIgnoreCase(c)) {
            System.out.println("ignoreCase를 하면 문자열의 값을 비교할때 대소문자는 비교하지 않습니다."+  a + c );
        }

    }
}
