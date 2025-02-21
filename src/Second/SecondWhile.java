package Second;

public class SecondWhile {
    public static void main(String[] args) {
        System.out.println("while문 테스트");

        // 변수 할당, 초기값은 0
        int cnt = 0;

        // while의 사전적 의미 : ~동안
        // 의미: cnt가 숫자 10보다 작은 동안 반복한다.
        while(cnt < 10) {
            // cnt++이므로 cnt값을 1씩 증가시킨다.
            // 먼저 값을 출력하고 나중에 1을 증가시킨다.

            // 후위 연산의 경우 출력하고 덧셈을 수행한다.
            //System.out.println(cnt++);

            // ++이 앞에 오면 전위 연산자, 뒤에 오면 후위 연산자
            // 전위 연산의 경우 먼저 출력하기 전에 덧셈을 수행한다.
            //cnt 1은 10 미만이다. > 참 > 1을 ++ 한 후 출력 > 출력값 : 2
            //cnt 9는 10 미만이다. > 참 > 1을 ++ 한 후 출력 > 출력값 : 10
            //cnt 10은 10 미만이다. > 거짓 > 조건문 빠져나옴
            System.out.println(++cnt);

            //for문은 출력 먼저하고 증감부가 올라간다
        }
    }
}
