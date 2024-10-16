package com.e.comerce.project.product;

import com.e.comerce.project.product.web.ProductInput;
import jakarta.persistence.*;
import lombok.*;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = PRIVATE)
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String productId;

    private String artist;

    private Integer year;

    private String album;

    private Integer price;

    private String store;

    private String thumb;

    private String date;

    static Product of(ProductInput input) {
        return new Product(null, input.getArtist(), input.getYear(), input.getAlbum(), input.getPrice(), input.getStore(), input.getThumb(), input.getDate());
    }

}
