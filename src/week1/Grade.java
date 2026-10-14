package week1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = in.nextInt();
        if (score >= 90) {
            System.out.println("成绩优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
