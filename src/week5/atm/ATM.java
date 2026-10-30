package week5.atm;

/**
 * ATM 工具类（方法都 static）：
 * static Account richest(Account[] arr)
 * 返回余额最多的账户（擂台法，返回对象）。
 * main：
 * 1. 造 3 个 Account
 * 2. 对第一个账户：存 500、取 2000（应该失败）、取 100（成功）
 * 3. 打印每个账户信息
 * 4. 打印"最有钱的账户"户主名
 * <p>
 * 关键点：withdraw 返回 false 时余额不能变，这是最容易出 bug 的地方，要自己验。
 */
public class ATM {
    static Account richest(Account[] arr) {
        Account max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].balance > max.balance) {
                max = arr[i];
            }
        }
        return max;
    }

    // ===== richest：擂台法，返回 Account 对象 =====
    public static void main(String[] args) {
        Account[] yonhu = new Account[3];
        yonhu[0] = new Account("雷子", 1000);
        yonhu[1] = new Account("闲良", 8000);
        yonhu[2] = new Account("饼子", 4000);
        System.out.println(yonhu[0].deposit(500));
        System.out.println(yonhu[0].withdraw(2000));
        System.out.println("取100：" + yonhu[0].withdraw(100));
        for (int i = 0; i < yonhu.length; i++) {
            yonhu[i].printInfo();
        }
        richest(yonhu).printInfo();
    }


    // ===== main =====

}
