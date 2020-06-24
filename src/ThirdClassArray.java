
class ArrayClass {

    //final은 값을 고정시킨다.

    final int MAX = 4;
    float englishScore[];

    /*public ArrayClass() {
        for(i < MAX;)
    }    */

    // 따라치기 힘든사람은 깃으로 보고 개념에 집중하기
    // 입력으로 배열을 전달 받아서
    // 내부에 있는 englishScore 배열을 채운다.
    public ArrayClass(float[] arr) {
        englishScore = new float[MAX];

        for(int i = 0; i < MAX; i++) {
            englishScore[i] = arr[i];
        }
    }

    // 4년치 영어 성적 평균을 계산하여 반환한다.
    public float calcMean() {
        float sum=0;

        for(int i=0; i<MAX; i++) {
            sum += englishScore[i];
        }
        return sum / MAX;
    }
}

public class ThirdClassArray {

    public static void main(String[] args) {
        System.out.println("Third Class Array");

        float[] arr = {33.3f, 77.7f, 87.2f, 50.8f};

        //예제를 복붙하고 조금씩 수정하는 방향으로 진행하기
        // 학부생중에 c가지고 원하는 프로그램 만들 수 있는 사람 전교 기준 1~2명 있다고 함, 자바는 10명 정도?
        ArrayClass ac = new ArrayClass(arr);
        System.out.println("평균 = " + ac.calcMean());
    }

}

//