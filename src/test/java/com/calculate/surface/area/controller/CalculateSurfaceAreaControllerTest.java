package com.calculate.surface.area.controller;

import com.calculate.surface.area.model.SurfaceAreaResponse;
import com.calculate.surface.area.service.CalculateSurfaceAreaService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class CalculateSurfaceAreaControllerTest {

  private final double SURFACE_AREA = 3.14;

  @Autowired private MockMvc mvc;

  @MockBean private CalculateSurfaceAreaService service;

  @Test
  void shouldReturnSurfaceAreaResponse() throws Exception {
    given(service.calculateSurfaceArea(anyDouble())).willReturn(buildSurfaceAreaResponse());
    mvc.perform(get("/calculateSurfaceArea/radius/1"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.surfaceAreaValue", Matchers.is(SURFACE_AREA)));
  }

  private SurfaceAreaResponse buildSurfaceAreaResponse() {
    return SurfaceAreaResponse.builder()
        .surfaceAreaValue(SURFACE_AREA)
        .unit("meters squared")
        .build();
  }
}
