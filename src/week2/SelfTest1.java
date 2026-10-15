package week2;

public class SelfTest1 {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        int[] year = {2000, 1900, 2024, 2023};
        for (int i = 0; i < 4; i++) {
            if (isLeapYear(year[i])) {
                System.out.println(year[i] + "是闰年");
            }else{
                System.out.println(year[i] + "不是闰年");
            }
        }
    }
}
