package Second;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class SecondRelation {

    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                //System.out.print("★");
            } else if(i % 3 ==0) {
                System.out.println(i);
            }
        }
        System.out.println("*****");
        // 논리연산자를 활용한 버전
        for(int i = 1; i <= 30; i++) {
            if(i % 2 == 0) {
                // OR연산자 : || - 혹은
                // A or B : A도 OK, B도 OK
                if((i % 2 == 0) || (i % 3 == 0)) {
                    System.out.println(i);
                }
            }
        }
        for(int i = 1; i <= 30; i++) {
            if(i % 2 == 0) {
                // 의미 : AND, 교집합
                // 2의 배수이면서 3의 배수
                // 공배수 6의 배수를 찾는다.
                if((i % 2 == 0) && (i % 3 == 0)) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("*****");
        for(int i = 1; i <= 10; i++) {
            // !가 논리연산자 NOT이기 때문
            // NOT은 모든 결과를 부정
            if(!(i % 3 == 0)) {
                System.out.println(i);
            }
        }

    }
}
