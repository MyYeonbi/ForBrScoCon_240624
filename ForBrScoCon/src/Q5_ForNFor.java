public class Q5_ForNFor {
    // 중첩 for문을 이용하여 구구단을 완성하라.
    public static void main(String[] args) {

        for(int a = 1; a <= 9; a++){
            for(int b = 1; b <= 9; b++){
                System.out.println(a + " * " + b + " = "+ a*b);
            }
        }
    }

}
