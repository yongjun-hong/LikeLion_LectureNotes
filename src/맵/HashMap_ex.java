package 맵;

import java.util.HashMap;

public class HashMap_ex {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();

        //Hashmap의 다양한 메소드들

        //값 삽입
        map.put(1, "홍용준"); // key : 1, value: 홍용준
        map.put(2, "anna");

        // 값 삭제
        Object data = map.remove(1); // 값을 삭제하면서 삭제한 값을 반환한다.
        System.out.println(data);

        // 크기
        int size = map.size();
        System.out.println(size);

        //값 반환
        Object result_data = map.get(2);
        System.out.println(result_data);
    }
}
