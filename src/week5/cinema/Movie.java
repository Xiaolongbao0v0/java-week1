package week5.cinema;

/**
 * 【第 5 周练习 · 电影院售票系统】
 * 场景：一家影院今天排了 4 场电影，每场有固定座位数。系统要能卖票、统计票房。
 *
 * 你要写的 Movie 类（表示一个"场次"）：
 *   字段：
 *     String name  片名
 *     int    price 票价
 *     int    seats 总座位数
 *     int    sold  已售出张数（初始 0）
 *   构造方法：
 *     Movie(String name, int price, int seats)
 *   方法：
 *     boolean sell(int n)
 *       尝试卖出 n 张票。如果 sold + n > seats（票不够），就一张都不卖，返回 false；
 *       否则 sold += n，返回 true。
 *       这一步练的是：条件判断 + 改"自己"的字段。
 *     boolean soldOut()
 *       返回 sold == seats（本场是否售罄）。
 *     int boxOffice()
 *       返回 price * sold（本场已经卖出的票房总额）。
 */
public class Movie {
    String name;
    int price;
    int seats;
    int sold;


    // ===== 在这里写字段 =====

    public Movie(String name,int price,int seats){
        this.name = name;
        this.price = price;
        this.seats = seats;
    }

    // ===== 构造方法 =====
    boolean sell(int n){
        if (sold + n > seats){
            return false;
        }else {
            sold += n;                      //？？
            return true;}
        }



    // ===== sell：尝试卖 n 张，不够就返回 false =====
    boolean soldOut(){
    return sold == seats;
    }
    // ===== soldOut：是否售罄 =====
    int boxOffice(){
    return price*sold;
    }


    // ===== boxOffice：本场票房 =====

}
