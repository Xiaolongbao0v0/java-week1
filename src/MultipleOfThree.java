public class MultipleOfThree {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                count++;
                sum = sum + i;
            }
        }
        System.out.println("共有" + count + "个");
        System.out.println("总和是" + sum);
    }
}
