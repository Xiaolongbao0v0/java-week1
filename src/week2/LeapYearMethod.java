
package week2;


public class LeapYearMethod {


    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {

        for (int year = 2000; year <= 2030; year++) {

            if (isLeapYear(year)) {

                System.out.println(year + " 是闰年");

            }

        }

    }

}