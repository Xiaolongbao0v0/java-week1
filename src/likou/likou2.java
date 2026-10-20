package likou;

import java.util.Scanner;

public class likou2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = in.nextInt();

        Password p = new Password(n);
        System.out.println(p.shuzi());
    }
}

class Password {
    private int shu;

    public Password(int shu) {
        this.shu = shu;
    }

    public String shuzi() {
        if (shu < 1000 || shu > 9999) {
            return "输入无效，要求整数范围{1000-9999}";
        }

        int sum = 0;
        int n = shu;
        for (int i = 0; i < 4; i++) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum > 15 ? "密码有效" : "密码无效";
    }
}
