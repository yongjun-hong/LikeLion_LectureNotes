package 배열_리스트;

public class Array_ex {
    public static void main(String[] args) {
        //1. 배열 생성
        String[] mbti = {"enfp", "enfj","infp"};
        String my_mbti = mbti[0];
        System.out.println(my_mbti);

        //2. 값 변경
        mbti[2] = "infp";
        System.out.println(mbti[2]);

        //3. 값 출력
        for (int i = 0; i < mbti.length; i++) {
            System.out.println(mbti[i]);
        }
    }
}
