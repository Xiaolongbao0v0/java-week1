package week5.cinema;

/**
 * Cinema 工具类：对"场次数组"整体干活，方法都用 static
 *   static int  totalSold(Movie[] arr)        —— 所有场次的总售票
 *   static int  totalBoxOffice(Movie[] arr)   —— 所有场次的总票房
 *   static Movie mostPopular(Movie[] arr)     —— 返回"已售最多"的场次（擂台法，返回的是对象）
 *   main：
 *     1. 造 4 个 Movie 对象（不同片名 / 票价 / 座位）
 *     2. while 循环模拟今天营业：
 *          每轮：随机挑一场  (int)(Math.random() * 4)
 *                随机卖 1~9 张  1 + (int)(Math.random() * 9)
 *                调用该场的 sell(...)
 *          直到 4 场全部 soldOut() 才停。
 *          ⚠️ 防死循环：加一个最大轮数（比如 500），到了就 break。
 *     3. 循环结束后，遍历打印每场：片名、票价、已售/总座、票房
 *     4. 打印：总售票、总票房、最热门场次（mostPopular 的片名）
 */
public class Cinema {

    // ===== totalSold：所有场次总售票 =====



    // ===== totalBoxOffice：所有场次总票房 =====



    // ===== mostPopular：返回已售最多的场次（擂台法，返回 Movie 对象）=====



    // ===== main：造 4 场 → while 模拟营业 → 打印汇总 =====

}
