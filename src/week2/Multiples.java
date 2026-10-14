package week2;

public class Multiples {

    // 统计 1-100 中，能被 divisor 整除的数有多少个
    public static int countMultiples(int divisor) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }

        //能被 divisor 整除就 count++

        return count;
    }

    public static void main(String[] args) {
        System.out.println("3的倍数有 " + countMultiples(3) + " 个");
        System.out.println("5的倍数有 " + countMultiples(5) + " 个");
    }
}
