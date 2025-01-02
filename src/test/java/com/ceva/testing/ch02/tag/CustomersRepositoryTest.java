package com.ceva.testing.ch02.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Tag("repository")
public class CustomersRepositoryTest {
    private String CUSTOMER_NAME = "John Smith";
    private CustomersRepository repository = new CustomersRepository();

    @Test
    void noExistence(){
        boolean exist = repository.contains("John Smith");
        assertFalse(exist);
    }

    @Test
    void testCustomerPersistence(){
        repository.persist(new Customer("John Smith"));

        assertTrue(repository.contains("John Smith"));
    }
}
