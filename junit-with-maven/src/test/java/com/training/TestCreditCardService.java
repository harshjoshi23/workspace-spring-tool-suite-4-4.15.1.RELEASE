package com.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCreditCardService {
	
	CrediCardService service;
	// Before all and after all
	// Har test ke pehele run hoga 
	@BeforeEach
	void init() {
		service= new CrediCardService();
	}

	@Test
	@DisplayName(value="Test is valid method return true for cardNumber 922 and for other cards false")
	void testIsValid() {
		
		assertAll("Testing isValid Method",
				() -> assertEquals(true, service.isValid(922)),
				() -> assertEquals(false, service.isValid(925))
				);
		
	}
	
	@Test
	@DisplayName(value="get credit limit method returns 500000 for card Numbers greater than 99999 and "
			+ "for others its 600000")
	void testGetCreditLimit() {
		
		assertAll("Testing getCredit Limit Method",
				// Lamda equals to 
				// if getCreditLimit > 99999 then return 500000 else 600000
				
				() -> assertEquals(500000, service.getCreditLimit(999999)),
				() -> assertEquals(600000, service.getCreditLimit(99999))
				);

	}
}
