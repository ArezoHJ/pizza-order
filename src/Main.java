public class Main {
/*
Enum OrderStatus — lägena ny och betald.

    Klass Pizza — namn och pris. Privata fält, konstruktor, getters, toString().

    Klass Order — har en pizza och en kund.

    Ett static final-fält för leveransavgiften
    En static räknare som ger varje order ett id
    pay() som kontrollerar status först och vägrar om ordern redan är betald
    getTotal() — pizzans pris plus leveransavgiften
    toString()


    Testa i Main

    Skapa en pizza och två ordrar. Skriv ut räknaren innan och efter. Betala den ena ordern två gånger. Skriv ut båda ordrarna.

    Ni är klara när
    Räknaren står på 0 innan första ordern
    Ordrarna får id 1 och 2
    Andra betalningsförsöket vägras
    Totalpriset är pizzans pris plus avgiften
*/

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