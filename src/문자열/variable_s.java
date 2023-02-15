package 문자열;

public class variable_s {
    public static void main(String[] args) {
        String a = new String("hello");
        // new연산자는 새로 만드는 작업을 한다. 그러므로 기존에 같은 문자열이 있던 말던 새로운 값을 메모리에 저장한다.
        String b = "hello";
        String c = "hello";
        // 이렇게 참조형 변수 선언을 하면 동일한 값이 있는지 찾고, 있으면 새로운 객체를 힙 메모리에 저장하지 않고 기존 메모리를 저장한다.

        if (a == b){
            System.out.println("a와 b!");
        }
        if(b == c){
            System.out.println("b와 c");
        }
        if (a.equals(b)) // equals는 주소가 아닌 내용   를 비교한다.
        {
            System.out.println("같잖아요!");
        }
    }
}
