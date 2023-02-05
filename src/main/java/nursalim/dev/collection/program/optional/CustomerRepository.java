package nursalim.dev.collection.program.optional;

public interface CustomerRepository {
    Customer findById(String id);

    Customer createNew();
}
