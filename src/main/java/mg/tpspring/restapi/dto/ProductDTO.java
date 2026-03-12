package mg.tpspring.restapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;

    @NotBlank
    private String name;

    @Positive
    private double price;

}
   