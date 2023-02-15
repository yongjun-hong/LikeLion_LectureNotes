package 문자열;

public class String_slice {
    public static void main(String[] args) {
        String str_1 = "홍용준";
        int num = str_1.indexOf("용"); // 해당 문자의 위치를 알려주는 함수
        System.out.println(num);
        String Middle_name = str_1.substring(1, 3); // (1,3)을 하면 (1~2)에 해당되는 문자가 반환된다. 끝 인덱스 포함 하지 않는다.
        System.out.println(Middle_name);
    }
}
