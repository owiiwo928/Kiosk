import java.util.Arrays;
import java.util.List;

public class Item {
    // p.417 Arrays.asList 배열 / p.188 ~ 190 static 참고

    // 메뉴리스트
    static List<Menu> menuList = Arrays.asList(
            new Menu(1, "떡볶이", "맛있는 신전, 치즈, 로제 떡볶이"),
            new Menu(2, "튀김", "바삭바삭 튀김들"),
            new Menu(3, "라이스", "든든한 밥류"),
            new Menu(4, "음료", "시원한 음료")
    );

    //주문 및 취소
    static List<Order> orderArrList = Arrays.asList(
            new Order(5, "주문", "장바구니를 확인 후 주문합니다."),
            new Order(6, "취소", "진행중인 주문을 취소합니다.")
    );

    // 상품리스트
    static List<Product> itemList1 = Arrays.asList( //메소드
            new Product(1, "신전떡볶이", 3500, "매콤하고 맛있는 국물 떡볶이"),
            new Product(2, "치즈떡볶이", 5500, "모짜렐라 치즈가 듬뿍"),
            new Product(3, "로제떡볶이", 5500, "신전과 로제의 환상 콜라보")
    );

    static List<Product> itemList2 = Arrays.asList(
            new Product(1, "오뎅튀김", 1700, "5개, 신전 오리지널 오뎅튀김"),
            new Product(2, "김말이튀김", 1700, "3개, 튀김계의 대표주자"),
            new Product(3, "치즈스틱", 2000, "3개, 고소한 치즈가 쭉~~스틱"),
            new Product(4, "닭껍질튀김", 2500, "100g, 바삭쫄깃한 닭껍질튀김")
    );

    static List<Product> itemList3 = Arrays.asList(
            new Product(1, "신전치즈김밥", 4000, "치즈가 들어간 매콤신전김밥"),
            new Product(2, "스팸마요컵밥", 4000, "스팸마요가 들어간 신전컵밥"),
            new Product(3, "참치마요컵밥", 4000, "고소한 참치마요 신전컵밥"),
            new Product(4, "치킨마요컵밥", 4000, "맛있는 치킨마요 신전컵밥")
    );

    static List<Product> itemList4 = Arrays.asList(
            new Product(1, "콜라", 2000, "시원한 콜라"),
            new Product(2, "사이다", 2000, "청량한 사이다"),
            new Product(3, "쿨피스", 2000, "달달한 쿨피스")
    );
}


