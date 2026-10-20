package likou;
class Jianca {
    int shu;
    public Jianca(int shu) {
        this.shu = shu;
    }

    // 判断这个数字是不是有效密码
    public String check() {
        if (shu < 1000 || shu > 9999) {
            return "输入无效，要求整数范围{1000-9999}";
        }

        // 计算各位数字之和
        int sum = 0;
        int n = shu;
        for (int i = 0; i < 4; i++) {     // 四位数
            sum = sum + n % 10;           // 取个位并累加
            n = n / 10;                   // 砍掉个位
        }
        if (sum>15){
            return "密码有效";}
        else {
            return "密码无效";}
        }
    }
public class likou2 {

    public static void main(String[] args) {
        int[] cases = {500, 1000, 1234, 5678, 9999, 10000};

        for (int i = 0; i < cases.length; i++)  {
            Jianca p = new Jianca(cases[i]);
            System.out.println(p.shu + " → " + p.check());
        }
    }
}


