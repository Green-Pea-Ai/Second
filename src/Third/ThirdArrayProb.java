package Third;

import java.util.Scanner;

public class ThirdArrayProb {
    public static void main(String[] args) {

        // 1번 시작
        Scanner scan = new Scanner(System.in);

        System.out.println(
                "몇 번째 피보나치 항을 구할까요?"
        );

        // 1번 끝이자 2번 시작
        int arrLen = scan.nextInt();

        int[] arr = new int[arrLen];
        // 2번 끝

        // 3번 시작
        int idx;

        arr[0] = 1;
        arr[1] = 1;

        for(idx = 2; idx < arrLen; idx++) {
            arr[idx] = arr[idx - 2] + arr[idx - 1];
        }
        // 3번 끝

        System.out.printf(
                "당신이 찾는 %d번째 항은 %d입니다.\n", arrLen, arr[idx - 1]
        );
    }

}

//