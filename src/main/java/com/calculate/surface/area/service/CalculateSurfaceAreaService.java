package com.calculate.surface.area.service;

import com.calculate.surface.area.model.SurfaceAreaResponse;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateSurfaceAreaService {

  public SurfaceAreaResponse calculateSurfaceArea(double radius) {
    double surfaceArea = Math.PI * radius * radius;
    return SurfaceAreaResponse.builder()
        .surfaceAreaValue(roundSurfaceArea(surfaceArea))
        .unit("meters squared")
        .build();
  }

  private double roundSurfaceArea(double surfaceArea) {
    return BigDecimal.valueOf(surfaceArea).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
