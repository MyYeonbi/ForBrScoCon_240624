public class Q2_WhileContinue {
    public static void main(String[] args) {
//3을 제외하고 1에서 5까지 나열하라.

        int i = 1;

        while(i<=5){
            if(i==3){
                i++;
                continue; //continue를 만나면 그 다음
                // 조건문은 무시되고 다시 while문으로 회귀.

            }
            System.out.println(i);
            i++;
        }
    }
}
