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

    public void nestedIfChecking(Customer customer){
        String country = Optional.ofNullable(customer.getAddress())
                .map(address -> address.getCountry())
                .orElse("Indonesia");

//        old way
//        String country = "Indonesia";
//        if(customer.getAddress() != null){
//            if(customer.getAddress().getCountry() != null){
//                country = customer.getAddress().getCountry();
//            }
//        }
    }

    public void checkAndThrowException(Customer customer){
        String name = Optional.ofNullable(customer.getName())
                .orElseThrow(() -> new IllegalArgumentException("Name can not null"));

//        old way
//        String name = customer.getName();
//        if(name == null){
//            throw new IllegalArgumentException("Name can not null");
//        }
    }

    public void ifCheckDoSomething(Customer customer){
        Optional.ofNullable(customer.getAddress())
                .map(address -> address.getCountry())
                .ifPresent(country -> System.out.println(country));

//        old way
//        if(customer.getAddress() != null){
//            if(customer.getAddress().getCountry() != null){
//                System.out.println(customer.getAddress().getCountry());
//            }
//        }
    }

    public void nestedObject(Customer customer){
        Long cashBalance = Optional.ofNullable(customer.getWallet())
                .map(wallet -> wallet.getBalance())
                .map(balance -> balance.getCashBalance())
                .orElse(0L);

//        old way
//        Long cashBalance = 0L;
//        if(customer.getWallet() != null){
//            if(customer.getWallet().getBalance() != null){
//                cashBalance = customer.getWallet().getBalance().getCashBalance();
//            }
//        }
    }

    public void ifFilter(Customer customer){
        Long bonus = Optional.of(customer)
                .filter(value -> CustomerType.PREMIUM.equals(value.getType()))
                .map(value2 -> value2.getWallet())
                .map(wallet -> wallet.getBalance())
                .map(balance -> balance.getCashBalance())
                .map(cashBalance -> cashBalance * 10/100)
                .orElse(0L);

        // Long bonus = 0L;
        if(CustomerType.PREMIUM.equals(customer.getType())){
            if(customer.getWallet() != null){
                if(customer.getWallet().getBalance() != null){
                    bonus = customer.getWallet().getBalance().getCashBalance() * 10/100;
                }
            }
        }
    }


}
