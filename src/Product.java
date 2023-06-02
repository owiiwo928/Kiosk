public class Product extends Menu { // Menu 클래스 상속

    public int price;

    public Product(int num, String name, int price, String desc) {
        super(num, name, desc);
        this.price = price;
    }
    public void getProductList(){
        System.out.println(this.num +". " + this.name + "|" + this.price + "원 |" + this.desc);
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return num + ". " + name + "\t| " + price + "원 | " + desc;
    }
}