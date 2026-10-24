package week5.battle;

/**
 * 角色类：描述一个战斗角色
 * 属性：名字(name)、血量(hp)、攻击力(attack)
 */
public class Fighter {
    String name;   // 名字
    int hp;        // 血量，归 0 或以下即死亡
    int attack;    // 攻击力，作为基础伤害值

    // 构造方法：用参数给三个字段赋值。this. 用来区分"参数名"和"字段名"
    public Fighter(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // 攻击另一个角色：伤害 = 自己的攻击力 + 0~9 的随机值，直接扣对方血量
    public void hit(Fighter target) {
        // Math.random() 返回 0~1 的小数，乘以 10 得到 0~10，(int) 强转砍成整数 0~9
        int dmg = attack + (int) (Math.random() * 10);
        // target 是另一个对象，这里改的是"对方"的血量，不是自己的
        target.hp = target.hp - dmg;
        System.out.println(name + " " + "对" + " " + target.name + " " + "造成了：" + dmg + "点伤害！" + " " + target.name + "还剩：" + target.hp + "血量");
    }

    // 判断是否还活着：血量大于 0 才算活着（0 和负数都算死）
    public boolean isAlive() {
        return hp > 0;
    }
}
