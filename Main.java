class Order {
    private String productName;
    private int price;
    private int quantity;

    public Order(String productName, int price, int quantity) {
        // TODO 1: 전달받은 값을 필드에 저장
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        // TODO 2: 주문 총금액 반환
        return this.price * quantity;
    }

    public static int calculateDeliveryFee(int total) {
        // TODO 3: 50000원 이상 무료 배송
        if(total > 50000) {
            return 0;
        }else {
            return 3000;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Keyboard", 30000, 2);
        Order order2 = new Order("Mouse", 20000, 1);

        // TODO 4: 각 주문의 총금액 출력
        int order1Total = order1.calculateTotal();
        int order2Total = order2.calculateTotal();
        System.out.println("Order1 total:" + order1Total);
        System.out.println("Order1 delivery:" +Order.calculateDeliveryFee(order1Total));
        // TODO 5: 각 주문의 배송비 출력
        System.out.println("Order2 total:"+ order2Total);
        System.out.println("Order2 delivery:"+Order.calculateDeliveryFee(order2Total));
    }
}