import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //获取数据
        System.out.println("请输入数字");
        //偶数除以2余数为o，奇数除以2余数为1.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
            in.close();
        }
    }
}
