package week5.battle;

/**
 * 回合制对战：造两个角色，轮流攻击直到一方倒下
 */
public class Battle {
    public static void main(String[] args) {
        // 造一个能装 2 个角色的位置数组（此时还是空的，下面逐个填进去）
        Fighter[] renwu = new Fighter[2];
        renwu[0] = new Fighter("亚索", 150, 15);
        renwu[1] = new Fighter("盖伦", 130, 18);

        // 只要两个人都活着，就继续打（只要有一人倒下循环就停）
        while (renwu[0].isAlive() && renwu[1].isAlive()) {
            renwu[0].hit(renwu[1]);      // 亚索先动手
            if (renwu[1].hp <= 0) {      // 盖伦被打死，亚索获胜并结束战斗
                System.out.println(renwu[0].name + "获得胜利！");
                break;
            }
            renwu[1].hit(renwu[0]);      // 盖伦还手
            if (renwu[0].hp <= 0) {      // 亚索被打死，盖伦获胜
                System.out.println(renwu[1].name + "获得胜利！");
            }
        }
    }
}
