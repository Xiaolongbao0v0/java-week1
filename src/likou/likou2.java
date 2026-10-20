package likou;

public class likou2 {

    public static void main(String[] args) {
        // 测试表格：换成你自己表格里的值
        int[] cases = {500, 1000, 1234, 5678, 9999, 10000};

        for (int i = 0; i < cases.length; i++)  {
            Password p = new Password(cases[i]);     // 用下标取出表格里的值
            System.out.println(p.shu + " → " + p.check());
        }
    }
}

class Password {
    int shu;

    // 构造方法：造对象时把数字填好
    public Password(int shu) {
        this.shu = shu;
    }

    // 判断这个数字是不是有效密码
    public String check() {
        // 先挡掉不在 1000~9999 范围的
        if (shu < 1000 || shu > 9999) {
            return "输入无效，要求整数范围{1000-9999}";
        }

        // 计算各位数字之和（用副本 n，不改字段 shu）
        int sum = 0;
        int n = shu;
        for (int i = 0; i < 4; i++) {     // 1000~9999 一定是四位数
            sum = sum + n % 10;           // 取个位并累加
            n = n / 10;                   // 砍掉个位
        }

        return sum > 15 ? "密码有效" : "密码无效";
    }
}
