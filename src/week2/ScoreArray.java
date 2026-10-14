package week2;

public class ScoreArray {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88};
        int a = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            a = a + scores[i];
        }
        System.out.println((double) a / scores.length);
        int max = 0;
        scores[0] = max;
        for (int b = 0; b < scores.length; b++) {
            if (scores[b] > max) {
                max = scores[b];
            }
        }
        System.out.println(max);
    }
}
