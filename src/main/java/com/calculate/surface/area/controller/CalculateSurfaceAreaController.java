package com.calculate.surface.area.controller;

import com.calculate.surface.area.model.SurfaceAreaResponse;
import com.calculate.surface.area.service.CalculateSurfaceAreaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateSurfaceAreaController {

  @Autowired private CalculateSurfaceAreaService service;

  @GetMapping("/calculateSurfaceArea/radius/{radius}")
  @ApiOperation(
      value = "Calculate the surface area of a circle based on the radius",
      notes =
          "This api will calculate the surface area of a circle based on the radius passed in the path param. The radius is in meters and must be a valid double. The surface area that is returned will be rounded to 2 decimal places.",
      response = SurfaceAreaResponse.class)
  public SurfaceAreaResponse calculateSurfaceArea(
      @ApiParam(value = "radius in meters", required = true) @PathVariable double radius) {
    return service.calculateSurfaceArea(radius);
  }
}
