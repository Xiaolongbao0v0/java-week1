package likou;

class Jianca {


    // 判断这个数字是不是有效密码
    public String check(int inputshu) {
        if (inputshu < 1000 || inputshu > 9999) {
            return "输入无效，要求整数范围{1000-9999}";
        }

        // 计算各位数字之和
        int sum = 0;
        int n = inputshu;
        for (int i = 0; i < 4; i++) {     // 四位数
            sum = sum + n % 10;           // 取个位并累加
            n = n / 10;                   // 砍掉个位
        }
        if (sum > 15) {
            return "密码有效";
        } else {
            return "密码无效";
        }
    }
}

public class likou2 {

    public static void main(String[] args) {
        int[] cases = {9960,8888,7900,9879,9990,9999,1000,999,10000,0,-888,1234,1111,7800,7801};                 //录入数据

        for (int i = 0; i < cases.length; i++) {
            Jianca p = new Jianca();
            System.out.println(cases[i]+ "  " + p.check(cases[i]));
        }
    }
}