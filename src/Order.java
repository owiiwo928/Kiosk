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
    } // 생성자

    // 상세메뉴판 메서드
    public void orderTitle (int menuNum, List list){
        System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
        System.out.println("[ " + Item.menuList.get(menuNum - 1).name + " 메뉴 ]"); // menuNum에 입력된 숫자에서 -1 처리하여 배열에 맞는 메뉴 꺼내기
        for (Object product : list) {
            System.out.println(product);
        }
    }
    // 장바구니 추가 요청 메서드
    public Product orderRequest (int orderNum, List list){
        Product product = (Product)list.get(orderNum - 1);
        System.out.println("\"" + product.name + " | " + product.price + "원 | " + product.desc + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인 \t\t 2. 취소");
        return product;
    }
}
