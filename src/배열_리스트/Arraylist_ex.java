package 배열_리스트;

import java.util.ArrayList;
import java.util.Objects;

public class Arraylist_ex {
    public static void main(String[] args) {

        //1. 생성 방법
        ArrayList list = new ArrayList();
        ArrayList<String> list_1 = new ArrayList<>();

        //2. ArrayList의 메소드들

        // 추가
        list.add(122);
        list.add(12345);
        list.add(1, "홍용준"); // ArrayList는 인덱스 값들 사이에 값을 넣으면 뒤에 있는 인덱스들이 한칸씩 뒤로 밀린다.

        // 삭제
//        list.remove("홍용준");
        list.remove(0); // int 값을 넣어주면 자연스럽게 index로 인식한다.
        System.out.println(list.get(0)); // ArrayList는 첫번째 인덱스를 삭제하면 뒤에 있는 인덱스가 앞으로 당겨진다.

        // 변경
        list.set(1, "1번째 인덱스 값 변경");

        //반환
        Object a = list.get(1); // 1번째 인덱스에 있는 원소를 반환받는다.
        System.out.println(a);



        //3. ArrayList의 출력방법
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
