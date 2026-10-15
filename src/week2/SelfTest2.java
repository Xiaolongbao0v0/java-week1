package week2;

public class SelfTest2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] scores = {85, 92, 78, 90, 88};
        for (int i = 0; i < 5 ; i++){
            sum = (sum + scores[i]);
        }
        System.out.println((double)sum / scores.length);
        int max = scores[0];
        for (int a = 0;a < scores.length ; a++){
            if (scores[a] > max){
                max = scores[a];
            }
        }
        System.out.println(max);
    }
}
