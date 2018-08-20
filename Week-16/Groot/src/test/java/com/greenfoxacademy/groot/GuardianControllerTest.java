package com.greenfoxacademy.groot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testWithParameter() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/groot?message=lalala").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expected = "{\"received\":\"lalala\", \"translated\": \"I am Groot\"}";
        MockHttpServletResponse response = result.getResponse();

        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),true);
        assertEquals(HttpStatus.CREATED.value(), response.getStatus());

    }


    @Test
    public void testWithoutParameter() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/groot").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expected = "{\"error\":\"I am Groot\"}";
        MockHttpServletResponse response = result.getResponse();

        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),true);
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
    }

}