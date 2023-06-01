import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in); // Scanner p.61
    static List<Product> cartList = new ArrayList<>();



    public static void main(String[] args) {
        Order orderArrList = new Order();


        while (true) {
            // 메인페이지
            System.out.println("\"신전떡볶이\"에 오신걸 환영합니다!");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 번호를 입력해주세요.");
            System.out.println("----------------------------------\n");
            System.out.println("[ 신전떡볶이 MENU ]");
            for (Menu menu : Item.menuList) {
                System.out.println(menu);
            }
            System.out.println("\n[ ORDER MENU ]");
            for (Order order : Item.orderList) {
                System.out.println(order);
            } // 번호 입력 시 상세메뉴판 페이지
            System.out.println("\n해당 번호를 입력해주세요.");
            String mainNum = sc.nextLine();
            int menuNum = Integer.parseInt(mainNum);

            if (menuNum == 1) { // 떡볶이 상세페이지
                orderArrList.orderTitle(menuNum,Item.itemList1);

                String itemNum = sc.nextLine();// 장바구니 추가 요청
                int num1 = Integer.parseInt(itemNum);
                Product product = orderArrList.orderRequest(num1,Item.itemList1);

                String itemNum1 = sc.nextLine();// 장바구니 추가
                int num2 = Integer.parseInt(itemNum1);
                if (num2 == 1) {
                    cartList.add(product);
                    System.out.println(product.name + " 가 장바구니에 추가되었습니다.\n");
                } else {
                    System.out.println("취소되었습니다.\n");
                }

            } else if (menuNum == 2) { // 튀김 상세페이지
                orderArrList.orderTitle(menuNum,Item.itemList2);

                String itemNum = sc.nextLine();// 장바구니 추가 요청
                int num1 = Integer.parseInt(itemNum);
                Product product = orderArrList.orderRequest(num1,Item.itemList2);

                String itemNum1 = sc.nextLine();// 장바구니 추가
                int num2 = Integer.parseInt(itemNum1);
                if (num2 == 1) {
                    cartList.add(product);
                    System.out.println(product.name + " 가 장바구니에 추가되었습니다.\n");
                } else {
                    System.out.println("취소되었습니다.\n");
                }

            } else if (menuNum == 3) {
                orderArrList.orderTitle(menuNum,Item.itemList3);

                String itemNum = sc.nextLine();// 장바구니 추가 요청
                int num1 = Integer.parseInt(itemNum);
                Product product = orderArrList.orderRequest(num1,Item.itemList3);

                String itemNum1 = sc.nextLine();// 장바구니 추가
                int num2 = Integer.parseInt(itemNum1);
                if (num2 == 1) {
                    cartList.add(product);
                    System.out.println(product.name + " 가 장바구니에 추가되었습니다.\n");
                } else {
                    System.out.println("취소되었습니다.\n");
                }

            } else if (menuNum == 4) {
                orderArrList.orderTitle(menuNum,Item.itemList4);

                String itemNum = sc.nextLine();// 장바구니 추가 요청
                int num1 = Integer.parseInt(itemNum);
                Product product = orderArrList.orderRequest(num1,Item.itemList4);

                String itemNum1 = sc.nextLine();// 장바구니 추가
                int num2 = Integer.parseInt(itemNum1);
                if (num2 == 1) {
                    cartList.add(product);
                    System.out.println(product.name + " 가 장바구니에 추가되었습니다.\n");
                } else {
                    System.out.println("취소되었습니다.\n");
                }

            } else if (menuNum == 5) {
                System.out.println("아래와 같이 주문하시겠습니까?\n");
                System.out.println(" [ Orders ] ");
//                System.out.println(cartList);
                for (int i = 0; i < cartList.size(); i++) {
                    Menu cartSave = cartList.get(i);
                    System.out.println(cartSave.toString());
                }
                    System.out.println("\n [ Total ] ");
                    int sum = 0;
                    for (int j = 0; j < cartList.size(); j++) {
                        sum += cartList.get(j).price;
                    }
                    System.out.println(sum);
                    System.out.println("1. 주문 \t\t 2. 취소");
                    String choiceNum1 = sc.nextLine();
                    int num2 = Integer.parseInt(choiceNum1);
                    try {
                        switch (num2) {
                            case 1:
                                cartList.clear();
                                System.out.println("주문이 완료되었습니다!");
                                System.out.println("대기번호는 [ " + cartList.size() + "] 번 입니다.");
                                System.out.println("3초 후 메뉴판으로 돌아갑니다.\n");
                                Thread.sleep(3000);
                        }
                    } catch (Exception e) {
                        return;
                    }

                } else if (menuNum == 6) {
                     for (int i = 0; i < cartList.size(); i++) {
                     Menu cartSave = cartList.get(i);
                     System.out.println(cartSave.toString());
                }
                    System.out.println("\n진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인 \t\t 2. 메뉴판");
                    String choiceNum1 = sc.nextLine();
                    int num2 = Integer.parseInt(choiceNum1);
                    switch (num2) {
                        case 1:
                            cartList.clear();
                            System.out.println("진행하던 주문이 취소되었습니다.\n");
                        case 2:
                            break;
                    } continue;
                }
            }
        }
    }

