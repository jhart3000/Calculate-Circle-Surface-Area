package com.calculate.surface.area.service;

import com.calculate.surface.area.model.SurfaceAreaResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class CalculateSurfaceAreaServiceTest {

  private CalculateSurfaceAreaService service;

  @BeforeEach
  void setUp() {
    service = new CalculateSurfaceAreaService();
  }

  @Test
  void shouldReturnSurfaceAreResponse() {
    SurfaceAreaResponse response = service.calculateSurfaceArea(1.0);
    assertThat(response).isNotNull();
    assertThat(response.getSurfaceAreaValue()).isEqualTo(3.14);
  }
}
