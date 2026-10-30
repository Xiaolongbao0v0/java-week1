package week5.atm;

/**
 * 【第 5 周练习 · ATM 取款机】
 * 场景：一张银行卡，能查余额、存钱、取钱。取钱不能取成负数。
 * <p>
 * 你要写的 Account 类（一个账户）：
 * 字段：
 * String owner   户主名
 * double balance 余额
 * 构造方法：
 * Account(String owner, double balance)
 * 方法：
 * boolean deposit(double money)
 * 存钱：余额加上 money，返回 true。
 * boolean withdraw(double money)
 * 取钱：如果 money > balance（钱不够），返回 false 且余额不变；
 * 否则余额减去 money，返回 true。
 * void printInfo()
 * 打印 "户主 余额"，余额用 printf 保留两位小数。
 * <p>
 * 关键点：withdraw 里"钱不够就返回 false、不动余额"和 cinema 的 sell 是同一个套路。
 */
public class Account {
    String owner;
    double balance;

    // ===== 字段 =====
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // ===== 构造方法 =====
    public boolean deposit(double money) {
        balance = money + balance;
        return true;
    }

    // ===== deposit：存钱 =====
    boolean withdraw(double money) {
        if (money < 0) {
            return false;
        } else if (balance >= money) {
            balance = balance - money;
            return true;
        } else {
            return false;
        }
    }

    // ===== withdraw：取钱（钱不够返回 false，不动余额）=====


    // ===== printInfo =====
    void printInfo() {
        System.out.printf("户主:%s 余额为：%.2f\n", owner, balance);
    }
}

