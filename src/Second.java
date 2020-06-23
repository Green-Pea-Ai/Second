import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Second Test");

            // 설명문 설명문

            System.out.println("첫 번째 정수를 입력해주세요: ");
            int num1 = scan.nextInt();

            System.out.println("두 번째 정수를 입력해주세요: ");
            int num2 = scan.nextInt();

            // if문을 작성하는 방법
            // 1. if를 적고 소괄호를 열고 닫고 중괄호를 열고 닫는다.

            if(num1 < num2) {
                System.out.printf("%d는 %d보다 작다.\n", num1, num2);
            } else if(num1 == num2) {
                System.out.println("두 숫자는 같다.");
            }
            else {
                System.out.printf("%d는(은) %d보다 크다.\n", num1, num2);
            }

            // Boolean 데이터 타입은 참, 거짓을 표현할 수 있다.
            // num1이 num2보다 작은가요?
            Boolean isTrue = num1 < num2;
            System.out.println(isTrue);

            // num1이 num2보다 크거나 같은가요?
            isTrue = num1 >= num2;
            System.out.println(isTrue);

            // num1이 num2와 같은가요?, 같냐고 물어보는 것임
            isTrue = num1 == num2;
            System.out.println(isTrue);

            // num1이 num2랑 다른가요?
            isTrue = num1 != num2;
            System.out.println(isTrue);
    }

}
