package week5;

public class Book {
    String name;
    double price;
    int count;

    public Book(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public double totalValue() {
        return price * count;
    }

    public void printInfo() {
        System.out.println(name + " 单价:" + price + " 库存:" + count + " 总价值:" + totalValue());
    }

    public void discount(double rate) {
        if (rate <= 0 || rate > 1) {
            throw new IllegalArgumentException("折扣必须在 0~1 之间，收到了 " + rate);
        }
        price = price * rate;
    }
}
