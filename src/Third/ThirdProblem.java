package Third;

class Stundent {
    // 당장 해석할 때 private, public을 없다 생각하고 해석하자!
    private String name;
    private int age;
    private String major;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
}

class MySeries {
    int start; // 숫자의 시작
    int end;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end= end;
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }

    public void findEven() {
        int idx;
        int cnt = 0;

        for(idx=start; idx <= end; idx++) {
            // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
            // if문은 2의 배수
            if(idx % 2 == 0) {
                // cnt가 5로 나눠서 떨어지는가?
                // 아래에서 10을 출력하기전 cnt는 4
                // 전위 연산자, 후위 연산자(먼저 실행하고 덧셈함)
                if(cnt++ % 5 == 0) {
                    System.out.println();
                }
                System.out.printf(
                        "cnt = %d - %2d ", cnt, idx);
            }
        }
    }

}

public class ThirdProblem {
    public static void main(String[] args) {
        System.out.println("3일차 Second.숙제 풀이");

        System.out.println("1번 문제");
        //System.out.println(s);

        System.out.println("2번 문제는 1번과 같다");


        System.out.println("3번 문제");

        MySeries ms1 = new MySeries();
        ms1.setStart(1);
        ms1.setEnd(20);
        ms1.findEven();
    }

}
