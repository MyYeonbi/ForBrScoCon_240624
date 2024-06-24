public class Q4_From1toMax {
    public static void main(String[] args) {
        //반복문을 사용하여 1부터 max까지의 합을 계산하고 출력.
        //변수는 sum 이용하여 누적합을 표현하고
        //i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행.
        //while과 for 2가지 버전.
        int max = 100;

        int sum = 0;
        int i = 1;
        while ( i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
