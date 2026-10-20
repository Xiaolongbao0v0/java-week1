package likou;

public class likou2 {

    // 判断一个数字是不是有效密码
    public static String check(int shu) {
        if (shu < 1000 || shu > 9999) {
            return "输入无效，要求整数范围{1000-9999}";
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {     // 四位数
            sum = sum + shu % 10;         // 取个位并累加
            shu = shu / 10;               // 砍掉个位
        }

        return sum > 15 ? "密码有效" : "密码无效";
    }

    public static void main(String[] args) {
        int[] cases = {9960,8888,7900,9879,9990,9999,1000,999,10000,0,-888,1234,1111,7800,7801};

        for (int i = 0; i < cases.length; i++) {
            System.out.println(cases[i] + " → " + check(cases[i]));
        }
    }
}
