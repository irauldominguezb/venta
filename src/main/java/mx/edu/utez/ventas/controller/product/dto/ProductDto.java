package mx.edu.utez.ventas.controller.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.ventas.model.products.Product;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDto {
    private Long id;
    @NotEmpty(message = "Campo obligatorio")
    @Size(min = 3, max = 50)
    private String name;
    @NotEmpty(message = "Campo obligatorio")
    private String category;
    @NotEmpty(message = "Campo obligatorio")
    private Double price;
    @NotEmpty(message = "Campo obligatorio")
    private Boolean availability = true;

    public Product getProduct(){
        return new Product(
                getId(),
                getName(),
                getCategory(),
                getPrice(),
                getAvailability()
        );
    }
}
