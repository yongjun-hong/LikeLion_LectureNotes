package 콘솔_입출력;

import java.util.Scanner;

public class Scanner_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("생년 월일을 입력해주세요 >>");
        String date = scan.nextLine();
        System.out.println("귀하의 생년월일은 " + date + " 입니다.");
        // 문자열 슬라이싱을 이용해서 생년월일을 자세하게 나타내보기 ex) 00년 00월 00일
        //정답은 밑에 있다!


















        String year = date.substring(0,2);
        String month = date.substring(2,4);
        String dd = date.substring(4, 6);
        System.out.println(year+"년 "+month+"월 " + dd +"일입니다.");
    }
}
