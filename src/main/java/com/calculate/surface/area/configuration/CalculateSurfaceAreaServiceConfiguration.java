package com.calculate.surface.area.configuration;

import com.calculate.surface.area.service.CalculateSurfaceAreaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculateSurfaceAreaServiceConfiguration {

  @Bean
  CalculateSurfaceAreaService calculateSurfaceAreaService() {
    return new CalculateSurfaceAreaService();
  }
}
