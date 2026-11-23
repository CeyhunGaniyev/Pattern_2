package Lab5;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Customer customer = new Customer(19,7000,"00000",8);

        facade.buyCredit(customer.getUserId(), customer.getAge(),
                10000.8, customer.getExparience());
    }
}
