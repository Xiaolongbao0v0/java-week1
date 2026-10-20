package likou;

public class likou2 {

    public static void main(String[] args) {
        int[] cases = {500, 1000, 1234, 5678, 9999, 10000};

        for (int n : cases) {
            Password p = new Password(n);
            System.out.println(p.shu + " → " + p.check());
        }
    }
}

class Password {
    int shu;

    public Password(int shu) {
        this.shu = shu;
    }

    public String check() {
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
