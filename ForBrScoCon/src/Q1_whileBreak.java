public class Q1_whileBreak {
    public static void main(String[] args) {
        //1부터 시작해서 숫자가 계속 누적해서 더하다가
        // 합계가 10보다 처음으로 큰 값은 얼마인가?
        int i = 1;
        int sum = 0;
        while (true){ //while(true)는 무한반복.
            sum= sum+i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i="
                + i + " sum=" + sum);
                break;
            } i++;
            //조건식을 잘 보면 true라고 되어있다.
            //조건이 항상 참이기 때문에 이렇게 두면 while문은 무한반복된다.
            //물론 break문이 있기 때문에 중간에 빠져나올 수 있다.
            //만약 sum > 10 조건을 만족하면 결과를 출력하고,
            //break를 사용해서 while문을 빠져나간다.
        }
    }
}
