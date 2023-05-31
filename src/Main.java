import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Basket basket = new Basket();
    static Cart cart = new Cart();

//    static ArrayList<Menu> menuList = new ArrayList<>(
//    Menu menu1 = new Menu(1,"떡볶이","맛있는 신전, 치즈, 로제 떡볶이"),
//    Menu menu2 = new Menu(2,"튀김","바삭바삭 튀김들"),
//    Menu menu3 = new Menu(2,"라이스","든든한 밥류"),
//    Menu menu4 = new Menu(2,"음료","시원한 음료")
//    );

     // 메뉴리스트
    static List<Menu> menuList = Arrays.asList(
            new Menu(1, "떡볶이", "맛있는 신전, 치즈, 로제 떡볶이"),
            new Menu(2, "튀김", "바삭바삭 튀김들"),
            new Menu(3, "라이스", "든든한 밥류"),
            new Menu(4, "음료", "시원한 음료")
    );
     //주문 및 취소
    static List<Order> orderList = Arrays.asList(
            new Order(5, "주문", "장바구니를 확인 후 주문합니다."),
            new Order(6, "취소", "진행중인 주문을 취소합니다.")
    );
    // 상품리스트
    static List<Product> itemList1 = Arrays.asList(
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
            new Product(1,"신전치즈김밥",4000,"치즈가 들어간 매콤신전김밥"),
            new Product(2,"스팸마요컵밥",4000,"스팸마요가 들어간 신전컵밥"),
            new Product(3,"참치마요컵밥",4000,"고소한 참치마요 신전컵밥"),
            new Product(4,"치킨마요컵밥",4000,"맛있는 치킨마요 신전컵밥")
    );

    static List<Product> itemList4 = Arrays.asList(
            new Product(1,"콜라",2000,"시원한 콜라"),
            new Product(2,"사이다",2000,"청량한 사이다"),
            new Product(3,"쿨피스",2000,"달달한 쿨피스")
    );

    public static void main(String[] args) {

//        ArrayList<Menu> menuArrayList = new ArrayList<>();
//        menuArrayList.addAll(menuList);
//        for (Menu menu : menuArrayList) {
//            System.out.println(menu);
//        }
//
//        ArrayList<Product> productArrayList = new ArrayList<>();
//        productArrayList.addAll(productList);
//        for (Product item1 : productArrayList) {
//            System.out.println(item1);
//        }
//
//        for (Menu menu : menuList) {
//            System.out.println(menu);
//        }

        while (true) {
            // 메인페이지
            System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 번호를 입력해주세요.");
            System.out.println("----------------------------------\n");
            System.out.println("[ 신전떡볶이 MENU ]");
            for (Menu menu : menuList) {
                System.out.println(menu);
            }
            System.out.println("\n[ ORDER MENU ]");
            for (Order order : orderList) {
                System.out.println(order);
            }
            System.out.println("해당 번호를 입력해주세요.");
            int menuNum = sc.nextInt();

            if (menuNum == 1) {
                System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
                System.out.println("[ 떡볶이 메뉴 ]");
                for (Product product : itemList1) {
                    System.out.println(product);
                }
                System.out.println("0. 메뉴판");
                int orderNum = sc.nextInt();

                if (orderNum == 1){
                    Product tbk1 = itemList1.get(0);
                    System.out.println("\"" + tbk1 + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 \t\t 2. 취소");
                }
                int cartNum = sc.nextInt();
                switch (cartNum) {
                    case 1:
                        ArrayList<Product> itemArrList1 = new ArrayList<>();
                        itemArrList1.add(itemList1.get(0));
                        System.out.println(itemArrList1 + " 가 장바구니에 추가되었습니다.\n");
//                        for (Product item1 : itemArrList1) {
//                            System.out.println(item1);
//                        }
                         break;
                    case 2:
                        System.out.println("취소되었습니다.\n");
                    case 0:
                        System.out.println("0. 메뉴판");
                        return;
                    default:
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                }

            } else if (menuNum == 2) {
                System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
                System.out.println("[ 튀김 메뉴 ]");
                for (Product product : itemList2) {
                    System.out.println(product);
                }
                int menuNum1 = sc.nextInt();
            } else if (menuNum == 3) {
                System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
                System.out.println("[ 라이스 메뉴 ]");
                for (Product product : itemList3) {
                    System.out.println(product);
                }
                int menuNum1 = sc.nextInt();
            } else if (menuNum == 4){
                System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 번호를 입력해주세요.\n");
                System.out.println("[ 음료 메뉴 ]");
                for (Product product : itemList4) {
                    System.out.println(product);
                }
                int menuNum1 = sc.nextInt();

            } else if (menuNum == 5){
                System.out.println("아래와 같이 주문하시겠습니까?");
                System.out.println("\" [ Orders ] \"");

                for (Product cart : Cart.cartList){
                    System.out.println(cart);
                }
                int menuNum1 = sc.nextInt();
            }
        }
    }
}