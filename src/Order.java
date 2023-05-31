import java.util.ArrayList;
import java.util.HashMap;

public class Order {

    public int num;
    public String name;
    public String desc;

    @Override
    public String toString() {
        return num + ". " + name + "\t| " + desc;
    }

    public Order(int num, String name, String desc) {
        this.num = num;
        this.name = name;
        this.desc = desc;
    }

    public void getOrderList(){
        System.out.println(this.num + ". " + this.name + "\t| " + this.desc);
    }
}
