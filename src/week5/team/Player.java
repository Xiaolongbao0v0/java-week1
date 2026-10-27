package week5.team;

/**
 * 【第 5 周练习 · 球队】
 * 场景：一支球队有若干队员，每场比赛有人得分，要找出"得分王"。
 *
 * 你要写的 Player 类（一个队员）：
 *   字段：
 *     String name   名字
 *     int    score  本场得分
 *   构造方法：
 *     Player(String name, int score)
 *   方法：
 *     void printInfo()  打印 "名字 得分"
 */
public class Player {
String name;
int score;
    // ===== 字段 =====
    Player(String name,int score){
    this.name =name;
    this.score =score;
}


    // ===== 构造方法 =====
public void printInfo(){
        System.out.println("名字：" + name + " " + "本场得分：" + score);
    }


    // ===== printInfo =====

}
