package week5.cinema;

public class Cinema {
    /**
     * Cinema 工具类：对"场次数组"整体干活，方法都用 static
     * static int  totalSold(Movie[] arr)        —— 所有场次的总售票
     * static int  totalBoxOffice(Movie[] arr)   —— 所有场次的总票房
     * static Movie mostPopular(Movie[] arr)     —— 返回"已售最多"的场次（擂台法，返回的是对象）
     * main：
     * 1. 造 4 个 Movie 对象（不同片名 / 票价 / 座位）
     * 2. while 循环模拟今天营业：
     * 每轮：随机挑一场  (int)(Math.random() * 4)
     * 随机卖 1~9 张  1 + (int)(Math.random() * 9)
     * 调用该场的 sell(...)
     * 直到 4 场全部 soldOut() 才停。
     * ⚠️ 防死循环：加一个最大轮数（比如 500），到了就 break。
     * 3. 循环结束后，遍历打印每场：片名、票价、已售/总座、票房
     * 4. 打印：总售票、总票房、最热门场次（mostPopular 的片名）
     */
    static int totalSold(Movie[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].sold;
        }
        return sum;
    }

    // ===== totalSold：所有场次总售票 =====
    static int totalBoxOffice(Movie[] arr) {                    //arr??
        int allmoney = 0;
        for (int i = 0; i < arr.length; i++) {
            allmoney = allmoney + arr[i].boxOffice();
        }
        return allmoney;
    }

    // ===== totalBoxOffice：所有场次总票房 =====
    static Movie mostPopular(Movie[] arr) {
        Movie max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].sold > max.sold) {
                max = arr[i];
            }
        }
        return max;
    }

// ===== mostPopular：返回已售最多的场次（擂台法，返回 Movie 对象）=====

    public static void main(String[] args) {
        Movie[] move = new Movie[4];
        move[0] = new Movie("牛来", 30, 80);
        move[1] = new Movie("痴迷", 40, 120);
        move[2] = new Movie("大话西游", 35, 110);
        move[3] = new Movie("仙剑奇侠传", 38, 90);
        int round = 0;
        while (round < 500) {                 // 防死循环：最多 500 轮
            round++;
            boolean allOut = true;
            for (int i = 0; i < move.length; i++) {
                if (!move[i].soldOut()) {
                    allOut = false;
                    break;
                }          //？？
            }
            if (allOut) break;                // 全售罄 → 收工

            int idx = (int) (Math.random() * move.length);  // 随机挑一场
            int n = 1 + (int) (Math.random() * 9);          // 随机卖 1~9 张
            move[idx].sell(n);                // 不够卖 sell 内部会自动放弃
        }

        for (int i = 0; i < move.length; i++) {
            Movie m = move[i];
            System.out.println(m.name + " 票价:" + m.price
                    + " 已售:" + m.sold + "/" + m.seats
                    + " 票房:" + m.boxOffice());
        }
        System.out.println("总售票：" + totalSold(move));
        System.out.println("总票房：" + totalBoxOffice(move));
        System.out.println("最热门：" + mostPopular(move).name);
    }
}


// ===== main：造 4 场 → while 模拟营业 → 打印汇总 =====
