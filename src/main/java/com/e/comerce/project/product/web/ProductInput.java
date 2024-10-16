package com.e.comerce.project.product.web;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ProductInput {

    @NotBlank
    private String artist;

    @NonNull
    private Integer year;

    @NotBlank
    private String album;

    @NonNull
    private Integer price;

    @NotBlank
    private String store;

    @NotBlank
    private String thumb;

    @NotBlank
    private String date;

}
