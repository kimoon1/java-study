



class Order {
    private String productName;
    private int price;
    private int quantity;

    public Order(String productName, int price, int quantity) {
        if(price <= 0) {
            throw new IllegalArgumentException("가격은 0보다 작을수 없습니다.");
        }
        if(quantity <= 0) {
            throw new IllegalArgumentException("수량은 1개 이상이여야 합니다.");        
        }
        // TODO 1: 전달받은 값을 필드에 저장
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        // TODO 2: 주문 총금액 반환
        return price * quantity;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void changeQuantity(int newQuantity) {
        if(newQuantity <= 0) {
            throw new IllegalArgumentException("수량은 1개 이상이어야 합니다.");
        }
        quantity = newQuantity;
    }

    public static int calculateDeliveryFee(int total) {
        // TODO 3: 50000원 이상 무료 배송
        if(total >= 50000) {
            return 0;
        }else {
            return 3000;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Keyboard", 30000, 2);

        System.out.println(order.getQuantity()); // 2

        order.changeQuantity(5);

        System.out.println(order.getQuantity()); // 5
        System.out.println(order.calculateTotal()); // 150000

        order.changeQuantity(-1); // 예외 발생
    }
}