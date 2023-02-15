package 메소드;

import java.util.ArrayList;

public class MethodExample {
    public static void main(String[] args) {
        // 함수(method)
//        int sum = plus(1, 2); // main은 static 메소드이므로 main에서 사용하는 함수들은 전부 static 메소드여야 한다.
//        greeting_2();


        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print_listElements(list);
    }

    // 입력 O, 출력 O
    int plus(int a, int b) {
        int result = a + b;
        return result; // 메모리에 result를 저장해줘서 나중에도 사용할 수 있게 해준다.
    }

    // 입력 O, 출력 X
    void PrintNum(int a) {
        System.out.println(a); // 콘솔에만 출력을 하는거지 메모리에 a를 저장해주는것이 아니다. 그러므로 출력 X
    }

    // 입력 X, 출력 0
    String greeting() {
        return "Welcome";
    }

    // 입력 X, 출력 X
    void greeting_2() {
        System.out.println("Welcome");
    }

    static void print_listElements(ArrayList list) { // Arraylist를 출력을 할때 이렇게 함수를 만들어 놓으면 코드가 깔끔해진다.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
