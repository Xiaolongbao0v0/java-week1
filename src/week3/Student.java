package week3;

public class Student {
    String name;
    int[] scores;

    public double average() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return (double) sum / scores.length;
    }

    public boolean isPass() {
        return average() >= 60;
    }

    public void printInfo() {
        System.out.println(name + " " + average() + " " + (isPass() ? "及格" : "不及格"));
    }


}
