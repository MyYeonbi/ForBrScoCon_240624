public class Break2 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료:" + i + "   sum ="
                        + sum);
                break;
            }
            i++;
        }// for( ; ;)를 보면 조건식이 없다. for문은 조건이 없으면 무한반복한다.
        //sum > 10조건을 만족하면 break를 사용해서 while문을 빠져나간다.
    }
}