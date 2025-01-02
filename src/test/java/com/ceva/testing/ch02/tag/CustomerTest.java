package com.ceva.testing.ch02.tag;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Tag("individual")
public class CustomerTest {
    private static final String CUSTOMER_NAME  = "John Smith";

    @Test
    void testCustomer(){
        Customer customer = new Customer(CUSTOMER_NAME);
        assertEquals("John Smith", customer.getName());
    }
}
