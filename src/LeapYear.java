import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("这是闰年");
        } else System.out.println("这不是闰年");
    }
}
