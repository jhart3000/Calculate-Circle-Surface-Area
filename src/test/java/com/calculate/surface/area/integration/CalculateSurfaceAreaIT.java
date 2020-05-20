package com.calculate.surface.area.integration;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class CalculateSurfaceAreaIT {

  @Autowired private MockMvc mvc;

  @Test
  void shouldReturnSurfaceAreaResponse() throws Exception {
    mvc.perform(get("/calculateSurfaceArea/radius/1"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.surfaceAreaValue", Matchers.is(3.14)))
        .andExpect(jsonPath("$.unit", Matchers.is("meters squared")));
  }
}
