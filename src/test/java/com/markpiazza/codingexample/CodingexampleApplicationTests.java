package com.markpiazza.codingexample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodingexampleApplication.class)
@WebAppConfiguration
public class CodingexampleApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;


	@Before
	public void setup() {
		mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testIndex() throws Exception {
		mockMvc.perform(get("/")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("<html><body>Please navigate to /toDoItem</body></html>"))
				.andExpect(status().is2xxSuccessful());
	}

	@Test
	public void testGetItem() throws Exception {
		mockMvc.perform(get("/toDoItem/0")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}


	@Test
	public void testGetItems() throws Exception {
		mockMvc.perform(get("/toDoItem")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void testPostItem() throws Exception {
		// expects NOT IMPLEMENTED so the test fails when it gets implemented
		mockMvc.perform(post("/toDoItem")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"title\":\"My first title item\",\"description\":\"Some description\",\"dueDate\":0}"))
				.andExpect(status().isNotImplemented());
	}

	@Test
	public void testPatchItem() throws Exception {
		// expects NOT IMPLEMENTED so the test fails when it gets implemented
		mockMvc.perform(patch("/toDoItem/0")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"title\":\"My FIRST title item\",\"description\":\"Some description\",\"dueDate\":11111110}"))
				.andExpect(status().isNotImplemented());
	}

}
