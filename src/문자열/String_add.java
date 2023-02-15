package 문자열;

public class String_add {
    public static void main(String[] args) {
        //1. +
        String a = "hello";
        String b = "world";

        System.out.println(a + b); // 이 방법은 문자열을 합칠때마다 임의의 String 객체를 만든 뒤 반환하므로 메모리 소모가 두번째 방법보다 크다.

        // 2.
        StringBuilder StrBuilder = new StringBuilder("hello!! "); // StringBuilder 객체 생성 완료
        StrBuilder.append(b); // append 함수를 사용해서 문자열 병합 할수 있다.
        System.out.println(StrBuilder);
        String result = StrBuilder.toString() + "from sch"; // toString을 사용하면 문자열 처럼 사용할 수있다.
        System.out.println(result);
    }
}
