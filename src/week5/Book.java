package week5;

/**
 * 图书类：描述一本书
 * 属性：书名(name)、单价(price)、库存(count)
 */
public class Book {
    String name;    // 书名
    double price;   // 单价
    int count;      // 库存数量

    // 构造方法：用参数给三个字段赋值，this. 用来区分"参数名"和"字段名"
    public Book(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // 总价值 = 单价 × 库存，返回 double（可能带小数）
    public double totalValue() {
        return price * count;
    }

    // 打印这本书的基本信息（注意：这里用 return 把总价值算出来拼进去，而不是直接打印总分）
    public void printInfo() {
        System.out.println(name + " 单价:" + price + " 库存:" + count + " 总价值:" + totalValue());
    }

    // 打折：rate 是折扣率，0.8 表示八折。rate 必须 > 0 且 <= 1，否则抛异常拦住
    public void discount(double rate) {
        if (rate <= 0 || rate > 1) {
            throw new IllegalArgumentException("折扣必须在 0~1 之间，收到了 " + rate);
        }
        price = price * rate;
    }
}
