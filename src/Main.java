public class Main {

    public static void main(String[] args) {
        System.out.println("Räknare innan första order: " + Order.getCounter());

        Pizza pizza = new Pizza("Itali", 120.0);

        Order order1 = new Order(pizza, "Anna");
        Order order2 = new Order(pizza, "Lars");

        System.out.println("Räknare efter skapandet: " + Order.getCounter());
        System.out.println("Order 1 betald: " + order1.pay());
        System.out.println("Order 1 betald igen: " + order1.pay());

        System.out.println("Total order 1: " + order1.getTotal());
        System.out.println("Total order 2: " + order2.getTotal());
        System.out.println("Order 1: " + order1);
        System.out.println("Order 2: " + order2);
    }
}