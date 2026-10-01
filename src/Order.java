public class Order {
    private static final double DELIVERY_FEE = 39.0;
    private static int counter = 0;

    private int id;
    private Pizza pizza;
    private String customer;
    private OrderStatus status;

    public Order(Pizza pizza, String customer) {
        this.id = ++counter;
        this.pizza = pizza;
        this.customer = customer;
        this.status = OrderStatus.NEW;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean pay() {
        if (status == OrderStatus.PAID) {
            System.out.println("Betalningen vägras: ordern är redan betald.");
            return false;
        }

        status = OrderStatus.PAID;
        return true;
    }

    public double getTotal() {
        return pizza.getPrice() + DELIVERY_FEE;
    }

    public int getId() {
        return id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", pizza=" + pizza +
                ", status=" + status +
                ", total=" + getTotal() +
                '}';
    }
}
