package com.calculate.surface.area.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SurfaceAreaResponse {

  @ApiModelProperty(example = "2")
  private double surfaceAreaValue;

  @ApiModelProperty(example = "meters squared")
  private String unit;
}
