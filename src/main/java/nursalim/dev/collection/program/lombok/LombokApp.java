package nursalim.dev.collection.program.lombok;

public class LombokApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("ns");
        customer.setName("Nursalim");
        customer.setEmail("nursalim.me@gmail.com");
        System.out.println(customer);

        Customer customer1 = new Customer("aa", "Andi Aman", "Aaa");
        System.out.println(customer1);

        Customer customerBuilder = Customer.builder()
                .id("ag")
                .name("Asal garut")
                .email("email@mail.com")
                .build();

        System.out.println(customerBuilder);
    }
}
