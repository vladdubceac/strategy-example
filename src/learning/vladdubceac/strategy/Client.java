package learning.vladdubceac.strategy;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); // the context;

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by Paypal
        cart.pay(new PaypalStrategy("dubceacvlad@gmail.com", "myPassword"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("vlad dubceac", "1234567890987654", "012", "03/25"));
    }
}
