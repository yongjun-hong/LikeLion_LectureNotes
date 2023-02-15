package 문자열;

public class trim_replace {
    public static void main(String[] args) {
        // 1. 양쪽 끝 공백 제거
        String str_1 = "            Hi        Myname is kevin "; // Trim은 중간에 있는 공백은 지우지 못한다.
        str_1 = str_1.trim();
        System.out.println(str_1);

        //2. 중간 공백
        String str_2 = "      H  e  l  l  o  M y na me is ke vin  ";
        str_2 = str_2.replace(" ", ""); // target을 replacement로 바꿔준다.
        System.out.println(str_2);
    }
}
