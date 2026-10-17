package week3;

public class Student {
    private String name;
    private int[] scores;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        for (int i : scores) {
            if (i < 0 || i > 100) {
                throw new IllegalArgumentException("成绩必须在 0~100 之间，收到了 " + i);
            }
        }
        this.scores = scores;
    }


}
