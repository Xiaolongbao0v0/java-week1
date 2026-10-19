package likou;

import java.util.Scanner;

public class likou2 {

    public static String shuzi() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int shu = in.nextInt();

        if (shu >= 1000 && shu <= 9999) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {        // 四位数，跑 4 次
                int weisu = shu % 10;            // 取个位
                sum = sum + weisu;               // 累加
                shu = shu / 10;                  // 砍掉个位（必须有）
            }
            if (sum > 15) {
                return "密码有效";
            } else {
                return "密码无效";
            }
        } else {
            return "输入无效，要求整数范围{1000-9999}";
        }
    }

    public static void main(String[] args) {
        System.out.println(shuzi());
    }
}







