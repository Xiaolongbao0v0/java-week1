package week5.team;

import java.util.Scanner;

/**
 * Team 工具类（方法都 static）：
 * static int totalScore(Player[] arr)
 * 全队总得分。
 * static Player topScorer(Player[] arr)
 * 返回得分最高的队员（擂台法，返回对象）。
 * 注意：如果有并列最高分（比如两人都是 20 分），返回先出现的那一个。
 * main：
 * 1. 造 5 个 Player（其中两个故意设成同分，测试并列）
 * 2. 打印总得分、得分王的名字和分数
 * <p>
 * 关键点：擂台法用 > 而不是 >=，所以并列时保留"先出现"的那个。
 */
public class Team {
    public static int totalScore(Player[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].score;
        }
        return sum;
    }

    // ===== totalScore =====
    public static Player topScorer(Player[] arr) {
        Player max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].score > max.score) {
                max = arr[i];
            }
        }
        return max;
    }

    // ===== topScorer：擂台法，返回 Player 对象 =====
    public static int findPeople(Player[] players, String name) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].name.equals(name)) {
                return players[i].score;
            }
        }
        return -1;
    }

    // =====查找人员     返回 Player 对象 =====
    public static void main(String[] args) {
        Player[] players = new Player[5];
        players[0] = new Player("家齐", 66);
        players[1] = new Player("胡家睿", 88);
        players[2] = new Player("汪熠轩", 61);
        players[3] = new Player("乐子节", 66);
        players[4] = new Player("雷子", 89);
        System.out.println("总得分：" + totalScore(players));
        System.out.print("得分王");
        topScorer(players).printInfo();
        System.out.println("请输入名字：");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int score = findPeople(players, name);
        if (score == -1) {
            System.out.println("未找到此人!");
        } else {
            System.out.println(name + " 的得分：" + score);
        }
    }
}


// ===== main =====



