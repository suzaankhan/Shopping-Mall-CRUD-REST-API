package com.shoppingmallmanagementgrp4.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class Suzaan_CustomerControllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testForRejectingNegativeIDGetRequest() throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.get("/customer/id?id=-5"))
		.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}
	
	@Test
	public void testForRejectingNull_IDGetREquest() throws Exception {
	    mockmvc.perform(MockMvcRequestBuilders.get("/customer/id?id="))
	            .andExpect(MockMvcResultMatchers.status().isBadRequest());
	}
	
}
