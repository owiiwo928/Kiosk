import java.util.ArrayList;
import java.util.List;

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

    public Order() {
    }

    public void orderTitle (int menuNum, List list){
        System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
        System.out.println("[ " + Item.menuList.get(menuNum - 1).name + " 메뉴 ]");
        for (Object product : list) {
            System.out.println(product);
        }
    }
    public Product orderRequest (int orderNum, List list){
        Product product = (Product)list.get(orderNum - 1);
        System.out.println(product.name + "\t| " + product.price + "원 | " + product.desc);
        System.out.println("1. 확인 \t\t 2. 취소");
        return product;
    }
}
