package mx.edu.utez.ventas.model.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 15)
    private String name;
    @Column(unique = true, nullable = false, length = 50)
    private String category;
    @Column(unique = true, nullable = false, length = 50)
    private Double price;
    @Column(unique = true, nullable = false, length = 15)
    private Boolean availability;


}
