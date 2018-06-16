package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import config.MvcConfig;
import config.ServiceConfig;
import config.WebAppInitializer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import utils.TestUtils;
import vo.City;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebAppInitializer.class, MvcConfig.class, ServiceConfig.class})
@WebAppConfiguration
@Configuration
public class CityControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
            .build();
    }

    @Test
    public void addCity() throws Exception {
        mockMvc.perform(post("/city")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(TestUtils.asJsonString(new City(1, "Rostov"))))
            .andExpect(status().is2xxSuccessful());// TODO: 17.06.18 при 404 он выдаст 200 и пройдет успешно. Почему?
    }

    @Test
    public void getCity() throws Exception {
        mockMvc.perform(get("/city/{id}", 1))
            .andExpect(status().is2xxSuccessful())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(1)));
    }

    @Test
    public void deleteCity() throws Exception {
        mockMvc.perform(delete("/city/{id}", 1)).andExpect(status().is2xxSuccessful());
    }

    @Test
    public void updateCity() throws Exception {
        mockMvc.perform(put("/city")
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .content(TestUtils.asJsonString(new City(1, "Rostov"))))
            .andExpect(status().is2xxSuccessful());
    }
}
