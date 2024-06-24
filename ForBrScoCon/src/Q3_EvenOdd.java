public class Q3_EvenOdd {
    public static void main(String[] args) {
        //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램 작성.
        //num이라는 변수를 사용하여 수를 표현해야 함.
        //while과 for 2가지 버전 필요
        int num = 2;
        int count = 1;
        while(count <= 10){
            if (num % 2== 0){
                System.out.println(num);
                num += 2;
                count ++;
            }
        }
        int numm = 2;
        for (int countt = 1; countt <= 10; countt++){
            System.out.println(numm);
            numm += 2;


        }
    }
}
