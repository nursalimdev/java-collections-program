package nursalim.dev.collection.program.optional;

import java.util.Optional;

public class OptionalApp {
    public void nullCheck(Customer customer){
//        old way
//        String name = customer.getName();
//        if(name == null){
//            name = "";
//        }

        // using optional
        String name = Optional.ofNullable(customer.getName())
                .orElse("");
    }

    public void ifLogic(CustomerRepository repository){
        Customer customer = repository.findById("id");
        if(customer == null){
            repository.createNew();
        }
    }
}
