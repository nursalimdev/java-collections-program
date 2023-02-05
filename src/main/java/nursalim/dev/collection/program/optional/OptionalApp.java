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
        Customer findById = Optional.ofNullable(repository.findById("id")).orElseGet(() -> repository.createNew());
//        old way
//        Customer customer = repository.findById("id");
//        if(customer == null){
//            customer = repository.createNew();
//        }
    }

    public void operationToNullValue(Customer customer){
        String nameUpper = Optional.ofNullable(customer.getName())
                .map(name -> name.toUpperCase())
                .orElse("");

//        old way
//        String nameUpper = customer.getName();
//        if(nameUpper != null){
//            nameUpper = nameUpper.toUpperCase();
//        }else{
//            nameUpper = "";
//        }
    }
}
