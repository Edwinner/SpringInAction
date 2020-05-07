package com.sia.tacocloud;
import java.util.Date;
import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

  private Long id;

  private Date createdAt;
  @NotNull
  @Size(min=5, message = "Name must be at least 5 characters long")
  private String name;
  @NotNull(message = "You must choose at least 1 ingredient")
  private List<String> ingredients;

}
